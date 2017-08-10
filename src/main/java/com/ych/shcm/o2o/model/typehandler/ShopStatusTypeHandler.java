package com.ych.shcm.o2o.model.typehandler;

import com.ych.core.mybatis.type.IntValueHolderTypeHandler;
import com.ych.shcm.o2o.model.ShopStatus;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

@MappedTypes(ShopStatus.class)
@MappedJdbcTypes(JdbcType.NUMERIC)
public class ShopStatusTypeHandler extends IntValueHolderTypeHandler<ShopStatus> {

    public ShopStatusTypeHandler(Class<ShopStatus> type) {
        super(type);
    }

}
