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

/**
 * Created by SrinuL on 3/28/17.
 */
public class MainController implements Initializable{
    @FXML
    AnchorPane mainContainer;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("This works");

        try {
            Pane root = (AnchorPane) FXMLLoader.load(getClass().getResource("../FXML/search.fxml"));
            mainContainer.getChildren().setAll(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





}
