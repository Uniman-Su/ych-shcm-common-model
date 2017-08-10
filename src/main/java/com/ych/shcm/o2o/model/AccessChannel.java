package com.ych.shcm.o2o.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.ych.core.model.IWithCreateTime;
import com.ych.core.model.IWithModifier;

/**
 * 访问渠道,用于记录关于渠道的接入信息
 * <p>
 * Created by U on 2017/7/5.
 */
public class AccessChannel implements IWithModifier, IWithCreateTime, Serializable {

    private static final long serialVersionUID = 1629381114173999793L;

    /**
     * ID
     */
    private BigDecimal id;

    /**
     * 名称
     */
    private String name;

    /**
     * 编码
     */
    private String code;

    /**
     * 安全密钥
     */
    private String securityKey;

    /**
     * 通知接口的URL
     */
    private String notifyUrl;

    /**
     * 创建时间
     */
    private Date createTime;

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
     * @return 编码
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     *         编码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return 安全密钥
     */
    public String getSecurityKey() {
        return securityKey;
    }

    /**
     * @param securityKey
     *         安全密钥
     */
    public void setSecurityKey(String securityKey) {
        this.securityKey = securityKey;
    }

    /**
     * @return 通知接口的URL
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * @param notifyUrl
     *         通知接口的URL
     */
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getModifierId() {
        return modifierId;
    }

    public void setModifierId(BigDecimal modifierId) {
        this.modifierId = modifierId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
