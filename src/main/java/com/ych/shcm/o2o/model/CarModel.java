package com.ych.shcm.o2o.model;

import com.ych.core.model.IWithModifier;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 车型
 *
 * @author U
 */
public class CarModel implements IWithModifier, Cloneable, Serializable {

    private static final long serialVersionUID = 5475509718701777071L;

    /**
     * ID
     */
    private BigDecimal id;

    /**
     * 车系ID
     */
    private BigDecimal seriesId;

    /**
     * 年份
     */
    private int year;

    /**
     * 名称
     */
    private String name;

    /**
     * 排序
     */
    private int sort;

    /**
     * 机油容量
     */
    private BigDecimal engineOilCapacity = BigDecimal.ZERO;

    /**
     * 是否启用
     */
    private boolean enabled;

    /**
     * 修改者ID
     */
    private BigDecimal modifierId = BigDecimal.ZERO;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 车系
     */
    private CarSeries series;

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
    public int getYear() {
        return year;
    }

    /**
     * @param year
     *         年份
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return 名称
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *         名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return 排序
     */
    public int getSort() {
        return sort;
    }

    /**
     * @param sort
     *         排序
     */
    public void setSort(int sort) {
        this.sort = sort;
    }

    /**
     * @return 机油容量
     */
    public BigDecimal getEngineOilCapacity() {
        return engineOilCapacity;
    }

    /**
     * @param engineOilCapacity
     *         机油容量
     */
    public void setEngineOilCapacity(BigDecimal engineOilCapacity) {
        this.engineOilCapacity = engineOilCapacity;
    }

    /**
     * @return 是否启用
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * @param enabled
     *         是否启用
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.ych.core.model.IWithModifier#getModifierId()
     */
    @Override
    public BigDecimal getModifierId() {
        return modifierId;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.ych.core.model.IWithModifier#setModifierId(java.math.BigDecimal)
     */
    @Override
    public void setModifierId(BigDecimal modifierId) {
        this.modifierId = modifierId;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.ych.core.model.IWithModifier#getModifyTime()
     */
    @Override
    public Date getModifyTime() {
        return modifyTime;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.ych.core.model.IWithModifier#setModifyTime(java.util.Date)
     */
    @Override
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * @return 车系
     */
    public CarSeries getSeries() {
        return series;
    }

    /**
     * @param series
     *         车系
     */
    public void setSeries(CarSeries series) {
        this.series = series;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#clone()
     */
    @Override
    public CarModel clone() throws CloneNotSupportedException {
        CarModel that = (CarModel) super.clone();

        that.series = ObjectUtils.clone(series);

        return that;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
