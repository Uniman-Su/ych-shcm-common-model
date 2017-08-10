package com.ych.shcm.o2o.model;

import java.math.BigDecimal;

/**
 * 车辆过期的维护信息
 * <p>
 * Created by U on 2017/7/10.
 */
public class CarExpiredMaintenanceInfo extends Car {

    private static final long serialVersionUID = 8807356881884695218L;

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
