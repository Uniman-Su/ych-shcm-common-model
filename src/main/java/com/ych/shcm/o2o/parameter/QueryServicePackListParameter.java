package com.ych.shcm.o2o.parameter;

import com.ych.core.model.BasePaginableMultiSortableParameter;
import com.ych.shcm.o2o.model.ServiceStatus;

/**
 * Created by mxp on 2017/7/14.
 */
public class QueryServicePackListParameter extends BasePaginableMultiSortableParameter{

    /**
     * 名字
     */
    private String name;

    /**
     * 状态
     */
    private ServiceStatus status;

    /**
     * @return 名字
     */
    public String getName() {
        return name;
    }

    /**
     * @param name 名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return 状态
     */
    public ServiceStatus getStatus() {
        return status;
    }

    /**
     * @param status 状态
     */
    public void setStatus(ServiceStatus status) {
        this.status = status;
    }
}
