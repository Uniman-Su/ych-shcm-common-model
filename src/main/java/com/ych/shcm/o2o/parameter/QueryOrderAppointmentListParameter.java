package com.ych.shcm.o2o.parameter;

import com.ych.core.model.BasePaginableSortableParameter;

import java.math.BigDecimal;

/**
 * 查询订单预约列表的参数
 *
 * @author U
 */
public class QueryOrderAppointmentListParameter extends BasePaginableSortableParameter {

    /**
     * 订单id
     */
    private BigDecimal orderId;

    /**
     * 门店Id
     */
    private BigDecimal shopId;

    /**
     * 用户id
     */
    private BigDecimal userId;

    /**
     * 是否需要填充订单信息
     */
    private boolean needOrderInfo = false;

    /**
     * 订单id
     *
     * @return 订单id
     */
    public BigDecimal getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     *         订单id
     */
    public void setOrderId(BigDecimal orderId) {
        this.orderId = orderId;
    }

    /**
     * @return 门店Id
     */
    public BigDecimal getShopId() {
        return shopId;
    }

    /**
     * @param shopId
     *         门店Id
     */
    public void setShopId(BigDecimal shopId) {
        this.shopId = shopId;
    }

    /**
     * @return 用户id
     */
    public BigDecimal getUserId() {
        return userId;
    }

    /**
     * @param userId
     *         用户id
     */
    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    /**
     * @return 是否需要填充订单信息
     */
    public boolean isNeedOrderInfo() {
        return needOrderInfo;
    }

    /**
     * @param needOrderInfo
     *         是否需要填充订单信息
     */
    public void setNeedOrderInfo(boolean needOrderInfo) {
        this.needOrderInfo = needOrderInfo;
    }
}
