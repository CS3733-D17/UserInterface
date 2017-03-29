package com.slackers.inc.sample.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class MainController implements Initializable{

    @FXML private AnchorPane mainContainer;
    @FXML private Pane search;
    @FXML private Pane applications;
    @FXML private Pane form;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            search = (AnchorPane) FXMLLoader.load(getClass().getResource("../FXML/search.fxml"));
            applications = (AnchorPane) FXMLLoader.load(getClass().getResource("../FXML/applications.fxml"));
            form = (AnchorPane) FXMLLoader.load(getClass().getResource("../FXML/form.fxml"));

            mainContainer.getChildren().setAll(applications);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void applicationClick(){
        mainContainer.getChildren().setAll(applications);
    }

    @FXML
    private void searchClick(){
        mainContainer.getChildren().setAll(search);
    }

    @FXML
    private void settingsClick(){
        mainContainer.getChildren().setAll(form);
    }





}
