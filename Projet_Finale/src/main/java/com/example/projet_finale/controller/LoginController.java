package com.example.projet_finale.controller;

import com.example.projet_finale.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;


public class LoginController {
    @FXML
    private TextField emailTextField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label errorLabel;

    // click du bouton login
    public void onloginButtonClick(ActionEvent event) throws IOException {
        Database db = Database.getInstance();
        boolean isLoggedIn = false;

        // verification dans la liste d'etudiant
        for (Student s : db.getStudents()) {
            if (s.getEmail().equals(emailTextField.getText()) && s.getPassword().equals(passwordField.getText())) {
                System.out.println("Étudiant connecté : " + s.getFirstName() + " " + s.getLastName());
                isLoggedIn = true;
                // afficher interface des etudiants
                AppController.getInstance().ChargerFenetre(Layout.STUDENT.getNomFichier());
                break;
            }
        }

        // verification dans la liste de prof
        if (!isLoggedIn) {
            for (Teacher t : db.getTeachers()) {
                if (t.getEmail().equals(emailTextField.getText()) && t.getPassword().equals(passwordField.getText())) {
                    System.out.println("Professeur connecté : " + t.getFirstName() + " " + t.getLastName());
                    isLoggedIn = true;
                    // afficher interface des enseignant
                    AppController.getInstance().ChargerFenetre(Layout.TEACHER.getNomFichier());
                    break;
                }
            }
        }

        // Si le email et le mot de passe ne match pas
        if (!isLoggedIn) {
            errorLabel.setText("Identifiant et/ou mot de passe invalide");
        }
    }

    public void loginCheck(String email, String password) {

    }

}
