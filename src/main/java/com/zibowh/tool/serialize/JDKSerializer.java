package com.zibowh.tool.serialize;

import com.xiaoju.mt.oppenheimer.constants.ErrorConstants;
import com.xiaoju.mt.oppenheimer.exception.SerializerException;
import com.xiaoju.mt.oppenheimer.tool.Exceptions;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * JDK序列化工具
 * <waring> ByteArrayOutputStream默认初始容量为DEFAULT_OBJECT_SIZE,若不够,调用内部grow方法自动扩容,但内部是copy方式
 * 若object过大,效率不高</waring>
 * Created by niujunlong on 17/3/21.
 */
public class JDKSerializer implements Serializer {
    @Override
    public byte[] serialize(Object object) {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream(DEFAULT_OBJECT_SIZE);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(bos);
            objectOutputStream.writeObject(object);
            objectOutputStream.close();
            return bos.toByteArray();
        } catch (Exception e) {
            LOGGER.error("JDK序列化异常", e.getMessage(), e);
            throw Exceptions.buildException(SerializerException.class, null, ErrorConstants.Errors.SERIALIZE_ERROR,
                    "serializertype", "serializertype is invalid");
        }

    }


    @Override
    public <T> T deserialize(byte[] objectData, Class<T> clazz) {
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(objectData);
            ObjectInputStream objectInputStream = new ObjectInputStream(bis);
            T object = (T) objectInputStream.readObject();
            objectInputStream.close();
            return object;
        } catch (Exception e) {
            LOGGER.error("JDK反序列化异常", e.getMessage(), e);
            throw Exceptions.buildException(SerializerException.class, null, ErrorConstants.Errors.SERIALIZE_ERROR,
                    "serializertype", "serializertype is invalid");
        }
    }
}
