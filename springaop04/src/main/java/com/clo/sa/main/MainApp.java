package com.clo.sa.main;

import com.clo.sa.domain.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author XuHong
 * @date 2019年02月18日 11:19
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();
    }
}
