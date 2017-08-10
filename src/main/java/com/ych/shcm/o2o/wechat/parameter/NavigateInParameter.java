package com.ych.shcm.o2o.wechat.parameter;

import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 微信导航进入的参数
 * <p>
 * Created by U on 2017/7/17.
 */
public class NavigateInParameter {

    /**
     * 应用编码
     */
    private String appCode;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 车辆VIN码
     */
    private String vin;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 消息摘要
     */
    private String digest;

    /**
     * @return 应用编码
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * @param appCode
     *         应用编码
     */
    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    /**
     * @return 用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     *         用户ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return 车辆VIN码
     */
    public String getVin() {
        return vin;
    }

    /**
     * @param vin
     *         车辆VIN码
     */
    public void setVin(String vin) {
        this.vin = vin;
    }

    /**
     * @return 时间戳
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * @param timestamp
     *         时间戳
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * @return 消息摘要
     */
    public String getDigest() {
        return digest;
    }

    /**
     * @param digest
     *         消息摘要
     */
    public void setDigest(String digest) {
        this.digest = digest;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
