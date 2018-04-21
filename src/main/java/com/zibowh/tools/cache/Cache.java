package com.zibowh.tools.cache;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 通用缓存接口
 */
public interface Cache<T> {
    public static final Logger LOG = LogManager.getLogger(Cache.class);

    T getResource();

    void returnResource(T cache);

    Long del(String key);

    String setObj(String key, Object value);

    String set(String key, String value);

    <T> T getObj(String key, Class<T> clazz);

    String get(String key);

    Boolean exists(String key);

    Long persist(String key);

    Long expire(String key, int seconds);

    Long pexpire(String key, long milliseconds);

    Long expireAt(String key, long unixTime);

    Long pexpireAt(String key, long millisecondsTimestamp);

    Long ttl(String key);

    Long pttl(final String key);

    Long setnxObj(String key, Object value);

    Long setnx(String key, String value);

    String setex(String key, int seconds, Object value);


    Long decrBy(String key, long integer);

    Long decr(String key);

    Long incrBy(String key, long integer);

    Long incr(String key);

    Long lPush(String key, String value);

    Long lPushObj(String key, Object value);

    String rPop(String key);

    <T> T rPopObj(String key, Class<T> clazz);

    Double zscore(final String key, final String member);

    Long zcard(final String key);

    Long zcount(final String key, final double min, final double max);

    Long zadd(final String key, final double score, final String member);

    interface CacheCallback<T, R> {

        R callback(T cache) throws InterruptedException;
    }

}
