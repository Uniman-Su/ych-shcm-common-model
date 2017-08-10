package com.ych.shcm.o2o.model;

import com.ych.core.model.IntValueHolder;

/**
 * 第三方认证类型
 *
 * Created by U on 2017/7/5.
 */
public enum ThirdAuthType implements IntValueHolder<ThirdAuthType> {

    /**
     * 微信OpenID
     */
    WECHAT_OPENID(0),

    /**
     * 微信UnionID
     */
    WECHAT_UNIONID(1);

    private int value;

    ThirdAuthType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


}
