package com.ych.shcm.o2o.model;

import com.ych.core.model.IntValueHolder;

/**
 * 退款单状态
 * <p>
 * Created by U on 2017/7/21.
 */
public enum RefundOrderStatus implements IntValueHolder<RefundOrderStatus> {

    /**
     * 创建
     */
    CREATED(0),

    /**
     * 退款申请成功
     */
    APPLY_SUCCESS(1),

    /**
     * 退款申请失败
     */
    APPLY_FAILED(2),

    /**
     * 退款成功
     */
    REFUND_SUCCESS(3),

    /**
     * 退款失败
     */
    REFUND_FAILED(4);

    private int value;

    RefundOrderStatus(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }
}
