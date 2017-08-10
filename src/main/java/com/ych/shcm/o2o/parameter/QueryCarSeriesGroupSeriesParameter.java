package com.ych.shcm.o2o.parameter;

import java.math.BigDecimal;

import com.ych.core.model.BasePaginableParameter;

/**
 * 查询车系组车系的参数
 * <p>
 * Created by U on 2017/7/6.
 */
public class QueryCarSeriesGroupSeriesParameter extends BasePaginableParameter {

    /**
     * 车系组的ID
     */
    private BigDecimal groupId;

    /**
     * 品牌ID
     */
    private BigDecimal brandId;

    /**
     * 车厂ID
     */
    private BigDecimal factoryId;

    /**
     * @return 车系组的ID
     */
    public BigDecimal getGroupId() {
        return groupId;
    }

    /**
     * @param groupId
     *         车系组的ID
     */
    public void setGroupId(BigDecimal groupId) {
        this.groupId = groupId;
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

    /**
     * @return 车厂ID
     */
    public BigDecimal getFactoryId() {
        return factoryId;
    }

    /**
     * @param factoryId
     *         车厂ID
     */
    public void setFactoryId(BigDecimal factoryId) {
        this.factoryId = factoryId;
    }
}
