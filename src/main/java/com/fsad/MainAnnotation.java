package com.fsad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAnnotation {
    public static void main(String[] args) {

        ApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

        StudentAnnotation student =
            context.getBean("studentBean", StudentAnnotation.class);

        System.out.println("=== Annotation-based Injection ===");
        System.out.println(student);

        ((AnnotationConfigApplicationContext) context).close();
    }
}