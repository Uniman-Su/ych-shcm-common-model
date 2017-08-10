package com.ych.shcm.o2o.openinf;

/**
 * 对请求的响应对象
 *
 * @param <T>
 *         响应负载的数据
 */
public interface IResponse<T> {

    /**
     * @return 返回的结果
     */
    String getResult();

    /**
     * @return 响应的消息
     */
    String getResultMsg();

    /**
     * @return 响应负载的数据
     */
    T getPayload();

}
