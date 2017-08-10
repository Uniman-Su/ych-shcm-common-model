package com.ych.shcm.o2o.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.ych.core.model.IWithModifier;

/**
 * 服务商业务地区
 * <p>
 * Created by U on 2017/7/13.
 */
public class ServiceProviderBusinessArea implements Serializable, IWithModifier {

    private static final long serialVersionUID = -6788334368842995883L;

    /**
     * 服务商ID
     */
    private BigDecimal serviceProviderId;

    /**
     * 地区ID
     */
    private String areaId;

    /**
     * 修改者ID
     */
    private BigDecimal modifierId;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * @return 服务商ID
     */
    public BigDecimal getServiceProviderId() {
        return serviceProviderId;
    }

    /**
     * @param serviceProviderId
     *         服务商ID
     */
    public void setServiceProviderId(BigDecimal serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
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
