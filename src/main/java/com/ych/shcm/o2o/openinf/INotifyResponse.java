package com.ych.shcm.o2o.openinf;

/**
 * 通知第三方系统时获得的响应
 *
 * @param <T>
 *         负载的消息对象
 */
public interface INotifyResponse<T> {

    /**
     * @return 是否成功处理
     */
    boolean isSuccess();

    /**
     * @return 响应消息描述
     */
    String getMsg();

    /**
     * @return 负载的消息对象
     */
    T getPayload();

}
