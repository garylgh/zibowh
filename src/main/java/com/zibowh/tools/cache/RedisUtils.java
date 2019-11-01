package com.zibowh.tools.cache;

import com.zibowh.config.RedisConfig;
import com.zibowh.constants.AppConstants;
import com.zibowh.tools.serializer.Serializer;
import com.zibowh.tools.serializer.SerializerFactory;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.util.SafeEncoder;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * redis工具类,使用中若发生异常,则抛出RedisException
 */
@Service
public class RedisUtils extends AbstractRedisCache<Jedis> implements Cache<Jedis> {
    private JedisPool jedisPool;
    @Resource
    private RedisConfig redisConfig;

    private Serializer serializer;


    @Override
    public Jedis getResource() {
        return this.jedisPool.getResource();
    }


    @PostConstruct
    private void init() {
        try {
            JedisPoolConfig jedisConfig = new JedisPoolConfig();
            LOG.info("redis 初始化配置 {}" + redisConfig);
//            jedisConfig.setMaxTotal(redisConfig.getMaxTotal());
//            jedisConfig.setMaxIdle(300);
//            jedisConfig.setMinIdle(0);
            jedisConfig.setTestOnBorrow(true);
//            jedisConfig.setMaxWaitMillis(redisConfig.getMaxWaitMillis());
            jedisPool = new JedisPool(jedisConfig,
                    redisConfig.getHost(), redisConfig.getPort());

            serializer = SerializerFactory.create(AppConstants.SerializerTypeEnum.valueOf(redisConfig.getSeralizerType()));
        } catch (Exception e) {
            LOG.error("redis 初始化发生异常 {}", e.getMessage(), e);
        }
    }

    @Override
    public void returnResource(Jedis cache) {
        cache.close();
    }

    @Override
    public String setObj(final String key, final Object value) {
        return doCache(new CacheCallback<Jedis, String>() {
            @Override
            public String callback(Jedis cache) {
                return cache.set(SafeEncoder.encode(key), serializer.serialize(value));
            }
        });
    }


    @Override
    public Long del(final String key) {
        return doCache(new CacheCallback<Jedis, Long>() {
            @Override
            public Long callback(Jedis cache) {
                return cache.del(key);
            }
        });
    }

    @Override
    public String set(final String key, final String value) {
        return doCache(new CacheCallback<Jedis, String>() {
            @Override
            public String callback(Jedis cache) {
                return cache.set(key, value);
            }
        });
    }


    @Override
    public <T> T getObj(final String key, final Class<T> clazz) {
        return doCache(new CacheCallback<Jedis, T>() {
            @Override
            public T callback(Jedis cache) {
                byte[] bytes = cache.get(SafeEncoder.encode(key));
                if (ArrayUtils.isEmpty(bytes)) {
                    return null;
                } else {
                    return serializer.deserialize(bytes, clazz);
                }
            }
        });
    }

    @Override
    public String get(final String key) {
        return doCache(new CacheCallback<Jedis, String>() {
            @Override
            public String callback(Jedis cache) {
                return cache.get(key);
            }
        });
    }

    @Override
    public Boolean exists(final String key) {
        return doCache(new CacheCallback<Jedis, Boolean>() {
            @Override
            public Boolean callback(Jedis cache) {
                return cache.exists(SafeEncoder.encode(key));
            }
        });
    }

    @Override
    public Long persist(final String key) {
        return doCache(new CacheCallback<Jedis, Long>() {
            @Override
            public Long callback(Jedis cache) {
                return cache.persist(SafeEncoder.encode(key));
            }
        });
    }

    @Override
    public Long expire(final String key, final int seconds) {
        return doCache(new CacheCallback<Jedis, Long>() {
            @Override
            public Long callback(Jedis cache) {
                return cache.expire(SafeEncoder.encode(key), seconds);
            }
        });
    }

    @Override
    public Long pexpire(final String key, final long milliseconds) {
        return doCache(new CacheCallback<Jedis, Long>() {
            @Override
            public Long callback(Jedis cache) {
                return cache.pexpire(SafeEncoder.encode(key), milliseconds);
            }
        });
    }

    @Override
    public Long expireAt(final String key, final long unixTime) {
        return doCache(new CacheCallback<Jedis, Long>() {
            @Override
            public Long callback(Jedis cache) {
                return cache.expireAt(SafeEncoder.encode(key), unixTime);
            }
        });
    }

    @Override
    public Long pexpireAt(final String key, final long millisecondsTimestamp) {
        return doCache(new CacheCallback<Jedis, Long>() {
            @Override
            public Long callback(Jedis cache) {
                return cache.pexpireAt(SafeEncoder.encode(key), millisecondsTimestamp);
            }
        });
    }

    @Override
    public Long ttl(final String key) {
        return doCache(new CacheCallback<Jedis, Long>() {
            @Override
            public Long callback(Jedis cache) {
                return cache.ttl(SafeEncoder.encode(key));
            }
        });
    }

    @Override
    public Long pttl(final String key) {
        return doCache(new CacheCallback<Jedis, Long>() {
            @Override
            public Long callback(Jedis cache) {
                return cache.pttl(SafeEncoder.encode(key));
            }
        });
    }

    @Override
    public Long setnxObj(final String key, final Object value) {
        return doCache(new CacheCallback<Jedis, Long>() {
            @Override
            public Long callback(Jedis cache) {
                return cache.setnx(SafeEncoder.encode(key), serializer.serialize(value));
            }
        });
    }

    @Override
    public String setex(final String key, final int seconds, final Object value) {
        return doCache(new CacheCallback<Jedis, String>() {
            @Override
            public String callback(Jedis cache) {
                return cache.setex(SafeEncoder.encode(key), seconds, serializer.serialize(value));
            }
        });
    }


    @Override
    public Long decrBy(final String key, final long integer) {
        return doCache(new CacheCallback<Jedis, Long>() {
            @Override
            public Long callback(Jedis cache) {
                return cache.decrBy(SafeEncoder.encode(key), integer);
            }
        });
    }

    @Override
    public Long decr(final String key) {
        return doCache(new CacheCallback<Jedis, Long>() {
            @Override
            public Long callback(Jedis cache) {
                return cache.decr(SafeEncoder.encode(key));
            }
        });
    }

    @Override
    public Long incrBy(final String key, final long integer) {
        return doCache(new CacheCallback<Jedis, Long>() {
            @Override
            public Long callback(Jedis cache) {
                return cache.incrBy(SafeEncoder.encode(key), integer);
            }
        });
    }

    @Override
    public Long incr(final String key) {
        return doCache(new CacheCallback<Jedis, Long>() {
            @Override
            public Long callback(Jedis cache) {
                return cache.incr(SafeEncoder.encode(key));
            }
        });
    }

    @Override
    public Long lPush(final String key, final String value) {
        return doCache(new CacheCallback<Jedis, Long>() {
            @Override
            public Long callback(Jedis cache) {
                return cache.lpush(key, value);
            }
        });
    }

    @Override
    public Long lPushObj(final String key, final Object value) {
        return doCache(new CacheCallback<Jedis, Long>() {
            @Override
            public Long callback(Jedis cache) {
                return cache.lpush(SafeEncoder.encode(key), serializer.serialize(value));
            }
        });
    }

    @Override
    public String rPop(final String key) {
        return doCache(new CacheCallback<Jedis, String>() {
            @Override
            public String callback(Jedis cache) {
                return cache.rpop(key);
            }
        });
    }

    @Override
    public <T> T rPopObj(final String key, final Class<T> clazz) {
        return doCache(new CacheCallback<Jedis, T>() {
            @Override
            public T callback(Jedis cache) {
                byte[] bytes = cache.rpop(SafeEncoder.encode(key));
                if (ArrayUtils.isEmpty(bytes)) {
                    return null;
                } else {
                    return serializer.deserialize(bytes, clazz);
                }
            }
        });
    }

    @Override
    public Double zscore(String key, String member) {
        return doCache(new CacheCallback<Jedis, Double>() {
            @Override
            public Double callback(Jedis cache) {
                return cache.zscore(key, member);
            }
        });
    }

    @Override
    public Long zcard(String key) {
        return doCache(new CacheCallback<Jedis, Long>() {
            @Override
            public Long callback(Jedis cache) {
                return cache.zcard(key);
            }
        });
    }

    @Override
    public Long zcount(String key, double min, double max) {
        return doCache(new CacheCallback<Jedis, Long>() {
            @Override
            public Long callback(Jedis cache) {
                return cache.zcount(key, min, max);
            }
        });
    }

    @Override
    public Long zadd(String key, double score, String member) {
        return doCache(new CacheCallback<Jedis, Long>() {
            @Override
            public Long callback(Jedis cache) {
                return cache.zadd(key, score, member);
            }
        });
    }

    @Override
    public Long setnx(final String key, final String value) {
        return doCache(new CacheCallback<Jedis, Long>() {
            @Override
            public Long callback(Jedis cache) {
                return cache.setnx(key, value);
            }
        });
    }

    /**
     * 尝试在second内对key加锁,锁的存在时间为second
     */
    public Long tryLockForSecond(final String key, final String value, final int second) {

        return doCache(new CacheCallback<Jedis, Long>() {
            @Override
            public Long callback(Jedis cache) throws InterruptedException {
                LOG.info("尝试对:{},进行加锁,限时:{}", key, second);
                long start = System.currentTimeMillis();
                Long isSuccess = 0L;

                do {
                    isSuccess = setnx(key, value);
                    LOG.info("锁:{},获取结果:{}", key, isSuccess);
                    if (isSuccess == 1) {
                        expire(key, second);
                        LOG.info("获取锁成功,{}", key);
                        break;
                    }
                    //休息300毫秒,再去尝试获取锁
                    Thread.sleep(300);
                } while (System.currentTimeMillis() - start < TimeUnit.SECONDS.toMillis(second));


                return isSuccess;
            }
        });
    }


    public Long tryLock(final String key, final String value, final int second) {

        Long isSuccess = setnx(key, value);
        expire(key, second);
        return isSuccess;
    }

    /**
     * 删除锁(key)
     */
    public Long unlock(String key) {
        return del(key);
    }


    public Long sadd(final String key, final String... members) {

        return doCache(new CacheCallback<Jedis, Long>() {
            @Override
            public Long callback(Jedis cache) {
                return cache.sadd(key, members);
            }
        });
    }


    public Boolean sismember(final String key, final String member) {
        return doCache(new CacheCallback<Jedis, Boolean>() {
            @Override
            public Boolean callback(Jedis cache) {
                return cache.sismember(key, member);
            }
        });
    }


    public Long srem(final String key, final String... members) {
        return doCache(new CacheCallback<Jedis, Long>() {
            @Override
            public Long callback(Jedis cache) {
                return cache.srem(key, members);
            }
        });
    }
}

