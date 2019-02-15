package com.clo.sa.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author XuHong
 * @date 2019年02月15日 16:33
 */
public class LogAspect {
    public void beforeAdvice() {
        System.err.println("before Student join point");
    }

    public void afterAdvice() {
        System.err.println("after Student join point");
    }

    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.err.println("around Student join point start");
        Object result = pjp.proceed();
        System.err.println("around Student join point end");
        return result;
    }

    public void afterReturningAdvice(Object returnObj) {
        System.err.println("Student join point return: " + returnObj);
    }

    public void afterThrowingAdvice(Exception ex) {
        System.err.println("Student join point throwing: " + ex.getMessage());
        ex.printStackTrace(System.out);
    }
}
