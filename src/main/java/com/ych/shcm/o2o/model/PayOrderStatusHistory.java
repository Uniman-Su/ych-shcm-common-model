package com.ych.shcm.o2o.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 支付单状态历史
 * <p>
 * Created by U on 2017/7/11.
 */
public class PayOrderStatusHistory implements Serializable {

    private static final long serialVersionUID = -6336347268416270744L;

    /**
     * ID
     */
    private BigDecimal id;

    /**
     * 支付单ID
     */
    private BigDecimal payOrderId;

    /**
     * 旧的状态
     */
    private PayOrderStatus oldStatus;

    /**
     * 新的状态
     */
    private PayOrderStatus status;

    /**
     * 变更时间
     */
    private Date changeTime;

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
     * @return 旧的状态
     */
    public PayOrderStatus getOldStatus() {
        return oldStatus;
    }


    /**
     * @param oldStatus
     *         旧的状态
     */
    public void setOldStatus(PayOrderStatus oldStatus) {
        this.oldStatus = oldStatus;
    }

    /**
     * @return 新的状态
     */
    public PayOrderStatus getStatus() {
        return status;
    }

    /**
     * @param status
     *         新的状态
     */
    public void setStatus(PayOrderStatus status) {
        this.status = status;
    }

    /**
     * @return 变更时间
     */
    public Date getChangeTime() {
        return changeTime;
    }

    /**
     * @param changeTime
     *         变更时间
     */
    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
