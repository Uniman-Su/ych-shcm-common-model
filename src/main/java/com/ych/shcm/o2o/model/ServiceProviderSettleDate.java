package com.ych.shcm.o2o.model;

import com.ych.core.model.IWithCreateTime;
import com.ych.core.model.IWithModifier;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 服务商日结算信息
 * <p>
 * Created by U on 2017/7/13.
 */
public class ServiceProviderSettleDate implements Serializable, IWithCreateTime, IWithModifier {

    private static final long serialVersionUID = 5187551391764346611L;
    /**
     * ID
     */
    private BigDecimal id;

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
    private BigDecimal serviceProviderId;

    /**
     * 服务商结算状态
     */
    private ServiceProviderSettleStatus status = ServiceProviderSettleStatus.UNSETTLED;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人ID
     */
    private BigDecimal modifierId;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 服务商
     */
    private Shop shop;

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

    /**
     * @return 服务商结算状态
     */
    public ServiceProviderSettleStatus getStatus() {
        return status;
    }

    /**
     * @param status
     *         服务商结算状态
     */
    public void setStatus(ServiceProviderSettleStatus status) {
        this.status = status;
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
    public BigDecimal getModifierId() {
        return modifierId;
    }

    @Override
    public void setModifierId(BigDecimal modifierId) {
        this.modifierId = modifierId;
    }

    @Override
    public Date getModifyTime() {
        return modifyTime;
    }

    @Override
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * @return 服务商
     */
    public Shop getShop() {
        return shop;
    }

    /**
     * @param shop
     *         服务商
     */
    public void setShop(Shop shop) {
        this.shop = shop;
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
