package com.demkom58.ids_lab_1.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.SneakyThrows;

public class CalcClient extends Application {
    @Override
    @SneakyThrows
    public void start(Stage stage) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/main.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root);

        stage.setResizable(false);
        stage.setTitle("ЗІРПС: ЛР №1");
        stage.setScene(scene);
        stage.show();
    }
}
