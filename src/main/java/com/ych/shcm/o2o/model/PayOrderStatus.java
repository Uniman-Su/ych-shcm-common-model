package com.ych.shcm.o2o.model;

import com.ych.core.model.IntValueHolder;

/**
 * 支付单状态
 *
 * Created by U on 2017/7/6.
 */
public enum PayOrderStatus implements IntValueHolder<PayOrderStatus> {

    /**
     * 未支付
     */
    UNPAYED(0),

    /**
     * 已支付
     */
    PAYED(1),

    /**
     * 支付失败
     */
    FAILED(2),

    /**
     * 已取消
     */
    CANCELED(3);

    private int value;

    PayOrderStatus(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }
}
