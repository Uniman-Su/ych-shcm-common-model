package com.ych.shcm.o2o.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 服务包
 * Created by mxp on 2017/7/13.
 */
public class ServicePack implements Serializable {

    private static final long serialVersionUID = -219006091227303820L;
    /**
     * Id.
     */
    private BigDecimal id;

    /**
     * 服务包名
     */
    private String name;

    /**
     * 图标路径
     */
    private String iconPath;

    /**
     * 服务包状态
     */
    private ServiceStatus status;

    /**
     * 富文本描述
     */
    private String desc;

    /**
     * 备注
     */
    private String comment;

    /**
     * 别名
     */
    private String alias;

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
     * @return 富文本描述
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc
     *         富文本描述
     */
    public void setDesc(String desc) {
        this.desc = desc;
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
     * @return 别名
     */
    public String getAlias() {
        return alias;
    }

    /**
     * @param alias
     *         别名
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * @return 服务包状态
     */
    public ServiceStatus getStatus() {
        return status;
    }

    /**
     * @param status
     *         服务包状态
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
}
