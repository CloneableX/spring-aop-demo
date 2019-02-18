package com.clo.sa.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author XuHong
 * @date 2019年02月18日 10:44
 */
@Aspect
public class LogAspect {
    @Pointcut("execution(* com.clo.sa.domain.*.*(..))")
    public void logPointCut() {}

    @Before("logPointCut()")
    public void beforeAop() {
        System.err.println("Before aop");
    }
}
