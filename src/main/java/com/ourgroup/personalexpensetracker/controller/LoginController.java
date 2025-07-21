package com.ourgroup.personalexpensetracker.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    public void onLoginButtonClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com.ourgroup.personalexpensetracker/view/MainScreenSummary.fxml"));
            Stage stage = (Stage) ((javafx.scene.Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
