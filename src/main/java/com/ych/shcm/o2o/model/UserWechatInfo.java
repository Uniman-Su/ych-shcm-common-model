package com.ych.shcm.o2o.model;

import java.io.Serializable;
import java.math.BigDecimal;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.ych.core.wechat.mp.UserInfo;

/**
 * 用户微信信息
 * <p>
 * Created by U on 2017/7/13.
 */
public class UserWechatInfo extends UserInfo {

    private static final long serialVersionUID = 6222620644337186610L;

    /**
     * ID
     */
    private BigDecimal id;

    /**
     * 用户ID
     */
    private BigDecimal userId = BigDecimal.ZERO;

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

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
