package com.example.projet_finale.controller;

import com.example.projet_finale.Task;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TaskListController {
    // Définition des éléments de l'interface utilisateur
    @FXML
    private TableView<Task> taskTable;
    @FXML
    private TableColumn<Task, LocalDate> dateColumn;
    @FXML
    private TableColumn<Task, String> titleColumn;
    @FXML
    private TextField dateField;
    @FXML
    private TextField titleField;

    // Création d'une liste observable pour stocker les tâches
    private final ObservableList<Task> tasks = FXCollections.observableArrayList();

    // Méthode qui est appelée lorsque la vue est initialisée
    public void initialize() {
        // Ajout de quelques tâches de démonstration à la liste des tâches
        tasks.add(new Task(LocalDate.now(), "Devoir 1 INF1034"));
        tasks.add(new Task(LocalDate.now(), "Devoir 1 PIF1001"));
        tasks.add(new Task(LocalDate.now(), "Devoir 1 PIF1005"));

        // Configuration des colonnes pour afficher les données de la tâche appropriée
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));

        // Configuration de la TableView pour afficher les tâches
        taskTable.setItems(tasks);
    }

    // Méthode appelée lorsqu'on clique sur le bouton "Ajouter"
    @FXML
    private void handleAddButton() {
        // Récupération de la date saisie dans le champ de texte "dateField"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dateField.getText(), formatter);

        // Récupération du titre de la tâche saisie dans le champ de texte "titleField"
        String title = titleField.getText();

        // Création d'une nouvelle tâche avec la date et le titre récupérés et ajout à la liste des tâches
        tasks.add(new Task(date, title));

        // Effacement des champs de texte après l'ajout de la tâche
        dateField.clear();
        titleField.clear();
    }

    // Méthode appelée lorsqu'on clique sur le bouton "retirer"
    @FXML
    private void handleDeleteButton() {
        // Récupération de la tâche sélectionnée dans la TableView
        Task selectedTask = taskTable.getSelectionModel().getSelectedItem();

        // Suppression de la tâche sélectionnée de la liste des tâches
        tasks.remove(selectedTask);
    }
}
