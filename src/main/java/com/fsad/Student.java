package com.fsad;

<<<<<<< HEAD
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
=======
public class Student {

    private int studentId;
    private String name;
    private String course;
    private String year;

    public Student(int studentId, String name, String course, String year) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.year = year;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student [ID=" + studentId + ", Name=" + name +
               ", Course=" + course + ", Year=" + year + "]";
>>>>>>> d8d2a10656d94910d63362c490ab366158dcefdf
    }
}