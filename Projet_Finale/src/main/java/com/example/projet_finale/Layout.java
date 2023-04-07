package com.example.projet_finale;

public enum Layout {
    CONNECTION("Connection.fxml"),
    ETUDIANT("Student.fxml"),
    ENSEIGNANT("Teacher.fxml");
    private String nomFichier;
    Layout(String nomFichier){
        this.nomFichier=nomFichier;
    }

    public String getNomFichier() {
        return nomFichier;
    }
}