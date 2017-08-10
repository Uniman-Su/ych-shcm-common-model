package com.ych.shcm.o2o.openinf;

import com.ych.shcm.o2o.model.OrderStatus;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单时间通知的负载数据
 */
public class OrderEventNotifyPayload {

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * VIN码
     */
    private String vin;

    /**
     * 订单状态
     */
    private OrderStatus status;

    /**
     * 订单价格
     */
    private BigDecimal price;

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 服务时间
     */
    private Date serviceTime;

    /**
     * 确认时间
     */
    private Date confirmTime;

    /**
     * 评价时间
     */
    private Date evaluateTime;

    /**
     * 退款时间
     */
    private Date refundTime;

    /**
     * @return 订单号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * @param orderNo
     *         订单号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * @return 用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     *         用户ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return VIN码
     */
    public String getVin() {
        return vin;
    }

    /**
     * @param vin
     *         VIN码
     */
    public void setVin(String vin) {
        this.vin = vin;
    }

    /**
     * @return 订单状态
     */
    public OrderStatus getStatus() {
        return status;
    }

    /**
     * @param status
     *         订单状态
     */
    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    /**
     * @return 订单价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * @param price
     *         订单价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * @return 支付时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * @param payTime
     *         支付时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * @return 服务时间
     */
    public Date getServiceTime() {
        return serviceTime;
    }


    /**
     * @param serviceTime
     *         服务时间
     */
    public void setServiceTime(Date serviceTime) {
        this.serviceTime = serviceTime;
    }

    /**
     * @return 确认时间
     */
    public Date getConfirmTime() {
        return confirmTime;
    }

    /**
     * @param confirmTime
     *         确认时间
     */
    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    /**
     * @return 评价时间
     */
    public Date getEvaluateTime() {
        return evaluateTime;
    }

    /**
     * @param evaluateTime
     *         评价时间
     */
    public void setEvaluateTime(Date evaluateTime) {
        this.evaluateTime = evaluateTime;
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

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
