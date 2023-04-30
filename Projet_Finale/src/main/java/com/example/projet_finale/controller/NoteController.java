package com.example.projet_finale.controller;

import com.example.projet_finale.Note;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class NoteController  implements Initializable {

    @FXML
    private MenuItem INF1034 = new MenuItem();

    @FXML
    private MenuItem PIF1001 = new MenuItem();

    @FXML
    private MenuItem INF1002 = new MenuItem();

    @FXML
    private MenuItem PIF1005 = new MenuItem();

    @FXML
    private TableView<Note> notesTable = new TableView<>();


    @FXML
    private TableColumn<Note, String> typeCol = new TableColumn<>("type");
    @FXML
    private TableColumn<Note, Double> noteCol = new TableColumn<>("note");
    @FXML
    private TableColumn<Note, Double> midCol = new TableColumn<>("moyenne");

    @FXML
    private Label title = new Label();

    private ObservableList<Note> INF1034Notes = FXCollections.observableArrayList(new Note("Intra", 18.5,17.3),new Note("Devoir 1", 14.75, 9.3));
    private ObservableList<Note> PIF1001Notes = FXCollections.observableArrayList(new Note("Intra", 13.5,15.4),new Note("Devoir 1", 13.3,12.3),new Note("Devoir 2", 8.25,13.3));
    private ObservableList<Note> INF1002Notes = FXCollections.observableArrayList(new Note("Intra", 15.2,20.34),new Note("Devoir 1", 17.75,16.4),new Note("Devoir 2", 16.25,10.3));
    private ObservableList<Note> PIF1005Notes = FXCollections.observableArrayList(new Note("Intra", 27.5,23.3),new Note("Devoir 1", 14.75,15.4));

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("ok  init");
        typeCol.setCellValueFactory(new PropertyValueFactory<>("type"));
        noteCol.setCellValueFactory(new PropertyValueFactory<>("note"));
        midCol.setCellValueFactory(new PropertyValueFactory<>("moyenne"));
        INF1034.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                title.setText("INF1034 - Introduction aux interfaces utilisateur");
                AppController.getInstance().ChargerFenetre("Cours_note.fxml");
                notesTable.setItems(INF1034Notes);
            }
        });
        PIF1001.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                title.setText("INF1034 - Introduction aux interfaces utilisateur");
                AppController.getInstance().ChargerFenetre("Cours_note.fxml");
                notesTable.setItems(PIF1001Notes);
            }
        });
        INF1002.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                title.setText("INF1034 - Introduction aux interfaces utilisateur");
                AppController.getInstance().ChargerFenetre("Cours_note.fxml");
                notesTable.setItems(INF1002Notes);
            }
        });
        PIF1005.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                title.setText("INF1034 - Introduction aux interfaces utilisateur");
                AppController.getInstance().ChargerFenetre("Cours_note.fxml");
                notesTable.setItems(PIF1005Notes);
            }
        });

    }
}
