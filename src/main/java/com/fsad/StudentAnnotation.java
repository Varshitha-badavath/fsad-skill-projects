package com.fsad;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("studentBean")
public class StudentAnnotation {

    @Value("201")
    private int studentId;

    @Value("Anjali Reddy")
    private String name;

    private String course;
    private String year;

    public StudentAnnotation() {}

    @Value("B.Sc AI&DS")
    public void setCourse(String course) {
        this.course = course;
    }

    @Value("Final Year")
    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "StudentAnnotation [ID=" + studentId + ", Name=" + name +
               ", Course=" + course + ", Year=" + year + "]";
    }
}