package com.ych.shcm.o2o.model;

import com.ych.core.model.IWithCreateTime;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 车辆实体
 * <p>
 * Created by U on 2017/7/10.
 */
public class Car implements Serializable, IWithCreateTime {

    private static final long serialVersionUID = -5817149275074526215L;

    /**
     * ID
     */
    private BigDecimal id;

    /**
     * VIN
     */
    private String vin;

    /**
     * 车型ID
     */
    private BigDecimal modelId;

    /**
     * 生效时间
     */
    private Date effectTime;

    /**
     * 过期时间
     */
    private Date expires;

    /**
     * 首次保养订单ID
     */
    private BigDecimal firstOrderId;

    /**
     * 首次保养时间
     */
    private Date firstMaintenanceTime;

    /**
     * 首次保养订单状态
     */
    private OrderStatus firstOrderStatus;

    /**
     * 首次保养金额
     */
    private BigDecimal firstMaintenanceMoney;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 上牌时间
     */
    private Date registrationTime;

    /**
     * 里程
     */
    private Long mileage;

    /**
     * 车型
     */
    private CarModel carModel;

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
     * @return VIN
     */
    public String getVin() {
        return vin;
    }

    /**
     * @param vin
     *         VIN
     */
    public void setVin(String vin) {
        this.vin = vin;
    }

    /**
     * @return 车型ID
     */
    public BigDecimal getModelId() {
        return modelId;
    }

    /**
     * @param modelId
     *         车型ID
     */
    public void setModelId(BigDecimal modelId) {
        this.modelId = modelId;
    }

    /**
     * @return 生效时间
     */
    public Date getEffectTime() {
        return effectTime;
    }

    /**
     * @param effectTime
     *         生效时间
     */
    public void setEffectTime(Date effectTime) {
        this.effectTime = effectTime;
    }

    /**
     * @return 过期时间
     */
    public Date getExpires() {
        return expires;
    }

    /**
     * @param expires
     *         过期时间
     */
    public void setExpires(Date expires) {
        this.expires = expires;
    }

    /**
     * @return 首次保养订单ID
     */
    public BigDecimal getFirstOrderId() {
        return firstOrderId;
    }

    /**
     * 首次保养订单ID
     *
     * @param firstOrderId
     */
    public void setFirstOrderId(BigDecimal firstOrderId) {
        this.firstOrderId = firstOrderId;
    }

    /**
     * @return 首次保养时间
     */
    public Date getFirstMaintenanceTime() {
        return firstMaintenanceTime;
    }

    /**
     * @param firstMaintenanceTime
     *         首次保养时间
     */
    public void setFirstMaintenanceTime(Date firstMaintenanceTime) {
        this.firstMaintenanceTime = firstMaintenanceTime;
    }

    /**
     * @return 首次保养订单状态
     */
    public OrderStatus getFirstOrderStatus() {
        return firstOrderStatus;
    }

    /**
     * @param firstOrderStatus
     *         首次保养订单状态
     */
    public void setFirstOrderStatus(OrderStatus firstOrderStatus) {
        this.firstOrderStatus = firstOrderStatus;
    }

    /**
     * @return 首次保养金额
     */
    public BigDecimal getFirstMaintenanceMoney() {
        return firstMaintenanceMoney;
    }

    /**
     * @param firstMaintenanceMoney
     *         首次保养金额
     */
    public void setFirstMaintenanceMoney(BigDecimal firstMaintenanceMoney) {
        this.firstMaintenanceMoney = firstMaintenanceMoney;
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
     * 里程
     *
     * @return 里程
     */
    public Long getMileage() {
        return mileage;
    }

    /**
     * 里程
     *
     * @param mileage
     *         里程
     */
    public void setMileage(Long mileage) {
        this.mileage = mileage;
    }

    /**
     * 上牌时间
     *
     * @return 上牌时间
     */
    public Date getRegistrationTime() {
        return registrationTime;
    }

    /**
     * 上牌时间
     *
     * @param registrationTime
     *         上牌时间
     */
    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    /**
     * @return 车型
     */
    public CarModel getCarModel() {
        return carModel;
    }

    /**
     * @param carModel
     *         车型
     */
    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
