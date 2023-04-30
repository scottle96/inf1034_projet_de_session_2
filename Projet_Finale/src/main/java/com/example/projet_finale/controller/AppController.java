package com.example.projet_finale.controller;

import com.example.projet_finale.App;
import com.example.projet_finale.Layout;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.TextFieldListCell;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AppController implements Initializable {
    @FXML private ListView<String> presidentsListView = new ListView<>();
    // Création de l'élément de ListView pour le titre
    private static AppController instance;
    public static AppController getInstance() {
        if (instance == null) {
            instance = new AppController();
        }
        return instance;
    }

    // Méthodes @FXML
    @FXML private void AfficherFenetre(ActionEvent event){
        Node source = (Node) event.getSource();
        Layout type = Layout.valueOf((String) source.getUserData());
        ChargerFenetre(type.getNomFichier());
    }

    public void ChargerFenetre(String NomFichier) {
        System.out.println(NomFichier);
        try {
            Parent parent = FXMLLoader.load(App.class.getResource(NomFichier)) ;
            Scene scene = null;
            if (NomFichier.equals("Login.fxml")) {
                scene = new Scene(parent, 660, 440);
            } else {
                scene = new Scene(parent, 700, 500);
            }
            App.getInstance().getStage().setScene(scene);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
     //pour fermer la fenetre
    public void exit(ActionEvent actionEvent) {
        Platform.exit();
    }

    // Méthode de l'interface Initializable
    @Override
    public void initialize(URL location, ResourceBundle resources) {
           String[] presidents = {
                   "\t\tINF1034\t\t11 Mars (19h)\t\tLocal 4020",
                   "\t\tPIF1001\t\t11 Mars (15h)\t\tLocal 1500",
                   "\t\tINF1002\t\t12 Mars (8h30)\tLocal 3040",
                   "\t\tPIF1005\t\t14 Mars (8h30)\tLocal 2100",
                   "\t\tINF1034\t\t18 Mars (19h)\t\tLocal 4020",
                   "\t\tPIF1001\t\t18 Mars (15h)\t\tLocal 1500",
                   "\t\tINF1002\t\t19 Mars (8h30)\tLocal 3040",
                   "\t\tPIF1005\t\t21 Mars (8h30)\tLocal 2100",
                   "\t\tINF1034\t\t25 Mars (19h)\t\tLocal 4020",
                   "\t\tPIF1001\t\t25 Mars (15h)\t\tLocal 1500",
                   "\t\tINF1002\t\t26 Mars (8h30)\tLocal 3040",
                   "\t\tPIF1005\t\t28 Mars (8h30)\tLocal 2100"
            };
            ObservableList<String> items = FXCollections.observableArrayList(presidents);
            presidentsListView.setItems(items);
            presidentsListView.setEditable(true);
            presidentsListView.setCellFactory(TextFieldListCell.forListView());
        }

    public void handleMenuSelection(ActionEvent actionEvent) {
    }


}
