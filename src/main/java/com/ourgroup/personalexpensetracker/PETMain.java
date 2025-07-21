package com.ourgroup.personalexpensetracker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class PETMain extends Application{
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com.ourgroup.personalexpensetracker/view/Login.fxml"));
        Scene scene = new Scene(loader.load());
        primaryStage.setTitle("Personal Expense Tracker");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
