package com.zibowh.util;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.*;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.TrustStrategy;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HttpUtil {

    private static Logger logger = LoggerFactory.getLogger(HttpUtil.class);

    private static CloseableHttpClient httpClient = HttpClientBuilder.create().setMaxConnTotal(500).setMaxConnPerRoute(500).build();

    private static CloseableHttpClient httpsClient = null;

    static {
        try {
            SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy() {
                public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                    return true;
                }
            }).build();
            SSLConnectionSocketFactory sslFactory = new SSLConnectionSocketFactory(sslContext);
            httpsClient = HttpClientBuilder.create().setSSLSocketFactory(sslFactory).setMaxConnTotal(500).setMaxConnPerRoute(500).build();
        } catch (Exception e) {
        }
    }

    /**
     * 执行post 请求
     *
     * @param postUrl
     * @param headers
     * @param httpEntity 提交实体
     * @return
     */
    public static String doPost(String postUrl, List<Header> headers, HttpEntity httpEntity,
                                RequestConfig requestConfig) {
        if (StringUtils.isBlank(postUrl)) {
            throw new RuntimeException("postUrl is null");
        }
        HttpPost request = new HttpPost();
        request.setConfig(requestConfig);
        request.setURI(URI.create(postUrl));
        if (headers != null && !headers.isEmpty()) {
            for (Header header : headers) {
                request.addHeader(header);
            }
        }
        request.setEntity(httpEntity);
        return consumeResponse(doHttpRequest(request));
    }

    /**
     * 执行post 请求
     *
     * @param postUrl
     * @param param   提交参数
     * @return
     */
    public static String doPost(String postUrl, Map<String, String> param) {
        List<NameValuePair> parameters = new ArrayList<NameValuePair>(param.size());
        for (Map.Entry<String, String> entry : param.entrySet()) {
            parameters.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
        }
        try {
            return doPost(postUrl, null, new UrlEncodedFormEntity(parameters, "UTF-8"), null);
        } catch (UnsupportedEncodingException e) {
            logger.error("HttpUtil---doPost--error", e);
        }
        return null;
    }


    /**
     * 执行post 请求
     *
     * @param postUrl
     * @param content StringEntity 提交参数
     * @return
     */
    public static String doPost(String postUrl, String content) {
        try {
            return doPost(postUrl, null, new StringEntity(content), null);
        } catch (UnsupportedEncodingException e) {
            logger.error("HttpUtil---doPost--error", e);
        }
        return null;
    }


    /**
     * 执行post 请求
     *
     * @param postUrl
     * @param headers
     * @param requestConfig 提交实体
     * @return
     */
    public static String doPost(String postUrl, List<Header> headers, String content,
                                RequestConfig requestConfig) {
        if (StringUtils.isBlank(postUrl)) {
            throw new RuntimeException("postUrl is null");
        }
        HttpPost request = new HttpPost();
        request.setConfig(requestConfig);
        request.setURI(URI.create(postUrl));
        if (headers != null && !headers.isEmpty()) {
            for (Header header : headers) {
                request.addHeader(header);
            }
        }
        try {
            request.setEntity(new StringEntity(content));
        } catch (UnsupportedEncodingException e) {
            logger.error("HttpUtil---doPost--error", e);
        }
        return consumeResponse(doHttpRequest(request));
    }


    /**
     * 执行post 请求
     *
     * @param postUrl
     * @param httpEntity 请求实体
     * @return
     */
    public static String doPost(String postUrl, HttpEntity httpEntity) {
        return doPost(postUrl, null, httpEntity, null);
    }

    /**
     * 执行get 请求
     *
     * @param getUrl
     * @return
     */
    public static String doGet(String getUrl) {

        return doGet(getUrl, null, null);
    }


    /**
     * 执行 get 请求
     *
     * @param url
     * @param headers
     * @return
     */
    public static String doGet(String url, List<Header> headers, RequestConfig requestConfig) {
        if (StringUtils.isBlank(url)) {
            throw new RuntimeException("getUrl is null");
        }
        HttpGet httpGet = new HttpGet(url);
        httpGet.setConfig(requestConfig);
        if (headers != null && !headers.isEmpty()) {
            for (Header header : headers) {
                httpGet.addHeader(header);
            }
        }
        return consumeResponse(doHttpRequest(httpGet));
    }

    /**
     * 执行 get 请求
     *
     * @param url
     * @param headers
     * @return
     */
    public static <T> T doGet(String url, List<Header> headers, RequestConfig requestConfig, Class<T> clazz) {
        if (StringUtils.isBlank(url)) {
            throw new RuntimeException("getUrl is null");
        }
        HttpGet httpGet = new HttpGet(url);
        httpGet.setConfig(requestConfig);
        if (headers != null && !headers.isEmpty()) {
            for (Header header : headers) {
                httpGet.addHeader(header);
            }
        }
        return serialize2object(consumeResponse(doHttpRequest(httpGet)), clazz);
    }

    /**
     * 执行get 请求
     *
     * @param getUrl
     * @return
     */
    public static <T> T doGet(String getUrl, Class<T> clazz) {
        return serialize2object(doGet(getUrl, null, null), clazz);
    }

    /**
     * 执行post 请求
     *
     * @param postUrl
     * @param httpEntity 请求实体
     * @return
     */
    public static <T> T doPost(String postUrl, HttpEntity httpEntity, Class<T> clazz) {
        return serialize2object(doPost(postUrl, null, httpEntity, null), clazz);
    }

    /**
     * 执行post 请求
     *
     * @param postUrl
     * @param param   提交参数
     * @return
     */
    public static <T> T doPost(String postUrl, Map<String, String> param, Class<T> clazz) {

        return serialize2object(doPost(postUrl, param), clazz);
    }

    /**
     * 执行post 请求
     *
     * @param postUrl
     * @param content StringEntity 提交参数
     * @return
     */
    public static <T> T doPost(String postUrl, String content, Class<T> clazz) {

        return serialize2object(doPost(postUrl, content), clazz);
    }

    /**
     * 执行post 请求
     *
     * @param postUrl
     * @param headers
     * @param httpEntity 提交实体
     * @return
     */
    public static <T> T doPost(String postUrl, List<Header> headers, HttpEntity httpEntity,
                               RequestConfig requestConfig, Class<T> clazz) {
        return serialize2object(doPost(postUrl, headers, httpEntity, requestConfig), clazz);
    }

    /**
     * 执行post 请求
     *
     * @param postUrl
     * @param headers
     * @param content StringEntity 提交实体
     * @return
     */
    public static <T> T doPost(String postUrl, List<Header> headers, String content,
                               RequestConfig requestConfig, Class<T> clazz) {
        return serialize2object(doPost(postUrl, headers, content, requestConfig), clazz);
    }


    /**
     * 执行http 请求
     *
     * @param request
     * @return
     */
    public static CloseableHttpResponse doHttpRequest(HttpUriRequest request) {
        String url = request.getURI().toString();
        CloseableHttpResponse response = null;
        try {
            long beginTime = System.currentTimeMillis();
            if (request instanceof HttpRequestBase) {
                if (((HttpRequestBase) request).getConfig() == null) {
                    ((HttpRequestBase) request).setConfig(RequestConfig.custom().setConnectTimeout(5000).setSocketTimeout(10000).build());
                }
            }
            if (request.getURI().toString().startsWith("https:")) {
                response = httpsClient.execute(request);
            } else {
                response = httpClient.execute(request);
            }

            if (response != null) {
                long endTime = System.currentTimeMillis();
                int statusCode = response.getStatusLine().getStatusCode();
                if (statusCode == 200) {
                    logger.info("doHttpRequest success");
                } else {
                    logger.info("doHttpRequest failed");
                }
            }

        } catch (ClientProtocolException e) {
            logger.error("HttpUtil---doHttpRequest--error ：" + request.getURI(), e);
        } catch (IOException e) {
            logger.error("HttpUtil---doHttpRequest--error ：" + request.getURI(), e);
        }
        return response;
    }

    /**
     * 返回结果为JSON格式可直接序列化,fastjson
     *
     * @param entity
     * @param clazz
     * @return
     */
    private static <T> T serialize2object(String entity, Class<T> clazz) {
        return JSON.parseObject(entity, clazz);
    }


    /**
     * 消费http 请求
     *
     * @param response
     * @return
     */
    private static String consumeResponse(CloseableHttpResponse response) {
        if (response == null) {
            return null;
        }
        HttpEntity responseEntity = response.getEntity();
        try {
            if (response.getStatusLine().getStatusCode() == 200) {
                return EntityUtils.toString(responseEntity);
            } else {
                logger.error("HttpUtil---consumeResponse--error:" + EntityUtils.toString(responseEntity));
            }
        } catch (ParseException e) {
            logger.error("HttpUtil---consumeResponse--error", e);
        } catch (IOException e) {
            logger.error("HttpUtil---consumeResponse--error", e);
        } finally {
            try {
                response.close();
                EntityUtils.consume(responseEntity);
            } catch (IOException e) {
                logger.error("HttpUtil---consumeResponse--close--error", e);
            }
        }
        return null;
    }
}
