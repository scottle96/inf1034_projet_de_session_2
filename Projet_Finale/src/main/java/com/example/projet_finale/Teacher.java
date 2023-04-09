package com.example.projet_finale;

// La classe Teacher
public class Teacher extends User {

    public Teacher(String fname, String lname, String email, String password) {
        super(fname, lname, email, password);

    }

    public String getRole() {
        return "Teacher";
    }
}