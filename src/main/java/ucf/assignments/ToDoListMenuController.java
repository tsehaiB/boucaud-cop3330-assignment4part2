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
    public ToDoListMenuController(){}
    @FXML
    public void initialize(){

    }
    private static final ToDoListMenu menu = new ToDoListMenu();
    private static final ArrayList<BorderPane> itemDisplays = new ArrayList<>();
    @FXML
    public void onLoadClicked(ActionEvent actionEvent) {
    }
    @FXML
    public void onSaveClicked(ActionEvent actionEvent) {
    }
    @FXML
    public void onAddClicked(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(("ToDoListItem.fxml")));
            itemDisplays.add(loader.load());
            menu.addItem(((ToDoListItemController) loader.getController()).getItem());
            System.out.println("Creating item: " + menu.getItems().get(menu.getItems().size()-1));
        } catch (IOException e) {
            e.printStackTrace();
        }
        ((TabPane) myMenu.getParent().getChildrenUnmodifiable().get(0)).getTabs().add(new Tab("Item", itemDisplays.get(itemDisplays.size()-1)));
        ((TabPane) myMenu.getParent().getChildrenUnmodifiable().get(0)).getSelectionModel().selectLast();
    }

    @FXML
    public void onDeleteClicked(ActionEvent actionEvent) {
        if(menu.getItems().size() > 0) {
            deleteItem();
        }
    }
    private void deleteItem(){
        int currentTab = ((TabPane) myMenu.getParent().getChildrenUnmodifiable().get(0)).getSelectionModel().getSelectedIndex();
        ((TabPane) myMenu.getParent().getChildrenUnmodifiable().get(0)).getTabs().remove(currentTab);
        System.out.println("Deleting item: " + menu.getItems().get(currentTab-1));
        menu.getItems().remove(currentTab-1);
        itemDisplays.remove(currentTab-1);
        //menu.getDisplayItems().remove()
    }
    private String tabTitle(boolean expected){
        if(expected)
            return "Completed Item";
        else
            return "Incomplete Item";
    }
    @FXML
    public void onFilterCompleteClicked(ActionEvent actionEvent) {
        TabPane currentTabPane = ((TabPane) myMenu.getParent().getChildrenUnmodifiable().get(0));
        currentTabPane.getTabs().remove(1,currentTabPane.getTabs().size());
        filterTabs(true, currentTabPane);
    }
    private void filterTabs(boolean expected, TabPane currentTabPane){
        int currentTab = currentTabPane.getTabs().size()-1;
        for(BorderPane tab : itemDisplays) {
            if(menu.getItems().get(currentTab).getCompletionStatus() == expected)
            {
                currentTabPane.getTabs().add(new Tab(tabTitle(expected), tab));
                System.out.println("Tab completion status was " + menu.getItems().get(currentTab).getCompletionStatus());

            }
            currentTab++;
        }
    }
    @FXML
    public void onFilterIncompleteClicked(ActionEvent actionEvent) {
        TabPane currentTabPane = ((TabPane) myMenu.getParent().getChildrenUnmodifiable().get(0));
        currentTabPane.getTabs().remove(1,currentTabPane.getTabs().size());
        filterTabs(false, currentTabPane);
    }
    @FXML
    public void onShowAllClicked(ActionEvent actionEvent) {
        TabPane currentTabPane = ((TabPane) myMenu.getParent().getChildrenUnmodifiable().get(0));
        currentTabPane.getTabs().remove(1,currentTabPane.getTabs().size());
        for(BorderPane tab : itemDisplays) {
            {
                currentTabPane.getTabs().add(new Tab("Item", tab));
            }
        }

    }

    public void onClearClicked(ActionEvent actionEvent) {
        while(menu.getItems().size() > 0){
            myMenu.fireEvent(actionEvent);
            deleteItem();
        }
        System.out.println("All gone! Current items size:" + (menu.getItems().size()));
    }
}
