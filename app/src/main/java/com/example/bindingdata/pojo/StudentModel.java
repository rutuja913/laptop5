package com.example.bindingdata.pojo;

public class StudentModel {
    private String studentName;
    private String studentClass;
    private String studentAge;
    private String studentEmail;

    public StudentModel(String studentName, String studentClass, String studentAge, String studentEmail) {
        this.studentName = studentName;
        this.studentClass = studentClass;
        this.studentAge = studentAge;
        this.studentEmail = studentEmail;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }
}
