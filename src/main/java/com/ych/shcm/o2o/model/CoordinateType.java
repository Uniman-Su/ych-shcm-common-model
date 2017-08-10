package com.ych.shcm.o2o.model;

import com.ych.core.model.IntValueHolder;

/**
 * 坐标系
 *
 * Created by U on 2017/7/6.
 */
public enum CoordinateType implements IntValueHolder<CoordinateType> {

    /**
     * WGS84
     */
    WGS84(0);

    private int value;

    CoordinateType(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }
}
