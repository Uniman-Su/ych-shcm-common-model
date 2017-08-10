package com.ych.shcm.o2o.openinf;

import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 车辆参保的请求信息
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GuaranteeRequestPayload {

    /**
     * 用户电话号码
     */
    private String phone;

    /**
     * 用户的姓名
     */
    private String name;

    /**
     * 用户在自身平台的数据ID
     */
    private String id;

    /**
     * 车辆的VIN码
     */
    private String vin;

    /**
     * 车型ID,现以汽车之家车型为准
     */
    private String modelId;

    /**
     * 延保生效时间
     */
    private Date effectiveTime;

    /**
     * 延保过期时间
     */
    private Date expires;

    /**
     * @return 用户电话号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     *         用户电话号码
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return 用户的姓名
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *         用户的姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return 用户在自身平台的数据ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     *         用户在自身平台的数据ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return 车辆的VIN码
     */
    public String getVin() {
        return vin;
    }

    /**
     * @param vin
     *         车辆的VIN码
     */
    public void setVin(String vin) {
        this.vin = vin;
    }

    /**
     * @return 车型ID, 现以汽车之家车型为准
     */
    public String getModelId() {
        return modelId;
    }

    /**
     * @param modelId
     *         车型ID,现以汽车之家车型为准
     */
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    /**
     * @return 延保生效时间
     */
    public Date getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * @param effectiveTime
     *         延保生效时间
     */
    public void setEffectiveTime(Date effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    /**
     * @return 延保过期时间
     */
    public Date getExpires() {
        return expires;
    }

    /**
     * @param expires
     *         延保过期时间
     */
    public void setExpires(Date expires) {
        this.expires = expires;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
