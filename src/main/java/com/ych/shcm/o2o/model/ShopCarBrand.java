package com.ych.shcm.o2o.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.ych.core.model.IWithModifier;

/**
 * 店铺的车型品牌
 * <p>
 * Created by U on 2017/7/7.
 */
public class ShopCarBrand implements Serializable, IWithModifier {

    private static final long serialVersionUID = 1184724914598713742L;

    /**
     * ID
     */
    private BigDecimal id;

    /**
     * 店铺ID
     */
    private BigDecimal shopId;

    /**
     * 品牌ID
     */
    private BigDecimal brandId;

    /**
     * 修改者ID
     */
    private BigDecimal modifierId;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 车型品牌
     */
    private CarBrand carBrand;

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
     * @return 品牌ID
     */
    public BigDecimal getBrandId() {
        return brandId;
    }

    /**
     * @param brandId
     *         品牌ID
     */
    public void setBrandId(BigDecimal brandId) {
        this.brandId = brandId;
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

    /**
     * @return 车型品牌
     */
    public CarBrand getCarBrand() {
        return carBrand;
    }

    /**
     * @param carBrand
     *         车型品牌
     */
    public void setCarBrand(CarBrand carBrand) {
        this.carBrand = carBrand;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
