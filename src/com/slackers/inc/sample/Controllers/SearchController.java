package com.slackers.inc.sample.Controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
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

}
