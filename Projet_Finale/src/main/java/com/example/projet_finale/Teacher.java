package com.example.projet_finale;

// La classe Teacher
public class Teacher extends User {
    private String teacherId;

    public Teacher(String name, String email, String password, String teacherId) {
        super(name, email, password);
        this.teacherId = teacherId;
    }

    public String getRole() { return "Teacher"; }

    // Getter and setter for teacherId
    public String getTeacherId() { return teacherId; }
    public void setTeacherId(String teacherId) { this.teacherId = teacherId; }
}