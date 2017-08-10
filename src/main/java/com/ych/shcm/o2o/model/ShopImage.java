package com.ych.shcm.o2o.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.ych.core.model.IWithModifier;

/**
 * 店铺图片
 * <p>
 * Created by U on 2017/7/6.
 */
public class ShopImage implements Serializable, IWithModifier {

    private static final long serialVersionUID = 4315380439471818702L;

    /**
     * ID
     */
    private BigDecimal id;

    /**
     * 店铺ID
     */
    private BigDecimal shopId;

    /**
     * 图片路径
     */
    private String imagePath;

    /**
     * 排序
     */
    private int sort;

    /**
     * 修改者ID
     */
    private BigDecimal modifierId;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * @return ID
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * @param id
     *         ID
     */
    public void setId(BigDecimal id) {
        this.id = id;
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
     * @return 图片路径
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * @param imagePath
     *         图片路径
     */
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
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

    @Override
    public BigDecimal getModifierId() {
        return modifierId;
    }

    @Override
    public void setModifierId(BigDecimal modifierId) {
        this.modifierId = modifierId;
    }

    @Override
    public Date getModifyTime() {
        return modifyTime;
    }

    @Override
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
