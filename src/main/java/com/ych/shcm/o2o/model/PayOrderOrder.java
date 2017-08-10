package com.ych.shcm.o2o.model;

import java.io.Serializable;
import java.math.BigDecimal;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 支付单据归属的订单
 * <p>
 * Created by U on 2017/7/11.
 */
public class PayOrderOrder implements Serializable {

    private static final long serialVersionUID = 4737627342205574315L;

    /**
     * ID
     */
    private BigDecimal id;

    /**
     * 支付单ID
     */
    private BigDecimal payOrderId;

    /**
     * 订单ID
     */
    private BigDecimal orderId;

    /**
     * 渠道费用
     */
    private BigDecimal channelFee;

    /**
     * 支付单
     */
    private PayOrder payOrder;

    /**
     * 订单
     */
    private Order order;

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
     * @return 支付单ID
     */
    public BigDecimal getPayOrderId() {
        return payOrderId;
    }

    /**
     * @param payOrderId
     *         支付单ID
     */
    public void setPayOrderId(BigDecimal payOrderId) {
        this.payOrderId = payOrderId;
    }

    /**
     * @return 订单ID
     */
    public BigDecimal getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     *         订单ID
     */
    public void setOrderId(BigDecimal orderId) {
        this.orderId = orderId;
    }

    /**
     * @return 渠道费用
     */
    public BigDecimal getChannelFee() {
        return channelFee;
    }

    /**
     * @param channelFee
     *         渠道费用
     */
    public void setChannelFee(BigDecimal channelFee) {
        this.channelFee = channelFee;
    }

    /**
     * @return 支付单
     */
    public PayOrder getPayOrder() {
        return payOrder;
    }

    /**
     * @param payOrder
     *         支付单
     */
    public void setPayOrder(PayOrder payOrder) {
        this.payOrder = payOrder;
    }

    /**
     * @return 订单
     */
    public Order getOrder() {
        return order;
    }

    /**
     * @param order
     *         订单
     */
    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
