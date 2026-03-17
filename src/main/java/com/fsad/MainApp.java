package com.fsad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        // Using Annotation config
        ApplicationContext annotationContext =
            new AnnotationConfigApplicationContext(AppConfig.class);

        Student s1 = annotationContext.getBean(Student.class);
        System.out.println("=== Annotation-based Autowiring ===");
        System.out.println(s1);

        ((AnnotationConfigApplicationContext) annotationContext).close();

        // Using XML config
        ApplicationContext xmlContext =
            new ClassPathXmlApplicationContext("applicationContext.xml");

        Student s2 = xmlContext.getBean(Student.class);
        System.out.println("\n=== XML-based Autowiring ===");
        System.out.println(s2);

        ((ClassPathXmlApplicationContext) xmlContext).close();
    }
}
