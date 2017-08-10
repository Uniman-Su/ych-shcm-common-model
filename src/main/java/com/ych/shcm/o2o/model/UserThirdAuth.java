package com.ych.shcm.o2o.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.ych.core.model.IWithCreateTime;

/**
 * 用户第三方系统认证信息
 * <p>
 * Created by U on 2017/7/13.
 */
public class UserThirdAuth implements Serializable, IWithCreateTime {

    private static final long serialVersionUID = -768541839844708716L;

    /**
     * ID
     */
    private BigDecimal id;

    /**
     * 用户ID
     */
    private BigDecimal userId;

    /**
     * 第三方认证类型
     */
    private ThirdAuthType type;

    /**
     * 第三方ID
     */
    private String thirdId;

    /**
     * 创建时间
     */
    private Date createTime;

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
     * @return 第三方认证类型
     */
    public ThirdAuthType getType() {
        return type;
    }

    /**
     * @param type
     *         第三方认证类型
     */
    public void setType(ThirdAuthType type) {
        this.type = type;
    }

    /**
     * @return 第三方ID
     */
    public String getThirdId() {
        return thirdId;
    }

    /**
     * @param thirdId
     *         第三方ID
     */
    public void setThirdId(String thirdId) {
        this.thirdId = thirdId;
    }

    @Override
    public Date getCreateTime() {
        return createTime;
    }

    @Override
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
