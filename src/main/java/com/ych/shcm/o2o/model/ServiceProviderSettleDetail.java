package com.ych.shcm.o2o.model;

import com.ych.core.model.IWithCreateTime;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 服务商结算明细
 * <p>
 * Created by U on 2017/7/13.
 */
public class ServiceProviderSettleDetail implements Serializable, IWithCreateTime {

    private static final long serialVersionUID = 5792828831989841344L;

    /**
     * ID
     */
    private BigDecimal id;

    /**
     * 订单ID
     */
    private BigDecimal orderId;

    /**
     * 支付单ID
     */
    private BigDecimal payOrderId;

    /**
     * 订单金额
     */
    private BigDecimal orderPrice;

    /**
     * 渠道费用
     */
    private BigDecimal channelFee;

    /**
     * 服务商收益
     */
    private BigDecimal shopIncomes;

    /**
     * 服务商渠道费用
     */
    private BigDecimal shopChannelFee;

    /**
     * 服务商收益
     */
    private BigDecimal serviceProviderIncomes;

    /**
     * 服务商渠道费用
     */
    private BigDecimal serviceProviderChannelFee;

    /**
     * 平台收益
     */
    private BigDecimal platformIncomes;

    /**
     * 平台渠道费用
     */
    private BigDecimal platformChannelFee;

    /**
     * 结算日
     */
    private Date settleDate;

    /**
     * 服务商ID
     */
    private BigDecimal shopId;

    /**
     * 服务商ID
     */
    private BigDecimal serviceProviderId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 订单
     */
    private Order order;

    /**
     * 支付单
     */
    private PayOrder payOrder;

    /**
     * 服务商
     */
    private ServiceProvider serviceProvider;

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
     * @return 订单金额
     */
    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    /**
     * @param orderPrice
     *         订单金额
     */
    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
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
     * @return 服务商收益
     */
    public BigDecimal getShopIncomes() {
        return shopIncomes;
    }

    /**
     * @param shopIncomes
     *         服务商收益
     */
    public void setShopIncomes(BigDecimal shopIncomes) {
        this.shopIncomes = shopIncomes;
    }

    /**
     * @return 服务商渠道费用
     */
    public BigDecimal getShopChannelFee() {
        return shopChannelFee;
    }

    /**
     * @param shopChannelFee
     *         服务商渠道费用
     */
    public void setShopChannelFee(BigDecimal shopChannelFee) {
        this.shopChannelFee = shopChannelFee;
    }

    /**
     * @return 服务商收益
     */
    public BigDecimal getServiceProviderIncomes() {
        return serviceProviderIncomes;
    }

    /**
     * @param serviceProviderIncomes
     *         服务商收益
     */
    public void setServiceProviderIncomes(BigDecimal serviceProviderIncomes) {
        this.serviceProviderIncomes = serviceProviderIncomes;
    }

    /**
     * @return 服务商渠道费用
     */
    public BigDecimal getServiceProviderChannelFee() {
        return serviceProviderChannelFee;
    }

    /**
     * @param serviceProviderChannelFee
     *         服务商渠道费用
     */
    public void setServiceProviderChannelFee(BigDecimal serviceProviderChannelFee) {
        this.serviceProviderChannelFee = serviceProviderChannelFee;
    }

    /**
     * @return 平台收益
     */
    public BigDecimal getPlatformIncomes() {
        return platformIncomes;
    }

    /**
     * @param platformIncomes
     *         平台收益
     */
    public void setPlatformIncomes(BigDecimal platformIncomes) {
        this.platformIncomes = platformIncomes;
    }

    /**
     * @return 平台渠道费用
     */
    public BigDecimal getPlatformChannelFee() {
        return platformChannelFee;
    }

    /**
     * @param platformChannelFee
     *         平台渠道费用
     */
    public void setPlatformChannelFee(BigDecimal platformChannelFee) {
        this.platformChannelFee = platformChannelFee;
    }

    /**
     * @return 结算日
     */
    public Date getSettleDate() {
        return settleDate;
    }

    /**
     * @param settleDate
     *         结算日
     */
    public void setSettleDate(Date settleDate) {
        this.settleDate = settleDate;
    }

    /**
     * @return 服务商ID
     */
    public BigDecimal getShopId() {
        return shopId;
    }

    /**
     * @param shopId
     *         服务商ID
     */
    public void setShopId(BigDecimal shopId) {
        this.shopId = shopId;
    }

    /**
     * @return 服务商ID
     */
    public BigDecimal getServiceProviderId() {
        return serviceProviderId;
    }

    /**
     * @param serviceProviderId
     *         服务商ID
     */
    public void setServiceProviderId(BigDecimal serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
    }

    @Override
    public Date getCreateTime() {
        return createTime;
    }

    @Override
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
     * @return 服务商
     */
    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    /**
     * @param serviceProvider
     *         服务商
     */
    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
