package com.ych.shcm.o2o.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.ych.core.model.IWithCreateTime;

/**
 * 用户车辆信息
 * <p>
 * Created by U on 2017/7/10.
 */
public class UserCar implements Serializable, IWithCreateTime {

    private static final long serialVersionUID = 2344931575285373862L;

    /**
     * ID
     */
    private BigDecimal id;

    /**
     * 用户ID
     */
    private BigDecimal userId;

    /**
     * 车辆ID
     */
    private BigDecimal carId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 用户信息
     */
    private User user;

    /**
     * 车辆信息
     */
    private Car car;

    /**
     * @return ID
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * @param id
     *         ID
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * @return 用户ID
     */
    public BigDecimal getUserId() {
        return userId;
    }

    /**
     * @param userId
     *         用户ID
     */
    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    /**
     * @return 车辆ID
     */
    public BigDecimal getCarId() {
        return carId;
    }

    /**
     * @param carId
     *         车辆ID
     */
    public void setCarId(BigDecimal carId) {
        this.carId = carId;
    }

    @Override
    public Date getCreateTime() {
        return createTime;
    }

    @Override
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return 用户信息
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user
     *         用户信息
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return 车辆信息
     */
    public Car getCar() {
        return car;
    }

    /**
     * @param car
     *         车辆信息
     */
    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
