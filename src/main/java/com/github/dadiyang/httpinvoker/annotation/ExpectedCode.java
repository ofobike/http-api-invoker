package com.github.dadiyang.httpinvoker.annotation;

import java.lang.annotation.*;

/**
 * 正确的code是什么
 * <p>
 * 默认为 0
 * <p>
 * 接口返回值 code 不统一，有些接口 code 为 0 时表明成功，有些则为 1
 * <p>
 * 因此创建此注解
 *
 * @author huangxuyang
 * @since 1.1.4
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface ExpectedCode {
    int value() default 0;
}
