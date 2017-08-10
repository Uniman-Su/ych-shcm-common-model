package com.ych.shcm.o2o.parameter;

import com.ych.core.model.BasePaginableMultiSortableParameter;
import com.ych.shcm.o2o.model.OrderStatus;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 查询订单列表的参数
 *
 * @author U
 */
public class QueryOrderListParameter extends BasePaginableMultiSortableParameter {

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 订单状态
     */
    private List<OrderStatus> status;

    /**
     * 车架号
     */
    private String vin;

    /**
     * 门店名称
     */
    private String shopName;

    /**
     * 门店电话
     */
    private String shopPhone;

    /**
     * 用户id
     */
    private BigDecimal userId;

    /**
     * 门店Id
     */
    private BigDecimal shopId;

    /**
     * 开始时间
     */
    private Date beginTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 是否需要发票
     */
    private Boolean needInvoice;

    /**
     * 是否填充订单服务包
     */
    private boolean needPacks = false;

    /**
     * Gets order no.
     *
     * @return 订单号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * Sets order no.
     *
     * @param orderNo
     *         订单号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * Gets status.
     *
     * @return 订单状态
     */
    public List<OrderStatus> getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status
     *         订单状态
     */
    public void setStatus(List<OrderStatus> status) {
        this.status = status;
    }

    /**
     * Gets vin.
     *
     * @return 车架号
     */
    public String getVin() {
        return vin;
    }

    /**
     * Sets vin.
     *
     * @param vin
     *         车架号
     */
    public void setVin(String vin) {
        this.vin = vin;
    }

    /**
     * Gets shop name.
     *
     * @return 店铺名
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * Sets shop name.
     *
     * @param shopName
     *         店铺名
     */
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    /**
     * Gets shop phone.
     *
     * @return 店铺电话
     */
    public String getShopPhone() {
        return shopPhone;
    }

    /**
     * Sets shop phone.
     *
     * @param shopPhone
     *         店铺电话
     */
    public void setShopPhone(String shopPhone) {
        this.shopPhone = shopPhone;
    }

    /**
     * Gets begin time.
     *
     * @return 创建开始时间
     */
    public Date getBeginTime() {
        return beginTime;
    }

    /**
     * Sets begin time.
     *
     * @param beginTime
     *         创建开始时间
     */
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * @return 门店Id
     */
    public BigDecimal getShopId() {
        return shopId;
    }

    /**
     * @param shopId
     *         门店Id
     */
    public void setShopId(BigDecimal shopId) {
        this.shopId = shopId;
    }

    /**
     * Gets end time.
     *
     * @return 创建结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * Sets end time.
     *
     * @param endTime
     *         创建结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * Getter for property 'needInvoice'.
     *
     * @return Value for property 'needInvoice'.
     */
    public Boolean getNeedInvoice() {
        return needInvoice;
    }

    /**
     * Setter for property 'needInvoice'.
     *
     * @param needInvoice
     *         Value to set for property 'needInvoice'.
     */
    public void setNeedInvoice(Boolean needInvoice) {
        this.needInvoice = needInvoice;
    }

    /**
     * @return 用户id
     */
    public BigDecimal getUserId() {
        return userId;
    }

    /**
     * @param userId
     *         用户id
     */
    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    /**
     * @return 是否填充订单服务包
     */
    public boolean isNeedPacks() {
        return needPacks;
    }

    /**
     * @param needPacks
     *         是否填充订单服务包
     */
    public void setNeedPacks(boolean needPacks) {
        this.needPacks = needPacks;
    }
}
