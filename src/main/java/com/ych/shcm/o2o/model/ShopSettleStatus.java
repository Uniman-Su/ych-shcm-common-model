package com.ych.shcm.o2o.model;

import com.ych.core.model.IntValueHolder;

/**
 * 店铺结算状态
 *
 * Created by U on 2017/7/6.
 */
public enum ShopSettleStatus implements IntValueHolder<ShopSettleStatus> {

    /**
     * 未结算
     */
    UNSETTLED(0),

    /**
     * 已结算
     */
    SETTLED(1);

    private int value;

    ShopSettleStatus(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }
}
