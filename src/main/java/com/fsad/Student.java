package com.fsad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private int id = 101;
    private String name = "Anjali Reddy";
    private String gender = "Female";

    @Autowired
    private Certification certification;

    @Override
    public String toString() {
        return "Student [ID=" + id + ", Name=" + name +
               ", Gender=" + gender + "]\n" +
               "Certification: " + certification;
    }
}