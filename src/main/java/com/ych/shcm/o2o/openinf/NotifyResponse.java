package com.ych.shcm.o2o.openinf;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 通知第三方系统时的响应消息格式
 *
 * @param <T>
 *         负载的消息对象
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class NotifyResponse<T> implements INotifyResponse<T> {

    /**
     * 是否成功处理
     */
    private boolean success;

    /**
     * 响应消息描述
     */
    private String msg;

    /**
     * 负载的消息对象
     */
    private T payload;

    @Override
    public boolean isSuccess() {
        return success;
    }

    /**
     * @param success
     *         是否成功处理
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg
     *         响应消息描述
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public T getPayload() {
        return payload;
    }

    /**
     * @param payload
     *         负载的消息对象
     */
    public void setPayload(T payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
