package com.ych.shcm.o2o.openinf;

/**
 * 发送到第三方系统的通知
 *
 * @param <T>
 */
public interface INotify<T> {

    /**
     * @return 消息类型
     */
    NotifyMsgType getMsgType();

    /**
     * @return 负载消息
     */
    T getPayload();

}
