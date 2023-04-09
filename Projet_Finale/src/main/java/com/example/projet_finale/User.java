package com.example.projet_finale;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

// La classe abstraite User
public abstract class User {
    private String fname;
    private String lName;
    private String email;
    private String password;

    public User(String firstName, String lastName, String email, String password) {
        this.fname = firstName;
        this.lName = lastName;
        this.email = email;
        this.password = password;
    }

    // Save un user dans le JSON
    public void saveToJson(File file) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(file, this);
    }

    // Load un user à partir du JSON
    public static User loadFromJson(File file) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(file, User.class);
    }

    // Getters
    public abstract String getRole();


    public String getFirstName() {
        return fname;
    }

    public String getLastName() {
        return lName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}
