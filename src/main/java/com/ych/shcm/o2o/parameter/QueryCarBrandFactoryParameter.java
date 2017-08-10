package com.ych.shcm.o2o.parameter;

import java.math.BigDecimal;

import com.ych.core.model.BasePaginableSortableParameter;

/**
 * 查询车型品牌关联参数
 * <p>
 * Created by U on 2017/5/25.
 */
public class QueryCarBrandFactoryParameter extends BasePaginableSortableParameter {

    /**
     * 品牌ID
     */
    private BigDecimal brandId;

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

}
