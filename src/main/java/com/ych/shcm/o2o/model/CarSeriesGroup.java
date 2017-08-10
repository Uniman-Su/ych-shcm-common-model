package com.ych.shcm.o2o.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 车型组
 * <p>
 * Created by U on 2017/7/6.
 */
public class CarSeriesGroup implements Serializable {

    private static final long serialVersionUID = 5299913698081327683L;

    /**
     * ID
     */
    private BigDecimal id;

    /**
     * 名称
     */
    private String name;

    /**
     * 状态
     */
    private CarSeriesGroupStatus status;

    /**
     * 修改人ID
     */
    private BigDecimal modifierId;

    /**
     * 修改时间
     */
    private Date modifyTime;

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
     * @return 状态
     */
    public CarSeriesGroupStatus getStatus() {
        return status;
    }

    /**
     * @param status
     *         状态
     */
    public void setStatus(CarSeriesGroupStatus status) {
        this.status = status;
    }

    /**
     * @return 修改人ID
     */
    public BigDecimal getModifierId() {
        return modifierId;
    }

    /**
     * @param modifierId
     *         修改人ID
     */
    public void setModifierId(BigDecimal modifierId) {
        this.modifierId = modifierId;
    }

    /**
     * @return 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * @param modifyTime
     *         修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
