package com.slackers.inc.sample.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class MainController implements Initializable{
    @FXML
    private AnchorPane mainContainer;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("This works");

        try {
            Pane search = (AnchorPane) FXMLLoader.load(getClass().getResource("../FXML/search.fxml"));
            Pane applications = (AnchorPane) FXMLLoader.load(getClass().getResource("../FXML/applications.fxml"));
            Pane form = (AnchorPane) FXMLLoader.load(getClass().getResource("../FXML/form.fxml"));

            mainContainer.getChildren().setAll(applications);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





}
