package com.fsad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXML {
    public static void main(String[] args) {

        ApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");

        Student s1 = (Student) context.getBean("studentConstructor");
        System.out.println("=== Constructor Injection ===");
        System.out.println(s1);

        Student s2 = (Student) context.getBean("studentSetter");
        System.out.println("\n=== Setter Injection ===");
        System.out.println(s2);

        ((ClassPathXmlApplicationContext) context).close();
    }
}