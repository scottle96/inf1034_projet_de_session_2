package com.example.projet_finale;

public enum Layout {
    LOGIN("Login.fxml"),
    STUDENT("Student.fxml"),
    TEACHER("Teacher.fxml"),
    TRAVAUX("Travaux.fxml"),
    NOTE("Note.fxml"),
    HORAIRE("Horaire.fxml");
    private String nomFichier;

    Layout(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    public String getNomFichier() {
        return nomFichier;
    }
}