package com.ych.shcm.o2o.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.ych.core.model.IWithCreateTime;

/**
 * 支付单据
 * <p>
 * Created by U on 2017/7/11.
 */
public class PayOrder implements Serializable, IWithCreateTime {

    private static final long serialVersionUID = -18239527462118542L;

    /**
     * ID
     */
    private BigDecimal id;

    /**
     * 流水号
     */
    private String flowNo;

    /**
     * 支付渠道
     */
    private PayChannel payChannel;

    /**
     * 渠道流水号
     */
    private String payChannelFlowNo = StringUtils.EMPTY;

    /**
     * 支付金额
     */
    private BigDecimal price;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 状态
     */
    private PayOrderStatus status;

    /**
     * 渠道费用
     */
    private BigDecimal channelFee;

    /**
     * 渠道费用退款是否可退
     */
    private boolean channelFeeRefundable;

    /**
     * 预支付单ID
     */
    private String prepayId;

    /**
     * 渠道返回错误码
     */
    private String resultCode;

    /**
     * 渠道返回消息
     */
    private String resultMsg;

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
     * @return 渠道流水号
     */
    public String getPayChannelFlowNo() {
        return payChannelFlowNo;
    }

    /**
     * @param payChannelFlowNo
     *         渠道流水号
     */
    public void setPayChannelFlowNo(String payChannelFlowNo) {
        this.payChannelFlowNo = payChannelFlowNo;
    }

    /**
     * @return 支付金额
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * @param price
     *         支付金额
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
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
     * @return 状态
     */
    public PayOrderStatus getStatus() {
        return status;
    }

    /**
     * @param status
     *         状态
     */
    public void setStatus(PayOrderStatus status) {
        this.status = status;
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
     * @return 渠道费用退款是否可退
     */
    public boolean isChannelFeeRefundable() {
        return channelFeeRefundable;
    }

    /**
     * @param channelFeeRefundable
     *         渠道费用退款是否可退
     */
    public void setChannelFeeRefundable(boolean channelFeeRefundable) {
        this.channelFeeRefundable = channelFeeRefundable;
    }

    /**
     * @return 预支付单ID
     */
    public String getPrepayId() {
        return prepayId;
    }

    /**
     * @param prepayId
     *         预支付单ID
     */
    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    /**
     * @return 渠道返回错误码
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * @param resultCode
     *         渠道返回错误码
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * @return 渠道返回消息
     */
    public String getResultMsg() {
        return resultMsg;
    }

    /**
     * @param resultMsg
     *         渠道返回消息
     */
    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
