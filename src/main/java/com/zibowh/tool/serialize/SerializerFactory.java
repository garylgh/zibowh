package com.zibowh.tool.serialize;

import com.xiaoju.mt.oppenheimer.constants.AppConstants;

/**
 * 序列化工具生产工厂
 * Created by niujunlong on 17/3/21.
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
