package com.ych.shcm.o2o.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.ych.core.model.IWithModifier;

/**
 * 服务商
 * <p>
 * Created by U on 2017/7/13.
 */
public class ServiceProvider implements Serializable, IWithModifier {

    private static final long serialVersionUID = 4694966464137645473L;

    /**
     * ID
     */
    private BigDecimal id;

    /**
     * 名称
     */
    private String name;

    /**
     * 地区ID
     */
    private String areaId;

    /**
     * 地址
     */
    private String address;

    /**
     * 修改者ID
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
     * @return 地区ID
     */
    public String getAreaId() {
        return areaId;
    }

    /**
     * @param areaId
     *         地区ID
     */
    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    /**
     * @return 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     *         地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public BigDecimal getModifierId() {
        return modifierId;
    }

    @Override
    public void setModifierId(BigDecimal modifierId) {
        this.modifierId = modifierId;
    }

    @Override
    public Date getModifyTime() {
        return modifyTime;
    }

    @Override
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
