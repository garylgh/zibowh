package com.zibowh.tools.serializer;


import com.zibowh.constants.AppConstants;

/**
 * 序列化工具生产工厂
 */
public class SerializerFactory {
    public static Serializer create(AppConstants.SerializerTypeEnum type) {
        switch (type) {
            case JDK:
                return new JDKSerializer();
            default:
                return new HessianSerializer();
        }
    }
}
