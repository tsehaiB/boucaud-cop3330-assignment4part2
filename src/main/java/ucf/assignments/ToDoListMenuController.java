/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.time.LocalDate;

import static com.sun.javafx.scene.control.skin.Utils.getResource;

public class ToDoListMenuController {
    @FXML
    public Menu viewMenu;
    @FXML
    public Menu editMenu;
    @FXML
    public Menu fileMenu;
    @FXML
    public MenuBar myMenu;
    public ToDoListMenuController(){}
    @FXML
    public void initialize(){

    }
    private static final ToDoListMenu menu = new ToDoListMenu();
    @FXML
    public void onLoadClicked(ActionEvent actionEvent) {
    }
    @FXML
    public void onSaveClicked(ActionEvent actionEvent) {
    }
    @FXML
    public void onAddClicked(ActionEvent actionEvent) {
        BorderPane itemPane = null;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(("ToDoListItem.fxml")));
            itemPane = loader.load();
            menu.addItem(((ToDoListItemController) loader.getController()).getItem());
        } catch (IOException e) {
            e.printStackTrace();
        }
        ((TabPane) myMenu.getParent().getChildrenUnmodifiable().get(0)).getTabs().add(new Tab("Item", itemPane));
        ((TabPane) myMenu.getParent().getChildrenUnmodifiable().get(0)).getSelectionModel().selectLast();
    }
    @FXML
    public void onDeleteClicked(ActionEvent actionEvent) {

    }
    @FXML
    public void onFilterCompleteClicked(ActionEvent actionEvent) {
    }
    @FXML
    public void onFilterIncompleteClicked(ActionEvent actionEvent) {
    }
    @FXML
    public void onShowAllClicked(ActionEvent actionEvent) {
    }
}
