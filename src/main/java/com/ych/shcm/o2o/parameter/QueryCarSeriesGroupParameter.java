package com.ych.shcm.o2o.parameter;

import java.util.List;

import com.ych.core.model.BasePaginableParameter;
import com.ych.shcm.o2o.model.CarSeriesGroupStatus;

/**
 * 查询车系组的参数
 * <p>
 * Created by U on 2017/7/6.
 */
public class QueryCarSeriesGroupParameter extends BasePaginableParameter {

    /**
     * 状态
     */
    private List<CarSeriesGroupStatus> statuses;

    /**
     * @return 状态
     */
    public List<CarSeriesGroupStatus> getStatuses() {
        return statuses;
    }

    /**
     * @param statuses
     *         状态
     */
    public void setStatuses(List<CarSeriesGroupStatus> statuses) {
        this.statuses = statuses;
    }
}
