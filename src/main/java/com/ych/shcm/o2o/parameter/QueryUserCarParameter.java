package com.ych.shcm.o2o.parameter;

import java.math.BigDecimal;

/**
 * 查询用户车辆的参数
 * <p>
 * Created by U on 2017/7/10.
 */
public class QueryUserCarParameter extends QueryCarParameter {

    /**
     * 用户ID
     */
    private BigDecimal userId;

    /**
     * @return 用户ID
     */
    public BigDecimal getUserId() {
        return userId;
    }

    /**
     * @param userId
     *         用户ID
     */
    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }
}
