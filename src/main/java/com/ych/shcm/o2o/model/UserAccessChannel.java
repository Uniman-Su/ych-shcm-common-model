package com.ych.shcm.o2o.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.ych.core.model.IWithCreateTime;

/**
 * 用户访问渠道
 * <p>
 * Created by U on 2017/7/10.
 */
public class UserAccessChannel implements Serializable, IWithCreateTime {

    private static final long serialVersionUID = 3873123214228939837L;

    /**
     * ID
     */
    private BigDecimal id;

    /**
     * 用户ID
     */
    private BigDecimal userId;

    /**
     * 访问渠道ID
     */
    private BigDecimal accessChannelId;

    /**
     * 用户在访问渠道的ID
     */
    private String userIdOfAccessChannel;

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

    /**
     * @return 用户在访问渠道的ID
     */
    public String getUserIdOfAccessChannel() {
        return userIdOfAccessChannel;
    }

    /**
     * @param userIdOfAccessChannel
     *         用户在访问渠道的ID
     */
    public void setUserIdOfAccessChannel(String userIdOfAccessChannel) {
        this.userIdOfAccessChannel = userIdOfAccessChannel;
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
