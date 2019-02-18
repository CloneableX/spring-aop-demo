package com.clo.sa.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author XuHong
 * @date 2019年02月18日 9:45
 */
@Aspect
public class LogAspect {
    @Pointcut("execution(* com.clo.sa.domain.*.*(..))")
    public void logPointcut() {}

    @Before("logPointcut()")
    public void beforeAop() {
        System.err.println("Before aop");
    }

    @After("logPointcut()")
    public void afterAop() {
        System.err.println("After aop");
    }

    @AfterReturning(pointcut = "logPointcut()", returning = "returnObj")
    public void afterReturningAop(Object returnObj) {
        System.err.println("After returning aop, return obj is:" + returnObj);
    }

    @AfterThrowing(pointcut = "logPointcut()", throwing = "ex")
    public void afterThrowingAop(Exception ex) {
        System.err.println("After throwing aop, throwing exception is:" + ex.getMessage());
        ex.printStackTrace(System.err);
    }

    @Around("logPointcut()")
    public Object aroundAop(ProceedingJoinPoint pjp) throws Throwable {
        System.err.println("Around aop start");
        Object result = pjp.proceed();
        System.err.println("Around aop end");
        return result;
    }
}
