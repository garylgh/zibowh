package com.zibowh.tools.serializer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 序列化工具接口
 */
public interface Serializer {
    public static final Logger LOGGER = LogManager.getLogger(Serializer.class);

    /**
     * IO流初始化大小
     */
    public static final int DEFAULT_OBJECT_SIZE = 10 * 1024;

    /**
     * 序列化
     * @param object
     * @return
     */
    public byte[] serialize(Object object);

    /**
     * 反序列化
     * @param objectData
     * @param clazz
     * @param <T>
     * @return
     */
    public <T> T deserialize(byte[] objectData, Class<T> clazz);
}
