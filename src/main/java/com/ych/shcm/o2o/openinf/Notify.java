package com.ych.shcm.o2o.openinf;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 发送到第三方系统的消息通知
 *
 * @param <T>
 *         负载的数据
 */
public class Notify<T> implements INotify<T> {

    /**
     * 通知消息类型
     */
    private NotifyMsgType msgType;

    /**
     * 负载消息
     */
    private T payload;

    @Override
    public NotifyMsgType getMsgType() {
        return msgType;
    }

    /**
     * @param msgType
     *         通知消息类型
     */
    public void setMsgType(NotifyMsgType msgType) {
        this.msgType = msgType;
    }

    @Override
    public T getPayload() {
        return payload;
    }

    /**
     * @param payload
     *         负载消息
     */
    public void setPayload(T payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
