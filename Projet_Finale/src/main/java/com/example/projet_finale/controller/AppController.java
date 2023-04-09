package com.example.projet_finale.controller;

import com.example.projet_finale.App;
import com.example.projet_finale.Layout;
import javafx.beans.property.Property;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AppController implements Initializable {
    @FXML private ListView<String> presidentsListView = new ListView<>();
    // singleton
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
            if (NomFichier.equals("Connection.fxml")) {
                scene = new Scene(parent, 660, 440);
            } else {
                scene = new Scene(parent, 700, 500);
            }
            App.getInstance().getStage().setScene(scene);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Méthode de l'interface Initializable
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        String[] presidents = {
                "George Washington",
                "John Adams",
                "Thomas Jefferson",
                "James Madison",
                "James Monroe",
                "John Quincy Adams",
                "Andrew Jackson",
                "Martin Van Buren",
                "William Henry Harrison",
                "John Tyler",
                "James K. Polk",
                "Zachary Taylor",
                "Millard Fillmore",
                "Franklin Pierce",
                "James Buchanan",
                "Abraham Lincoln",
                "Andrew Johnson",
                "Ulysses S. Grant",
                "Rutherford B. Hayes",
                "James A. Garfield",
                "Chester A. Arthur",
                "Grover Cleveland",
                "Benjamin Harrison",
                "Grover Cleveland",
                "William McKinley",
                "Theodore Roosevelt",
                "William Howard Taft",
                "Woodrow Wilson",
                "Warren G. Harding",
                "Calvin Coolidge",
                "Herbert Hoover",
                "Franklin D. Roosevelt",
                "Harry S. Truman",
                "Dwight D. Eisenhower",
                "John F. Kennedy",
                "Lyndon B. Johnson",
                "Richard Nixon",
                "Gerald Ford",
                "Jimmy Carter",
                "Ronald Reagan",
                "George H. W. Bush",
                "Bill Clinton",
                "George W. Bush",
                "Barack Obama",
                "Donald Trump",
                "Joe Biden"
        };

        ObservableList<String> items = FXCollections.observableArrayList(presidents);
        presidentsListView.setItems(items);
        presidentsListView.setEditable(true);
        presidentsListView.setCellFactory(TextFieldListCell.forListView());
    }
}