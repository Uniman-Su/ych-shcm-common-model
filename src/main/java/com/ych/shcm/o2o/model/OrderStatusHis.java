package com.ych.shcm.o2o.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单状态历史记录
 * Created by mxp on 2017/7/13.
 */
public class OrderStatusHis {

    /**
     * id
     */
    private BigDecimal id;

    /**
     * 订单ID
     */
    private BigDecimal orderId;

    /**
     * 旧状态
     */
    private OrderStatus oldStatus;

    /**
     * 新状态
     */
    private OrderStatus status;

    /**
     * 修改者ID
     */
    private BigDecimal modifierId = BigDecimal.ZERO;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * @return id
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * @param id
     *         id
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
     * @return 旧状态
     */
    public OrderStatus getOldStatus() {
        return oldStatus;
    }

    /**
     * @param oldStatus
     *         旧状态
     */
    public void setOldStatus(OrderStatus oldStatus) {
        this.oldStatus = oldStatus;
    }

    /**
     * @return 新状态
     */
    public OrderStatus getStatus() {
        return status;
    }

    /**
     * @param status
     *         新状态
     */
    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    /**
     * @return 修改者ID
     */
    public BigDecimal getModifierId() {
        return modifierId;
    }

    /**
     * @param modifierId
     *         修改者ID
     */
    public void setModifierId(BigDecimal modifierId) {
        this.modifierId = modifierId;
    }

    /**
     * @return 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * @param modifyTime
     *         修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}
