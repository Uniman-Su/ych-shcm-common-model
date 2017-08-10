package com.ych.shcm.o2o.openinf;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 开放接口的响应对象
 *
 * @param <T>
 */
public class Response<T> implements IResponse<T> {

    /**
     * 返回结果
     */
    private String result;

    /**
     * 结果描述
     */
    private String resultMsg;

    /**
     * 负载的数据
     */
    private T payload;

    /**
     * 默认构造方法
     */
    public Response() {
    }

    /**
     * 构造方法
     *
     * @param result
     *         返回结果
     * @param resultMsg
     *         返回结果描述
     */
    public Response(String result, String resultMsg) {
        this.result = result;
        this.resultMsg = resultMsg;
    }

    /**
     * 构造方法
     *
     * @param result
     *         返回结果
     * @param resultMsg
     *         返回结果描述
     * @param payload
     *         负载数据
     */
    public Response(String result, String resultMsg, T payload) {
        this.result = result;
        this.resultMsg = resultMsg;
        this.payload = payload;
    }

    @Override
    public String getResult() {
        return result;
    }

    /**
     * @param result
     *         返回结果
     */
    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String getResultMsg() {
        return resultMsg;
    }

    /**
     * @param resultMsg
     *         结果描述
     */
    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    @Override
    public T getPayload() {
        return payload;
    }

    /**
     * @param payload
     *         负载的数据
     */
    public void setPayload(T payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
