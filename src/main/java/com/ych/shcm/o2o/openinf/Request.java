package com.ych.shcm.o2o.openinf;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 第三方系统主动请求事件
 *
 * @param <T> 负载的对象
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Request<T> implements IRequest<T> {

    /**
     * 请求类型
     */
    private RequestAction action;

    /**
     * 负载的对象
     */
    private T payload;

    @Override
    public RequestAction getAction() {
        return action;
    }

    /**
     *
     * @param action 请求类型
     */
    public void setAction(RequestAction action) {
        this.action = action;
    }

    @Override
    public T getPayload() {
        return payload;
    }

    /**
     *
     * @param payload 负载的对象
     */
    public void setPayload(T payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
