package com.ourgroup.personalexpensetracker.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.Node;

public class MainScreenController {

    @FXML
    private BorderPane mainBorderPane;

    @FXML
    private void showLogView() {
        loadCenter("/com/ourgroup/personalexpensetracker/view.LogMovements.fxml");
    }

    @FXML
    private void showMovementManagementeView() {
        loadCenter("/com/ourgroup/personalexpensetracker/view.MovementManagement.fxml");
    }

    @FXML
    private void showSummaryView() {
        loadCenter("/com/ourgroup/personalexpensetracker/view.Summary.fxml");
    }

    @FXML
    private void showConfigView(){
        loadCenter("/com/ourgroup/personalexpensetracker/view.Config.fxml");
    }

    private void loadCenter(String fxmlPath) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Node view = loader.load();
            mainBorderPane.setCenter(view);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
