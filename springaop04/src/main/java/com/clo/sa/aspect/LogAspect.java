package com.clo.sa.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author XuHong
 * @date 2019年02月18日 11:11
 */
@Aspect
public class LogAspect {
    @Pointcut("@annotation(com.clo.sa.annotation.Loggable))")
    public void logPointcut() {}

    @Before("logPointcut()")
    public void beforeAop() {
        System.err.println("Before aop");
    }
}
