package com.fsad;

import org.springframework.stereotype.Component;

@Component
public class Certification {

    private int id = 301;
    private String name = "AWS Certified Developer";
    private String dateOfCompletion = "2024-01-15";

    @Override
    public String toString() {
        return "Certification [ID=" + id + ", Name=" + name +
               ", Date=" + dateOfCompletion + "]";
    }
}