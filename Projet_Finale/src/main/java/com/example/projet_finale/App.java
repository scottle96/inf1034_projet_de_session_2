package com.example.projet_finale;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    private Stage stage;
    private static App instance;

    public App() {
        instance = this;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.stage = primaryStage;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
        Scene scene1 = new Scene(loader.<Parent>load(), 660, 440);
        primaryStage.setScene(scene1);
        primaryStage.setResizable(false);
        primaryStage.show();

        // on instancie notre base de données, utilisation de singleton (une seule instance de cette classe est possible)
        Database db = Database.getInstance();
    }

    public Stage getStage() {
        return stage;
    }

    public static App getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        launch(args);
    }

}