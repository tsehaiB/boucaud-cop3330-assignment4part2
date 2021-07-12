/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Tsehai Boucaud
 */

package ucf.assignments;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.ArrayList;

public class ToDoListMenu {
    private ArrayList<BorderPane> itemDisplays = new ArrayList<>();
    private TabPane tPane = new TabPane();
    private ArrayList<ToDoListItem> items;

    public ToDoListMenu() {
        items = new ArrayList<>();
    }
    public ArrayList<ToDoListItem> loadItems(ArrayList<String> str) {
        //create reader at current directory
        //for each string in str
        //try reading an item file with that title in a tryCatch
        //read the item to the items array:
        //create an new item,
        //read in the instance variables
        //append item to the current list
        //catch exceptions of 'no item with that title' by returning an error and continuing the loop
        return items;
    }

    public ArrayList<ToDoListItem> loadItems(String directory) {
        //try creating a reader at that the parameter directory with a tryCatch
        //for every item in the directory
        //read the item to the items array:
        //create an new item,
        //read in the instance variables
        //append item to the current list
        //catch exceptions of 'no item with that title' by returning an error and continuing the loop
        return items;
    }

    public String saveItems(ArrayList<String> titles) {
        String path = "";
        //assign path to current directory
        //create writer at path
        //for each string in str
        //try writing an item from the items Arraylist with that title in a tryCatch
        //catch exceptions of 'no items with that title' by returning an error and continuing the loop
        return path;
    }

    public String saveItems(String directory) {
        String path = directory;
        //try to create writer at path
        //for item in items Arraylist
        //try writing an item from the items Arraylist in a tryCatch
        //catch exceptions of 'no item with that title' by returning an error and continuing the loop
        return path;
    }

    public void addTab(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(("ToDoListItem.fxml")));
            itemDisplays.add(loader.load());
            addItem(((ToDoListItemController) loader.getController()).getItem());
            System.out.println("Creating item: " + getItems().get(getItems().size()-1));
        } catch (IOException e) {
            e.printStackTrace();
        }
        tPane.getTabs().add(new Tab("Item", itemDisplays.get(itemDisplays.size()-1)));
        tPane.getSelectionModel().selectLast();
    }
    public void deleteTab(){
        int currentTab = tPane.getSelectionModel().getSelectedIndex();
        tPane.getTabs().remove(currentTab);
        System.out.println("Deleting item: " + getItems().get(currentTab-1));
        getItems().remove(currentTab-1);
        itemDisplays.remove(currentTab-1);
    }
    private String tabTitle(boolean expected){
        if(expected)
            return "Completed Item";
        else
            return "Incomplete Item";
    }
    public void filterTabs(boolean expected){
        int currentTab = tPane.getTabs().size()-1;
        for(BorderPane tab : itemDisplays) {
            if(getItems().get(currentTab).getCompletionStatus() == expected)
            {
                tPane.getTabs().add(new Tab(tabTitle(expected), tab));
                System.out.println("Tab completion status was " + getItems().get(currentTab).getCompletionStatus());

            }
            currentTab++;
        }
    }
    public void addItem(ToDoListItem nextItem){
       items.add(nextItem);
    }
    public ArrayList<ToDoListItem> getItems(){
        return this.items;
    }
    public ArrayList<BorderPane> getItemDisplays(){
        return this.itemDisplays;
    }
    public TabPane getTPane(){
        return this.tPane;
    }

    public void setTabPane(TabPane myWindow) {
        this.tPane = myWindow;
    }
}
