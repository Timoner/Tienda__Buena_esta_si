package com.example.tienda_classe.vista;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

 public class VentanaPrincipal extends Application {

   @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/tienda_classe/ejemplo.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Gestión de tienda");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
