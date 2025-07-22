package com.ourgroup.personalexpensetracker;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

public class PETMain extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com.ourgroup.personalexpensetracker/view/Login.fxml"));
        Scene scene = new Scene(loader.load());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Personal Expense Tracker - Login");
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
