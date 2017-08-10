package com.ych.shcm.o2o.model;

import org.jose4j.keys.HmacKey;

/**
 * 常量
 * <p>
 * Created by U on 2017/7/4.
 */
public interface Constants extends com.ych.core.Constants {

    /**
     * 缓存管理器的名称
     */
    String CACHE_MANAGER = "ychSHCMCache";

    /**
     * 事务管理器
     */
    String TRANSACTION_MANAGER = "ychSHCMTxMgr";

    /**
     * 事务模板名称
     */
    String TRANSACTION_TEMPLATE = "ychSHCMTxTemplate";

    /**
     * SQLSessionTemplate的名称
     */
    String SQL_SESSION_TEMPLATE = "ychSHCMSQLSessionTemplate";

    /**
     * 微信公众平台JWT的发行者
     */
    String WECHAT_MP_ISSUER = "ychSHCMWXMP";

    /**
     * 微信公众平台用户会话JWT主题
     */
    String WECHAT_MP_USER_JWT = "ychSHCMWXMPUserJWT";

    /**
     * JWT的Key
     */
    HmacKey JWT_KEY = new HmacKey("ychSecondHandCarMaintenanceUserJWTSecurityKey".getBytes());

    /**
     * JWT的Key ID
     */
    String JWT_KEY_ID = "1";

    /**
     * 后台管理员的JWT发行者
     */
    String WEB_CONSOLE_OPERATOR_ISSUER = "ychSHCMWebConsole";

    /**
     * 后台管理员的JWT主题
     */
    String WEB_CONSOLE_OPERATOR_JWT = "ychSHCMWCOperatorJWT";

    /**
     * 操作员密码保存时计算散列值使用的安全键值
     */
    String WEB_CONSOLE_OPERATOR_PASSWORD_SECURITY_KEY = "ychSHCMOperatorPassKey";

    /**
     * 用户密码保存时计算散列值使用的安全键值
     */
    String USER_PASSWORD_SECURITY_KEY = "ychSHCMUserPassKey";

    /**
     * 调度任务执行器
     */
    String TASK_EXECUTOR = "ychSHCMTaskExecutor";

    /**
     * 默认的RestTemplate
     */
    String DEFAULT_REST_TEMPLATE = "ychSHCMRestTemplate";

}
