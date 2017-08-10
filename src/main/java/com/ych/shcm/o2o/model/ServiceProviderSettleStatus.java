package com.ych.shcm.o2o.model;

import com.ych.core.model.IntValueHolder;

/**
 * 服务商结算状态
 *
 * Created by U on 2017/7/6.
 */
public enum ServiceProviderSettleStatus implements IntValueHolder<ServiceProviderSettleStatus> {

    /**
     * 未结算
     */
    UNSETTLED(0),

    /**
     * 已结算
     */
    SETTLED(1);

    private int value;

    ServiceProviderSettleStatus(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }
}
