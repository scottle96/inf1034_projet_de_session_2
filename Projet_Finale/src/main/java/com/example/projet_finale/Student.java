package com.example.projet_finale;

// La classe Student
public class Student extends User {
    private String studentId;

    public Student(String name, String email, String password, String studentId) {
        super(name, email, password);
        this.studentId = studentId;
    }

    public String getRole() { return "Student"; }

    // Getter and setter for studentId
    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }
}
