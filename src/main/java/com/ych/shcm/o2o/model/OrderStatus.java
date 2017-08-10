package com.ych.shcm.o2o.model;

import com.ych.core.model.IntValueHolder;

/**
 * 订单状态
 * <p>
 * Created by U on 2017/7/6.
 */
public enum OrderStatus implements IntValueHolder<OrderStatus> {

    /**
     * 未支付
     */
    UNPAYED(1),

    /**
     * 已支付
     */
    PAYED(2),

    /**
     * 已服务(待确认)
     */
    SERVICED(3),

    /**
     * 已确认(待评价)
     */
    CONFIRMED(4),

    /**
     * 已完成
     */
    EVALUATED(5),

    /**
     * 已退款
     */
    REFUNDED(6),

    /**
     * 已取消
     */
    CANCELED(7),

    /**
     * 线下退款
     */
    REFUNDED_OFF_LINE(8);

    private int value;

    OrderStatus(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }
}
