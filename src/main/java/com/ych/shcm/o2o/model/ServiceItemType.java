package com.ych.shcm.o2o.model;

import com.ych.core.model.IntValueHolder;

/**
 * 服务项目类型
 * Created by mxp on 2017/7/13.
 */
public enum ServiceItemType implements IntValueHolder<ServiceItemType> {

    /**
     * 普通
     */
    NORMAL(0),

    /**
     * 机油
     */
    ENGINEOIL(1);

    private int value;

    ServiceItemType(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

}
