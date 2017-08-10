package com.ych.shcm.o2o.wechat.parameter;

import java.math.BigDecimal;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 微信导航返回的参数
 * <p>
 * Created by U on 2017/7/17.
 */
public class RedirectBackParameter {

    /**
     * 微信授权Code
     */
    private String code;

    /**
     * 用户ID
     */
    private BigDecimal userId;

    /**
     * 车辆ID
     */
    private BigDecimal carId;

    /**
     * 访问渠道ID
     */
    private BigDecimal accessChannelId;

    /**
     * @return 微信授权Code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     *         微信授权Code
     */
    public void setCode(String code) {
        this.code = code;
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

    /**
     * @return 访问渠道ID
     */
    public BigDecimal getAccessChannelId() {
        return accessChannelId;
    }

    /**
     * @param accessChannelId
     *         访问渠道ID
     */
    public void setAccessChannelId(BigDecimal accessChannelId) {
        this.accessChannelId = accessChannelId;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
