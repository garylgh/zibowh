package com.zibowh.tools.cache;

/**
 * Redis缓存模板,将获取资源,返回资源操作封装,具体缓存操作执行用户定义的callback方法
 */
public abstract class AbstractRedisCache<T> implements Cache<T> {


    protected <R> R doCache(CacheCallback<T, R> callback) {
        T cache = null;
        try {
            // 获取具体的缓存操作资源
            cache = getResource();
            // 调用具体的缓存操作
            return callback.callback(cache);
        } catch (Exception e) {
            LOG.error("redis 操作发生异常 {}", e.getMessage(), e);
            return null;
        } finally {
            close(cache);
        }
    }

    /**
     * 将redis返回资源池,调用实现类的returnResource方法
     *
     * @param cache
     */
    private void close(T cache) {
        try {
            if (cache != null) {
                //关闭缓存操作资源
                returnResource(cache);
            }
        } catch (Exception e) {
            LOG.error("redis 操作发生异常 {}", e.getMessage(), e);
        }
    }

}
