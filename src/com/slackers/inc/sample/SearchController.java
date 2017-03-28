package com.slackers.inc.sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
/**
 * Created by Jason on 3/27/2017.
 */
public class SearchController {

    ObservableList<String> typeList = FXCollections.observableArrayList("All", "Beer", "Wine", "Hard Alcohol");
    @FXML
    private TextField keyword;
    @FXML
    private ChoiceBox type;

    @FXML
    private void initialize(){
        type.setValue("All");
        type.setItems(typeList);

    }

}
