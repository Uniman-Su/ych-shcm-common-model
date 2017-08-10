package com.ych.shcm.o2o.parameter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.ych.core.model.BasePaginableParameter;
import com.ych.shcm.o2o.model.OrderStatus;

/**
 * 查询车辆信息的参数
 * <p>
 * Created by U on 2017/7/10.
 */
public class QueryCarParameter extends BasePaginableParameter {

    /**
     * 品牌ID
     */
    private BigDecimal brandId;

    /**
     * 工厂ID
     */
    private BigDecimal factoryId;

    /**
     * 车系ID
     */
    private BigDecimal seriesId;

    /**
     * 年份
     */
    private Integer year;

    /**
     * 车型ID
     */
    private BigDecimal modelId;

    /**
     * VIN码
     */
    private String vin;

    /**
     * 生效时间起始
     */
    private Date effectTimeBegin;

    /**
     * 生效时间结束
     */
    private Date effectTimeEnd;

    /**
     * 过期时间起始
     */
    private Date expiresBegin;

    /**
     * 过期时间结束
     */
    private Date expiresEnd;

    /**
     * 首次保养时间起始
     */
    private Date firstMaintenanceTimeBegin;

    /**
     * 首次保养时间结束
     */
    private Date firstMaintenanceTimeEnd;

    /**
     * 首次保养订单状态
     */
    private List<OrderStatus> firstOrderStatuses;

    /**
     * @return 品牌ID
     */
    public BigDecimal getBrandId() {
        return brandId;
    }

    /**
     * @param brandId
     *         品牌ID
     */
    public void setBrandId(BigDecimal brandId) {
        this.brandId = brandId;
    }

    /**
     * @return 工厂ID
     */
    public BigDecimal getFactoryId() {
        return factoryId;
    }

    /**
     * @param factoryId
     *         工厂ID
     */
    public void setFactoryId(BigDecimal factoryId) {
        this.factoryId = factoryId;
    }

    /**
     * @return 车系ID
     */
    public BigDecimal getSeriesId() {
        return seriesId;
    }

    /**
     * @param seriesId
     *         车系ID
     */
    public void setSeriesId(BigDecimal seriesId) {
        this.seriesId = seriesId;
    }

    /**
     * @return 年份
     */
    public Integer getYear() {
        return year;
    }

    /**
     * @param year
     *         年份
     */
    public void setYear(Integer year) {
        this.year = year;
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
     * @return VIN码
     */
    public String getVin() {
        return vin;
    }

    /**
     * @param vin
     *         VIN码
     */
    public void setVin(String vin) {
        this.vin = vin;
    }

    /**
     * @return 生效时间起始
     */
    public Date getEffectTimeBegin() {
        return effectTimeBegin;
    }

    /**
     * @param effectTimeBegin
     *         生效时间起始
     */
    public void setEffectTimeBegin(Date effectTimeBegin) {
        this.effectTimeBegin = effectTimeBegin;
    }

    /**
     * @return 生效时间结束
     */
    public Date getEffectTimeEnd() {
        return effectTimeEnd;
    }

    /**
     * @param effectTimeEnd
     *         生效时间结束
     */
    public void setEffectTimeEnd(Date effectTimeEnd) {
        this.effectTimeEnd = effectTimeEnd;
    }

    /**
     * @return 过期时间起始
     */
    public Date getExpiresBegin() {
        return expiresBegin;
    }

    /**
     * @param expiresBegin
     *         过期时间起始
     */
    public void setExpiresBegin(Date expiresBegin) {
        this.expiresBegin = expiresBegin;
    }

    /**
     * @return 过期时间结束
     */
    public Date getExpiresEnd() {
        return expiresEnd;
    }

    /**
     * @param expiresEnd
     *         过期时间结束
     */
    public void setExpiresEnd(Date expiresEnd) {
        this.expiresEnd = expiresEnd;
    }

    /**
     * @return 首次保养时间起始
     */
    public Date getFirstMaintenanceTimeBegin() {
        return firstMaintenanceTimeBegin;
    }

    /**
     * @param firstMaintenanceTimeBegin
     *         首次保养时间起始
     */
    public void setFirstMaintenanceTimeBegin(Date firstMaintenanceTimeBegin) {
        this.firstMaintenanceTimeBegin = firstMaintenanceTimeBegin;
    }

    /**
     * @return 首次保养时间结束
     */
    public Date getFirstMaintenanceTimeEnd() {
        return firstMaintenanceTimeEnd;
    }

    /**
     * @param firstMaintenanceTimeEnd
     *         首次保养时间结束
     */
    public void setFirstMaintenanceTimeEnd(Date firstMaintenanceTimeEnd) {
        this.firstMaintenanceTimeEnd = firstMaintenanceTimeEnd;
    }

    /**
     * @return 首次保养订单状态
     */
    public List<OrderStatus> getFirstOrderStatuses() {
        return firstOrderStatuses;
    }

    /**
     * @param firstOrderStatuses
     *         首次保养订单状态
     */
    public void setFirstOrderStatuses(List<OrderStatus> firstOrderStatuses) {
        this.firstOrderStatuses = firstOrderStatuses;
    }
}
