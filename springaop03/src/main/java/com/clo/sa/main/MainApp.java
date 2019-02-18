package com.clo.sa.main;

import com.clo.sa.aspect.LogAspect;
import com.clo.sa.domain.Student;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author XuHong
 * @date 2019年02月18日 10:49
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Student student = (Student) context.getBean("student");

        AspectJProxyFactory factory = new AspectJProxyFactory(student);
        factory.addAspect(LogAspect.class);
        Student studentProxy = factory.getProxy();
        studentProxy.getName();
    }
}
