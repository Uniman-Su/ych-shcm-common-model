package com.ych.shcm.o2o.model;


import com.ych.core.model.AbstractIntValueHolder;
import com.ych.core.model.IntValueHolder;

/**
 * 支付类型
 *
 * @author U
 */
public enum PayChannel implements IntValueHolder<PayChannel> {

    /**
     * 无须支付
     */
    NOPAY(0),
    /**
     * 支付宝
     */
    ALIPAY(1),

    /**
     * 微信
     */
    WXPAY(2),

    /**
     * 银联手机
     */
    UNIONPAY(3),

    /**
     * BB支付
     */
    BBPAY(4),

    /**
     * 银联 B2C
     */
    UNIONPAYB2C(5),

    /**
     * 银联 B2B
     */
    UNIONPAYB2B(6),
    
    /**
     * 商银时代
     */
    MERSILVERTIMES(7);


    private int value;

    private PayChannel(int value) {
        this.value = value;
    }

    /* (non-Javadoc)
     * @see com.ych.s1.core.model.IntValueHolder#getValue()
     */
    @Override
    public int getValue() {
        return value;
    }

    /**
     * 根据数值获取枚举
     *
     * @param value 数值
     * @return 枚举
     */
    public PayChannel valueOf(int value) {
        return AbstractIntValueHolder.valueOf(PayChannel.class, value);
    }

}
