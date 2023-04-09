package com.example.projet_finale;

public enum Layout {
    LOGIN("Connection.fxml"),
    STUDENT("Student.fxml"),
    TEACHER("Teacher.fxml");
    private String nomFichier;

    Layout(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    public String getNomFichier() {
        return nomFichier;
    }
}