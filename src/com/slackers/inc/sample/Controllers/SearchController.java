package com.slackers.inc.sample.Controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Jason on 3/27/2017.
 */
public class SearchController {

    ObservableList<String> typeList = FXCollections.observableArrayList("All", "Beer", "Wine", "Hard Alcohol");
    ObservableList<String> contentList = FXCollections.observableArrayList("All", "20 <", "21-50", "51 >");
    ObservableList<String> pastList = FXCollections.observableArrayList("Vodka", "Gin", "Tequila", "Rum", "Mixers");
    ObservableList<String> currentList = FXCollections.observableArrayList("Sweet", "Dry", "Coconut", "cherry");


    @FXML
    private TextField keyword;
    @FXML
    private ChoiceBox type;
    @FXML
    private ChoiceBox alcoholContent;
    @FXML
    private ListView pastSearch;
    @FXML
    private ListView currentFilter;

    @FXML
    private void initialize(){
        type.setValue("All");
        alcoholContent.setValue("All");
        type.setItems(typeList);
        alcoholContent.setItems(contentList);
        pastSearch.setItems(pastList);
        currentFilter.setItems(currentList);

    }


    @FXML
    void getResultsClick(ActionEvent e) throws IOException {
        //System.out.println(firstNameField.getText() + lastNameField.getText() + emailField.getText() + passwordField.getText());

        Parent main = FXMLLoader.load(getClass().getResource("../FXML/results.fxml"));
        main.getStylesheets().add(getClass().getResource("../CSS/custom.css").toExternalForm());

        Stage stage = new Stage();
        stage.setTitle("New Stage");
        stage.setScene(new Scene(main));
        stage.show();
    }
}
