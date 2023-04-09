package com.example.projet_finale;

// La classe Student
public class Student extends User {

    public Student(String fname, String lname, String email, String password) {
        super(fname, lname, email, password);
    }

    public String getRole() {
        return "Student";
    }
}
