package com.example.projet_finale;

import java.util.ArrayList;

public class Database {
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;
    private static Database databaseInstance = null;

    private Database() {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
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

        // ajouter des enregistrements de professeur
        Teacher t1 = new Teacher("John", "Doe", "john.doe@university.edu", "teach123");
        Teacher t2 = new Teacher("Jane", "Smith", "jane.smith@college.edu", "teacher1");
        teachers.add(t1);
        teachers.add(t2);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }
}
