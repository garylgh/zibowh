package com.zibowh.tools.serializer;

import com.caucho.hessian.io.Hessian2Input;
import com.caucho.hessian.io.Hessian2Output;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * Hession序列化工具
 * <waring>
 * ByteArrayOutputStream默认初始容量为DEFAULT_OBJECT_SIZE,若不够,调用内部grow方法自动扩容,但内部是copy方式
 * 若object过大,效率不高</waring>
 */
public class HessianSerializer implements Serializer {
    @Override
    public byte[] serialize(Object object) {
        Hessian2Output hessian2Output = null;
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream(DEFAULT_OBJECT_SIZE);
            hessian2Output = new Hessian2Output(bos);
            hessian2Output.writeObject(object);
            hessian2Output.flush();
            return bos.toByteArray();
        } catch (Exception e) {
            LOGGER.error("Hessian序列化异常", e.getMessage(), e);
            throw new RuntimeException("serializertype is invalid");
        } finally {
            closeHessionOutputStream(hessian2Output);
        }

    }

    private void closeHessionOutputStream(Hessian2Output hessian2Output) {
        try {
            if (null != hessian2Output) {
                hessian2Output.close();
            }
        } catch (Exception e) {
            LOGGER.error("关闭hession通道异常",e.getMessage(), e);
        }

    }

    private void closeHessionIutputStream(Hessian2Input hessian2Input) {
        try {
            if (null != hessian2Input) {
                hessian2Input.close();
            }
        } catch (Exception e) {
            LOGGER.error("关闭hession通道异常",e.getMessage(), e);
        }

    }

    @Override
    public <T> T deserialize(byte[] objectData, Class<T> clazz) {
        Hessian2Input hessianInput = null;
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(objectData);
            hessianInput = new Hessian2Input(bis);

            return (T) hessianInput.readObject();

        } catch (Exception e) {
            LOGGER.error("Hessian反序列化异常", e.getMessage(), e);
            throw new RuntimeException("serializertype is invalid");
        } finally {
            closeHessionIutputStream(hessianInput);
        }
    }
}
