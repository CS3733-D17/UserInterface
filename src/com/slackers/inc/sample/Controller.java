package com.slackers.inc.sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML AnchorPane signUpPane;
    @FXML AnchorPane logInPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {}

    @FXML
    void signUpClick(){
        signUpPane.setVisible(true);
        signUpPane.setManaged(true);
        logInPane.setVisible(false);
        logInPane.setManaged(false);
    }

    @FXML
    void logInClick(){
        signUpPane.setVisible(false);
        signUpPane.setManaged(false);
        logInPane.setVisible(true);
        logInPane.setManaged(true);
    }

}
