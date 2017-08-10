package com.ych.shcm.o2o.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 车辆曾经归属的用户信息
 * <p>
 * Created by U on 2017/7/10.
 */
public class CarUserHistory implements Serializable {

    private static final long serialVersionUID = 7730809510702973610L;

    /**
     * ID
     */
    private BigDecimal id;

    /**
     * 车辆ID
     */
    private BigDecimal carId;

    /**
     * 旧的用户ID
     */
    private BigDecimal oldUserId;

    /**
     * 用户ID
     */
    private BigDecimal userId;

    /**
     * 变更时间
     */
    private Date changeTime;

    /**
     * 车辆信息
     */
    private Car car;

    /**
     * 旧的用户
     */
    private User oldUser;

    /**
     * 新的用户
     */
    private User user;

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

    /**
     * @return 旧的用户ID
     */
    public BigDecimal getOldUserId() {
        return oldUserId;
    }

    /**
     * @param oldUserId
     *         旧的用户ID
     */
    public void setOldUserId(BigDecimal oldUserId) {
        this.oldUserId = oldUserId;
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
     * @return 变更时间
     */
    public Date getChangeTime() {
        return changeTime;
    }

    /**
     * @param changeTime
     *         变更时间
     */
    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
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

    /**
     * @return 旧的用户
     */
    public User getOldUser() {
        return oldUser;
    }

    /**
     * @param oldUser
     *         旧的用户
     */
    public void setOldUser(User oldUser) {
        this.oldUser = oldUser;
    }

    /**
     * @return 新的用户
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user
     *         新的用户
     */
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
