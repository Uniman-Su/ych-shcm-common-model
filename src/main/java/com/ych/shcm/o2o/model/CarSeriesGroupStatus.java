package com.ych.shcm.o2o.model;

import com.ych.core.model.IntValueHolder;

/**
 * 车型组状态
 *
 * Created by U on 2017/7/6.
 */
public enum CarSeriesGroupStatus implements IntValueHolder<CarSeriesGroupStatus> {

    /**
     * 启用状态
     */
    ENABLED(0),

    /**
     * 禁用状态
     */
    DISABLED(1);

    private int value;

    CarSeriesGroupStatus(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }
}
