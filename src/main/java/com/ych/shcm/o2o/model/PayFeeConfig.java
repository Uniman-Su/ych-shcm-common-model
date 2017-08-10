package com.ych.shcm.o2o.model;

import java.io.Serializable;
import java.math.BigDecimal;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 支付费用配置
 *
 * @author U
 */
public class PayFeeConfig implements Serializable {

    private static final long serialVersionUID = -5750721651946642217L;

    /**
     * ID
     */
    private BigDecimal id;

    /**
     * 支付渠道
     */
    private PayChannel payChannel;

    /**
     * 是否固定金额
     */
    private boolean isFixed;

    /**
     * 费率,百分比
     */
    private BigDecimal feeRate;

    /**
     * 固定金额
     */
    private BigDecimal fixedFee;

    /**
     * 费用上限
     */
    private BigDecimal feeLimit;

    /**
     * 最低收费额
     */
    private BigDecimal beginFee;

    /**
     * 退款时费用是否可退
     */
    private boolean isRefundable;

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
     * @return 是否固定金额
     */
    public boolean isFixed() {
        return isFixed;
    }

    /**
     * @param isFixed
     *         是否固定金额
     */
    public void setFixed(boolean isFixed) {
        this.isFixed = isFixed;
    }

    /**
     * @return 费率, 百分比
     */
    public BigDecimal getFeeRate() {
        return feeRate;
    }

    /**
     * @param feeRate
     *         费率,百分比
     */
    public void setFeeRate(BigDecimal feeRate) {
        this.feeRate = feeRate;
    }

    /**
     * @return 固定金额
     */
    public BigDecimal getFixedFee() {
        return fixedFee;
    }

    /**
     * @param fixedFee
     *         固定金额
     */
    public void setFixedFee(BigDecimal fixedFee) {
        this.fixedFee = fixedFee;
    }

    /**
     * @return 费用上限
     */
    public BigDecimal getFeeLimit() {
        return feeLimit;
    }

    /**
     * @param feeLimit
     *         费用上限
     */
    public void setFeeLimit(BigDecimal feeLimit) {
        this.feeLimit = feeLimit;
    }

    /**
     * @return 最低收费额
     */
    public BigDecimal getBeginFee() {
        return beginFee;
    }

    /**
     * @param beginFee
     *         最低收费额
     */
    public void setBeginFee(BigDecimal beginFee) {
        this.beginFee = beginFee;
    }

    /**
     * @return 退款时费用是否可退
     */
    public boolean isRefundable() {
        return isRefundable;
    }

    /**
     * @param isRefundable
     *         退款时费用是否可退
     */
    public void setRefundable(boolean isRefundable) {
        this.isRefundable = isRefundable;
    }

    /**
     * @return id
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
