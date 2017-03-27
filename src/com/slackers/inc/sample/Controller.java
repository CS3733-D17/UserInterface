package com.slackers.inc.sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;


import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML ToggleGroup signType;
    @FXML ToggleButton signUpButton;
    @FXML ToggleButton logInButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {}

    @FXML
    void hello(){
        System.out.println("button1");
    }

    @FXML
    void bye(){
        System.out.println("button2");
    }

}
