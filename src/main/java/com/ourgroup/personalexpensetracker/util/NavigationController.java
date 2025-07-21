package com.ourgroup.personalexpensetracker.util;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class NavigationController {

    private static Stage mainStage;

    public static void setStage(Stage stage) {
        mainStage = stage;
    }

    public static void loadScene(String fxmlPath, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(NavigationController.class.getResource(fxmlPath));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            mainStage.setScene(scene);
            mainStage.setTitle(title);
            mainStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
