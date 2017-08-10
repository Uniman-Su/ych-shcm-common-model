package com.ych.shcm.o2o.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 服务项目
 * Created by mxp on 2017/7/13.
 */
public class ServiceItem implements Serializable {

    private static final long serialVersionUID = -4036828437872684681L;
    /**
     * Id.
     */
    private BigDecimal id;

    /**
     * 服务项目名
     */
    private String name;

    /**
     * 图标路径
     */
    private String iconPath;

    /**
     * 备注
     */
    private String comment;

    /**
     * 金额
     */
    private BigDecimal price;

    /**
     * 佣金
     */
    private BigDecimal brokerage;

    /**
     * 服务项目类型
     */
    private ServiceItemType type;

    /**
     * 服务项目状态
     */
    private ServiceStatus status;

    /**
     * 修改者ID
     */
    private BigDecimal modifierId = BigDecimal.ZERO;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * @return the id
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
     * @return 服务项目名
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *         服务项目名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return 图标路径
     */
    public String getIconPath() {
        return iconPath;
    }

    /**
     * @param iconPath
     *         图标路径
     */
    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }

    /**
     * @return 备注
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment
     *         备注
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return 佣金
     */
    public BigDecimal getBrokerage() {
        return brokerage;
    }

    /**
     * @param brokerage
     *         佣金
     */
    public void setBrokerage(BigDecimal brokerage) {
        this.brokerage = brokerage;
    }

    /**
     * @return 服务项目类型
     */
    public ServiceItemType getType() {
        return type;
    }

    /**
     * @param type
     *         服务项目类型
     */
    public void setType(ServiceItemType type) {
        this.type = type;
    }

    /**
     * @return 服务项目状态
     */
    public ServiceStatus getStatus() {
        return status;
    }

    /**
     * @param status
     *         服务项目状态
     */
    public void setStatus(ServiceStatus status) {
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

    /**
     * @return 金额
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * @param price
     *         金额
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
