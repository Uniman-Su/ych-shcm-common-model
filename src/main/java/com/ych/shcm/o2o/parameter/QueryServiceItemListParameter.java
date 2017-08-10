package com.ych.shcm.o2o.parameter;

import com.ych.core.model.BasePaginableMultiSortableParameter;
import com.ych.shcm.o2o.model.ServiceStatus;
import com.ych.shcm.o2o.model.ServiceItemType;

/**
 * Created by mxp on 2017/7/14.
 */
public class QueryServiceItemListParameter extends BasePaginableMultiSortableParameter {

    /**
     * 名字
     */
    private String name;

    /**
     * 类型
     */
    private ServiceItemType type;

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
     * @param name
     *         名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return 类型
     */
    public ServiceItemType getType() {
        return type;
    }

    /**
     * @param type
     *         类型
     */
    public void setType(ServiceItemType type) {
        this.type = type;
    }

    /**
     * @return 状态.
     */
    public ServiceStatus getStatus() {
        return status;
    }

    /**
     * @param status
     *         状态
     */
    public void setStatus(ServiceStatus status) {
        this.status = status;
    }
}
