package com.ych.shcm.o2o.parameter;

import java.math.BigDecimal;

/**
 * 查询车辆过期维护信息
 * <p>
 * Created by U on 2017/7/10.
 */
public class QueryCarExpiredMaintenanceParameter extends QueryCarParameter {

    /**
     * 车辆ID
     */
    private BigDecimal carId;

    /**
     * @return 车辆ID
     */
    public BigDecimal getCarId() {
        return carId;
    }

    /**
     * @param carId
     *         车辆ID
     */
    public void setCarId(BigDecimal carId) {
        this.carId = carId;
    }
}
