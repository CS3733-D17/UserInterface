package com.slackers.inc.sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    Parent login;
    Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        login = FXMLLoader.load(getClass().getResource("FXML/loginregisterform.fxml"));
        String cssDoc = getClass().getResource("CSS/custom.css").toExternalForm();
        login.getStylesheets().add(cssDoc);

        stage = primaryStage;
        stage.setTitle("Login Screen");
        stage.setScene(new Scene(login));
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
