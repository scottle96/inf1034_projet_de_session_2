package com.example.projet_finale;

import java.time.LocalDate;

public class Task {
    // Définition des attributs de la classe Task
    private LocalDate date;
    private String title;

    // Constructeur de la classe Task
    public Task(LocalDate date, String title ) {
        // Initialisation des attributs de la classe Task
        this.date = date;
        this.title = title;
    }

    // Méthode pour récupérer la date de la tâche
    public LocalDate getDate() {
        return date;
    }

    // Méthode pour récupérer le titre de la tâche
    public String getTitle() {
        return title;
    }

    // Méthode pour obtenir une représentation en chaîne de caractères de la tâche
    @Override
    public String toString() {
        return date.toString() + " - " + title;
    }
}
