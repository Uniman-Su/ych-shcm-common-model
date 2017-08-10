package com.ych.shcm.o2o.model;

import com.ych.core.model.IntValueHolder;

/**
 * 服务项目状态
 * Created by mxp on 2017/7/13.
 */
public enum ServiceStatus implements IntValueHolder<ServiceStatus> {

    /**
     * 启用
     */
    ENABLED(0),

    /**
     * 禁用
     */
    DISABLED(1);

    private int value;

    ServiceStatus(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }
}
