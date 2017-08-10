package com.ych.shcm.o2o.model;

import com.ych.core.util.CloneUtil;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 订单
 * Created by mxp on 2017/7/11.
 */
public class Order implements Serializable, Cloneable {

    private static final long serialVersionUID = 3804559906158658688L;
    /**
     * Id.
     */
    private BigDecimal id;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 用户ID
     */
    private BigDecimal userId;

    /**
     * 渠道Id
     */
    private BigDecimal accessChannelId;

    /**
     * 车辆里程
     */
    private Long mileage;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 状态
     */
    private OrderStatus status;

    /**
     * 店铺ID
     */
    private BigDecimal shopId;

    /**
     * 车型ID
     */
    private BigDecimal carId;

    /**
     * 订单金额
     */
    private BigDecimal money;

    /**
     * 服务商ID
     */
    private BigDecimal serviceProviderId;

    /**
     * 修改者ID
     */
    private BigDecimal modifierId = BigDecimal.ZERO;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 车辆实体
     */
    private Car car;

    /**
     * 店铺
     */
    private Shop shop;

    /**
     * 发票信息
     */
    private OrderBill orderBill;

    /**
     * 订单服务包
     */
    private List<OrderServicePack> orderServicePacks;

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
    public BigDecimal getUserId() {
        return userId;
    }

    /**
     * @param userId
     *         用户ID
     */
    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    /**
     * @return 渠道ID
     */
    public BigDecimal getAccessChannelId() {
        return accessChannelId;
    }

    /**
     * @param accessChannelId
     *         渠道ID
     */
    public void setAccessChannelId(BigDecimal accessChannelId) {
        this.accessChannelId = accessChannelId;
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
     * @return 店铺ID
     */
    public BigDecimal getShopId() {
        return shopId;
    }

    /**
     * @param shopId
     *         店铺ID
     */
    public void setShopId(BigDecimal shopId) {
        this.shopId = shopId;
    }

    /**
     * @return 车型ID
     */
    public BigDecimal getCarId() {
        return carId;
    }

    /**
     * @param carId
     *         车型ID
     */
    public void setCarId(BigDecimal carId) {
        this.carId = carId;
    }

    /**
     * @return 金额
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * @param money
     *         金额
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * @return 车辆里程
     */
    public Long getMileage() {
        return mileage;
    }

    /**
     * @param mileage
     *         车辆里程
     */
    public void setMileage(Long mileage) {
        this.mileage = mileage;
    }

    /**
     * @return 修改人
     */
    public BigDecimal getModifierId() {
        return modifierId;
    }

    /**
     * @param modifierId
     *         修改人
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
     * @return 车辆实体
     */
    public Car getCar() {
        return car;
    }

    /**
     * @param car
     *         车辆实体
     */
    public void setCar(Car car) {
        this.car = car;
    }

    /**
     * @return 店铺
     */
    public Shop getShop() {
        return shop;
    }

    /**
     * @param shop
     *         店铺
     */
    public void setShop(Shop shop) {
        this.shop = shop;
    }

    /**
     * @return 发票信息
     */
    public OrderBill getOrderBill() {
        return orderBill;
    }

    /**
     * @param orderBill
     *         发票信息
     */
    public void setOrderBill(OrderBill orderBill) {
        this.orderBill = orderBill;
    }

    /**
     * @return 订单服务包
     */
    public List<OrderServicePack> getOrderServicePacks() {
        return orderServicePacks;
    }

    /**
     * @param orderServicePacks
     *         订单服务包
     */
    public void setOrderServicePacks(List<OrderServicePack> orderServicePacks) {
        this.orderServicePacks = orderServicePacks;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    @Override
    public Order clone() throws CloneNotSupportedException {
        Order ret = (Order) super.clone();
        ret.car = ObjectUtils.clone(car);
        ret.shop = ObjectUtils.clone(shop);
        ret.orderBill = ObjectUtils.clone(orderBill);
        ret.orderServicePacks = CloneUtil.cloneList(orderServicePacks);
        return ret;
    }
}
