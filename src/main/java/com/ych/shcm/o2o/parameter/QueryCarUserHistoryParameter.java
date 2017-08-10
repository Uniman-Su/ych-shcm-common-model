package com.ych.shcm.o2o.parameter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 查询车辆的用户历史变更信息参数
 * <p>
 * Created by U on 2017/7/10.
 */
public class QueryCarUserHistoryParameter extends QueryUserCarParameter {

    /**
     * 旧用户ID
     */
    private BigDecimal oldUserId;

    /**
     * 车辆ID
     */
    private BigDecimal carId;

    /**
     * 变更时间起始
     */
    private Date changeTimeBegin;

    /**
     * 变更时间结束
     */
    private Date changeTimeEnd;

    /**
     * @return 旧用户ID
     */
    public BigDecimal getOldUserId() {
        return oldUserId;
    }

    /**
     * @param oldUserId
     *         旧用户ID
     */
    public void setOldUserId(BigDecimal oldUserId) {
        this.oldUserId = oldUserId;
    }

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

    /**
     * @return 变更时间起始
     */
    public Date getChangeTimeBegin() {
        return changeTimeBegin;
    }

    /**
     * @param changeTimeBegin
     *         变更时间起始
     */
    public void setChangeTimeBegin(Date changeTimeBegin) {
        this.changeTimeBegin = changeTimeBegin;
    }

    /**
     * @return 变更时间结束
     */
    public Date getChangeTimeEnd() {
        return changeTimeEnd;
    }

    /**
     * @param changeTimeEnd
     *         变更时间结束
     */
    public void setChangeTimeEnd(Date changeTimeEnd) {
        this.changeTimeEnd = changeTimeEnd;
    }
}
