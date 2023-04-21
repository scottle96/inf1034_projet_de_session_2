package com.example.projet_finale;

import java.util.ArrayList;

public class Database {
    private ArrayList<Student> students;
    private static Database databaseInstance = null;

    private Database() {
        this.students = new ArrayList<>();
    }

    public static Database getInstance() {
        if (databaseInstance == null) {
            databaseInstance = new Database();
            databaseInstance.initializeData();
        }
        return databaseInstance;
    }

    // creation d'enregistrements fictifs pour des test
    private void initializeData() {
        // ajouter des enregistrements d'étudiant
        Student s1 = new Student("Charles", "Beaulieu", "charles72@hotmail.com", "password123");
        Student s2 = new Student("Alice", "Lambert", "alice.lambert@gmail.com", "pass123");
        Student s3 = new Student("Bob", "Smith", "bob.smith@outlook.com", "password1");
        Student s4 = new Student("Martin", "Boulanger", "test", "pass");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

}
