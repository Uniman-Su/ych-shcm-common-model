package com.ych.shcm.o2o.parameter;

import java.math.BigDecimal;

import com.ych.core.model.BasePaginableMultiSortableParameter;

/**
 * 查询车系列表参数
 *
 * @author U
 */
public class QueryCarSeriesListParameter extends BasePaginableMultiSortableParameter {

    /**
     * 品牌ID
     */
    private BigDecimal brandId;

    /**
     * 制造厂ID
     */
    private BigDecimal factoryId;

    /**
     * 名称
     */
    private String name;

    /**
     * 首字母
     */
    private String firstChar;

    /**
     * 是否可用
     */
    private Boolean enabled;

    /**
     * 是否关联品牌查询
     */
    private boolean joinBrand;

    /**
     * 是否关联厂家查询
     */
    private boolean joinFactory;

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
     * @return 制造厂ID
     */
    public BigDecimal getFactoryId() {
        return factoryId;
    }

    /**
     * @param factoryId
     *         制造厂ID
     */
    public void setFactoryId(BigDecimal factoryId) {
        this.factoryId = factoryId;
    }

    /**
     * @return 名称
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *         名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return 首字母
     */
    public String getFirstChar() {
        return firstChar;
    }

    /**
     * @param firstChar
     *         首字母
     */
    public void setFirstChar(String firstChar) {
        this.firstChar = firstChar;
    }

    /**
     * @return 是否可用
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * @param enabled
     *         是否可用
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * @return 是否关联品牌查询
     */
    public boolean isJoinBrand() {
        return joinBrand;
    }

    /**
     * @param joinBrand
     *         是否关联品牌查询
     */
    public void setJoinBrand(boolean joinBrand) {
        this.joinBrand = joinBrand;
    }

    /**
     * @return 是否关联厂家查询
     */
    public boolean isJoinFactory() {
        return joinFactory;
    }

    /**
     * @param joinFactory
     *         是否关联厂家查询
     */
    public void setJoinFactory(boolean joinFactory) {
        this.joinFactory = joinFactory;
    }
}
