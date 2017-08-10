package com.ych.shcm.o2o.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 服务包
 * Created by mxp on 2017/7/13.
 */
public class ServicePackItem implements Serializable {

    private static final long serialVersionUID = -522564002660609372L;

    /**
     * id
     */
    private BigDecimal id;

    /**
     * 服务包ID
     */
    private BigDecimal packId;

    /**
     * 项目ID
     */
    private BigDecimal itemId;

    /**
     * 排序
     */
    private int sort;

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
     * @return 服务包ID
     */
    public BigDecimal getPackId() {
        return packId;
    }

    /**
     * @param packId
     *         服务包ID
     */
    public void setPackId(BigDecimal packId) {
        this.packId = packId;
    }

    /**
     * @return 项目ID
     */
    public BigDecimal getItemId() {
        return itemId;
    }

    /**
     * @param itemId
     *         项目ID
     */
    public void setItemId(BigDecimal itemId) {
        this.itemId = itemId;
    }

    /**
     * @return 排序
     */
    public int getSort() {
        return sort;
    }

    /**
     * @param sort
     *         排序
     */
    public void setSort(int sort) {
        this.sort = sort;
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
