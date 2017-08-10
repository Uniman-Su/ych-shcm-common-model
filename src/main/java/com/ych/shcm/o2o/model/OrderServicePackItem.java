package com.ych.shcm.o2o.model;

import java.io.Serializable;
import java.math.BigDecimal;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 订单服务包项目
 * Created by mxp on 2017/7/13.
 */
public class OrderServicePackItem implements Serializable, Cloneable {

    private static final long serialVersionUID = -6378351464131458290L;

    /**
     * id
     */
    private BigDecimal id;

    /**
     * 订单服务包ID
     */
    private BigDecimal orderServicePackId;

    /**
     * 项目ID
     */
    private BigDecimal serviceItemId;

    /**
     * 服务包项目名
     */
    private String name;

    /**
     * 数量
     */
    private int num;

    /**
     * 图标地址
     */
    private String iconPath;

    /**
     * 价格
     */
    private BigDecimal price;

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
     * @return 订单服务包ID
     */
    public BigDecimal getOrderServicePackId() {
        return orderServicePackId;
    }

    /**
     * @param orderServicePackId
     *         订单服务包ID
     */
    public void setOrderServicePackId(BigDecimal orderServicePackId) {
        this.orderServicePackId = orderServicePackId;
    }

    /**
     * @return 项目ID
     */
    public BigDecimal getServiceItemId() {
        return serviceItemId;
    }

    /**
     * @param serviceItemId
     *         项目ID
     */
    public void setServiceItemId(BigDecimal serviceItemId) {
        this.serviceItemId = serviceItemId;
    }

    /**
     * @return 服务包项目名
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *         服务包项目名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return 数量
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num
     *         数量
     */
    public void setNum(int num) {
        this.num = num;
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

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    @Override
    public OrderServicePackItem clone() throws CloneNotSupportedException {
        return (OrderServicePackItem) super.clone();
    }
}
