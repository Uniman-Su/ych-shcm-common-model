package com.ych.shcm.o2o.model;

import java.io.Serializable;

/**
 * 表示位置的对象
 * <p>
 * Created by U on 2017/7/7.
 */
public class Position implements Serializable {

    /**
     * 表示空值的数值
     */
    public static final double NULL = -1000;

    /**
     * 经度
     */
    private double longitude = NULL;

    /**
     * 纬度
     */
    private double latitude = NULL;

    /**
     * 默认构造方法
     */
    public Position() {
    }

    /**
     * 构造方法
     *
     * @param longitude
     *         经度
     * @param latitude
     *         纬度
     */
    public Position(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    /**
     * @return 经度
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * @param longitude
     *         经度
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * @return 纬度
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * @param latitude
     *         纬度
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

}
