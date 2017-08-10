package com.ych.shcm.o2o.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 车型组包含的车型系列
 *
 * Created by U on 2017/7/6.
 */
public class CarSeriesGroupSeries implements Serializable {

    private static final long serialVersionUID = -299494224170895831L;

    /**
     * ID
     */
    private BigDecimal id;

    /**
     * 车型组ID
     */
    private BigDecimal groupId;

    /**
     * 车系ID
     */
    private BigDecimal seriesId;

    /**
     * 修改者ID
     */
    private BigDecimal modifierId;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 车型
     */
    private CarSeries series;

    /**
     *
     * @return ID
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     *
     * @param id ID
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     *
     * @return 车型组ID
     */
    public BigDecimal getGroupId() {
        return groupId;
    }

    /**
     *
     * @param groupId 车型组ID
     */
    public void setGroupId(BigDecimal groupId) {
        this.groupId = groupId;
    }

    /**
     *
     * @return 车系ID
     */
    public BigDecimal getSeriesId() {
        return seriesId;
    }

    /**
     *
     * @param seriesId 车系ID
     */
    public void setSeriesId(BigDecimal seriesId) {
        this.seriesId = seriesId;
    }

    /**
     *
     * @return 修改者ID
     */
    public BigDecimal getModifierId() {
        return modifierId;
    }

    /**
     *
     * @param modifierId 修改者ID
     */
    public void setModifierId(BigDecimal modifierId) {
        this.modifierId = modifierId;
    }

    /**
     *
     * @return 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     *
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     *
     * @return 车型
     */
    public CarSeries getSeries() {
        return series;
    }

    /**
     *
     * @param series 车型
     */
    public void setSeries(CarSeries series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
