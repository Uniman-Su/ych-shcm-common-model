package com.ych.shcm.o2o.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.ych.core.model.IWithCreateTime;

/**
 * 用户工作的店铺的关系
 */
public class UserShop implements IWithCreateTime, Serializable {

    private static final long serialVersionUID = 4772023239354166981L;

    /**
     * 用户ID
     */
    private BigDecimal userId;

    /**
     * 店铺ID
     */
    private BigDecimal shopId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 默认构造方法
     */
    public UserShop() {
    }

    /**
     * 构造方法
     *
     * @param userId
     *         用户ID
     * @param shopId
     *         店铺ID
     */
    public UserShop(BigDecimal userId, BigDecimal shopId) {

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
     * @return 店铺ID
     */
    public BigDecimal getShopId() {
        return shopId;
    }

    /**
     * @param shopId
     *         店铺ID
     */
    public void setShopId(BigDecimal shopId) {
        this.shopId = shopId;
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
