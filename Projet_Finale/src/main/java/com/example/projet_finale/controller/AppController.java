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

    // Méthodes privées
    public void ChargerFenetre(String NomFichier) {
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
                   "INF1034\t\t 11 Mars (19h)         Local 4020",
                   "PIF1001\t\t 11 Mars (15h)         Local 1500",
                   "INF1002\t\t 12 Mars (8h30)        Local 3040",
                   "PIF1005\t\t 14 Mars (8h30)        Local 2100",
                   "INF1034\t\t 18 Mars (19h)         Local 4020",
                   "PIF1001\t\t 18 Mars (15h)         Local 1500",
                   "INF1002\t\t 19 Mars (8h30)        Local 3040",
                   "PIF1005\t\t 21 Mars (8h30)        Local 2100",
                   "INF1034\t\t 25 Mars (19h)         Local 4020",
                   "PIF1001\t\t 25 Mars (15h)         Local 1500",
                   "INF1002\t\t 26 Mars (8h30)        Local 3040",
                   "PIF1005\t\t 28 Mars (8h30)        Local 2100"
            };
            ObservableList<String> items = FXCollections.observableArrayList(presidents);
            presidentsListView.setItems(items);
            presidentsListView.setEditable(true);
            presidentsListView.setCellFactory(TextFieldListCell.forListView());
        }

    public void handleMenuSelection(ActionEvent actionEvent) {
    }
}
