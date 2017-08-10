package com.ych.shcm.o2o.model;

import com.ych.core.util.CloneUtil;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 订单服务包
 * Created by mxp on 2017/7/13.
 */
public class OrderServicePack implements Serializable, Cloneable {

    private static final long serialVersionUID = -276010440616610219L;

    /**
     * id
     */
    private BigDecimal id;

    /**
     * 订单ID
     */
    private BigDecimal orderId;

    /**
     * 服务包ID
     */
    private BigDecimal servicePackId;

    /**
     * 服务包名
     */
    private String name;

    /**
     * 图标地址
     */
    private String iconPath;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 订单服务项目
     */
    private List<OrderServicePackItem> orderServicePackItems;

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
     * @return 服务包ID
     */
    public BigDecimal getServicePackId() {
        return servicePackId;
    }

    /**
     * @param servicePackId
     *         服务包ID
     */
    public void setServicePackId(BigDecimal servicePackId) {
        this.servicePackId = servicePackId;
    }

    /**
     * @return 服务包名
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *         服务包名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return 图标地址
     */
    public String getIconPath() {
        return iconPath;
    }

    /**
     * @param iconPath
     *         图标地址
     */
    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }

    /**
     * @return 价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * @param price
     *         价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * @return 订单服务项目
     */
    public List<OrderServicePackItem> getOrderServicePackItems() {
        return orderServicePackItems;
    }

    /**
     * @param orderServicePackItems
     *         订单服务项目
     */
    public void setOrderServicePackItems(List<OrderServicePackItem> orderServicePackItems) {
        this.orderServicePackItems = orderServicePackItems;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    @Override
    public OrderServicePack clone() throws CloneNotSupportedException {
        OrderServicePack ret = (OrderServicePack) super.clone();
        ret.orderServicePackItems = CloneUtil.cloneList(orderServicePackItems);
        return ret;
    }

}
