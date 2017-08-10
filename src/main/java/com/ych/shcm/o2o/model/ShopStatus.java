package com.ych.shcm.o2o.model;

import com.ych.core.model.IntValueHolder;

/**
 * 店铺状态
 *
 * Created by U on 2017/7/6.
 */
public enum ShopStatus implements IntValueHolder<ShopStatus> {

    /**
     * 正常
     */
    NORMAL(0),

    /**
     * 禁用状态
     */
    DISABLED(1);

    private int value;

    ShopStatus(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }
}
