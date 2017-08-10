package com.ych.shcm.o2o.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单预约
 * Created by mxp on 2017/7/11.
 */
public class OrderAppointment {

    /**
     * Id.
     */
    private BigDecimal id;

    /**
     * 订单id
     */
    private String orderId;

    /**
     * 预约时间
     */
    private Date appointedTime;

    /**
     * 联系人
     */
    private String ptc;

    /**
     * 电话
     */
    private String phone;

    /**
     * 门店ID
     */
    private BigDecimal shopId;

    /**
     * 订单
     */
    private Order order;

    /**
     * 门店
     */
    private Shop shop;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * @param id
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * @return id
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * @return 订单ID
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     *         订单ID
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return 预约时间
     */
    public Date getAppointedTime() {
        return appointedTime;
    }

    /**
     * @param appointedTime
     *         预约时间
     */
    public void setAppointedTime(Date appointedTime) {
        this.appointedTime = appointedTime;
    }

    /**
     * @return 联系人
     */
    public String getPtc() {
        return ptc;
    }

    /**
     * @param ptc
     *         联系人
     */
    public void setPtc(String ptc) {
        this.ptc = ptc;
    }

    /**
     * @return 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     *         电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return 门店ID
     */
    public BigDecimal getShopId() {
        return shopId;
    }

    /**
     * @param shopId
     *         门店ID
     */
    public void setShopId(BigDecimal shopId) {
        this.shopId = shopId;
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
     * @return 门店
     */
    public Shop getShop() {
        return shop;
    }

    /**
     * @param shop
     *         门店
     */
    public void setShop(Shop shop) {
        this.shop = shop;
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
}
