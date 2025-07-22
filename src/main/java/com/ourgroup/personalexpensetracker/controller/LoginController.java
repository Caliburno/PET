package com.ourgroup.personalexpensetracker.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Node;

import java.io.IOException;

public class LoginController {

    @FXML
    public void onLoginButtonClick(ActionEvent event) {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com.ourgroup.personalexpensetracker/view/MainScreen.fxml"));
            Scene scene = new Scene(loader.load());
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Personal Expense Tracker - Home");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
