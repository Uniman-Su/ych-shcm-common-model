package com.ych.shcm.o2o.event;

import com.ych.core.event.EntityModifiedEvent;
import com.ych.shcm.o2o.model.Order;

/**
 * 订单状态变更事件
 */
public class OrderStatusChanged extends EntityModifiedEvent<Order> {

    private static final long serialVersionUID = -5448192137110060664L;

    public OrderStatusChanged(Order oldEntity, Order newEntity) {
        super(oldEntity, newEntity);
    }

    public OrderStatusChanged(Order oldEntity, Order newEntity, boolean isOriginal) {
        super(oldEntity, newEntity, isOriginal);
    }
}
