package com.ych.shcm.o2o.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 退款单
 */
public class RefundOrder implements Serializable {

    /**
     * ID
     */
    private BigDecimal id;

    /**
     * 订单ID
     */
    private BigDecimal orderId;

    /**
     * 流水号
     */
    private String flowNo;

    /**
     * 支付渠道
     */
    private PayChannel payChannel;

    /**
     * 支付渠道流水号
     */
    private String payChannelFlowNo;

    /**
     * 退款金额
     */
    private BigDecimal refundMoney;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 状态
     */
    private RefundOrderStatus status;

    /**
     * 退款时间
     */
    private Date refundTime;

    /**
     * 失败时间
     */
    private Date failTime;

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
     * @return 流水号
     */
    public String getFlowNo() {
        return flowNo;
    }

    /**
     * @param flowNo
     *         流水号
     */
    public void setFlowNo(String flowNo) {
        this.flowNo = flowNo;
    }

    /**
     * @return 支付渠道
     */
    public PayChannel getPayChannel() {
        return payChannel;
    }

    /**
     * @param payChannel
     *         支付渠道
     */
    public void setPayChannel(PayChannel payChannel) {
        this.payChannel = payChannel;
    }

    /**
     * @return 支付渠道流水号
     */
    public String getPayChannelFlowNo() {
        return payChannelFlowNo;
    }

    /**
     * @param payChannelFlowNo
     *         支付渠道流水号
     */
    public void setPayChannelFlowNo(String payChannelFlowNo) {
        this.payChannelFlowNo = payChannelFlowNo;
    }

    /**
     * @return 退款金额
     */
    public BigDecimal getRefundMoney() {
        return refundMoney;
    }

    /**
     * @param refundMoney
     *         退款金额
     */
    public void setRefundMoney(BigDecimal refundMoney) {
        this.refundMoney = refundMoney;
    }

    /**
     * @return 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     *         创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return 状态
     */
    public RefundOrderStatus getStatus() {
        return status;
    }

    /**
     * @param status
     *         状态
     */
    public void setStatus(RefundOrderStatus status) {
        this.status = status;
    }

    /**
     * @return 退款时间
     */
    public Date getRefundTime() {
        return refundTime;
    }

    /**
     * @param refundTime
     *         退款时间
     */
    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }

    /**
     * @return 失败时间
     */
    public Date getFailTime() {
        return failTime;
    }

    /**
     * @param failTime
     *         失败时间
     */
    public void setFailTime(Date failTime) {
        this.failTime = failTime;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
