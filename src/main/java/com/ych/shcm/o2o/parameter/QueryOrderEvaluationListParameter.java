package com.ych.shcm.o2o.parameter;

import com.ych.core.model.BasePaginableMultiSortableParameter;

import java.math.BigDecimal;

/**
 * 查询订单评价列表的参数
 */
public class QueryOrderEvaluationListParameter extends BasePaginableMultiSortableParameter {

    /**
     * 店铺ID
     */
    private BigDecimal shopId;

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
}
