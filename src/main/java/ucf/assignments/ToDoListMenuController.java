/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class ToDoListMenuController {
    @FXML
    public Menu viewMenu;
    @FXML
    public Menu editMenu;
    @FXML
    public Menu fileMenu;
    @FXML
    public MenuBar myMenu;
    private static final ToDoListMenu menu = new ToDoListMenu();
    public ToDoListMenuController(){

    }
    @FXML
    public void initialize(){
    }
    @FXML
    public void onLoadClicked(ActionEvent actionEvent) {
    }
    @FXML
    public void onSaveClicked(ActionEvent actionEvent) {
    }
    @FXML
    public void onAddClicked(ActionEvent actionEvent) {
        menu.addTab();
    }

    @FXML
    public void onDeleteClicked(ActionEvent actionEvent) {
        if(menu.getItems().size() > 0) {
            deleteItem();
        }
    }
    private void deleteItem(){
        menu.deleteTab();
    }
    @FXML
    public void onFilterCompleteClicked(ActionEvent actionEvent) {
        menu.getTPane().getTabs().remove(1,menu.getTPane().getTabs().size());
        menu.filterTabs(true);
    }
    @FXML
    public void onFilterIncompleteClicked(ActionEvent actionEvent) {
        menu.getTPane().getTabs().remove(1,menu.getTPane().getTabs().size());
        menu.filterTabs(false);
    }
    @FXML
    public void onShowAllClicked(ActionEvent actionEvent) {
        menu.getTPane().getTabs().remove(1,menu.getTPane().getTabs().size());
        for(BorderPane tab : menu.getItemDisplays()) {
            {
                menu.getTPane().getTabs().add(new Tab("Item", tab));
            }
        }

    }
    @FXML
    public void onClearClicked(ActionEvent actionEvent) {
        menu.getTPane().getSelectionModel().selectLast();
        while(menu.getItems().size() > 0){
            myMenu.fireEvent(actionEvent);
            deleteItem();
        }
        System.out.println("All gone! Current items size:" + (menu.getItems().size()));
    }
    public void setTabPane(TabPane myWindow){
        menu.setTabPane(myWindow);
    }
}
