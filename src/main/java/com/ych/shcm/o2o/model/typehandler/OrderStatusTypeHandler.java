package com.ych.shcm.o2o.model.typehandler;

import com.ych.core.mybatis.type.IntValueHolderTypeHandler;
import com.ych.shcm.o2o.model.OrderStatus;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

@MappedTypes(OrderStatus.class)
@MappedJdbcTypes(JdbcType.NUMERIC)
public class OrderStatusTypeHandler extends IntValueHolderTypeHandler<OrderStatus> {

    public OrderStatusTypeHandler(Class<OrderStatus> type) {
        super(type);
    }

}
