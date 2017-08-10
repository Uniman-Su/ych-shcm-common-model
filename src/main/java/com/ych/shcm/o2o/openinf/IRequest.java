package com.ych.shcm.o2o.openinf;

/**
 * 请求对象
 */
public interface IRequest<T> {

    /**
     * @return 命令类型
     */
    RequestAction getAction();

    /**
     * @return 传递的负载对象
     */
    T getPayload();

}
