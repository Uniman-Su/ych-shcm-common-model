package com.ych.shcm.o2o.annotation;

import java.lang.annotation.*;

import org.springframework.core.annotation.AliasFor;

/**
 * JWT身份认证和授权的注解
 * <p>
 * Created by U on 2017/7/18.
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface JWTAuth {

    /**
     * @return JWT的签发者
     */
    String[] value() default {};

    /**
     * @return JWT的签发者
     */
    String[] issuer() default {};

}
