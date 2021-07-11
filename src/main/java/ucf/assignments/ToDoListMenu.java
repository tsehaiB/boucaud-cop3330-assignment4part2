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

    private ArrayList<ToDoListItem> items;
    private ArrayList<ToDoListItem> displayItems;
    private String itemsToLoad;
    private String itemsToSave;

    public ToDoListMenu() {
        items = new ArrayList<>();
        displayItems = new ArrayList<>();
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

    public ArrayList<ToDoListItem> filterItems(boolean filter){
        //clear displayItems ArrayList
            //for each item in items list
        //if the item's CompletionStatus equals the filter
            //append item to displayItems
        return displayItems;
    }
    public void listTitleChanged(ActionEvent actionEvent) {
        //set title instance variable equal to listTitle TextField value
    }
    public ToDoListItem createItem(){
        ToDoListItem item = new ToDoListItem();
        //create new ToDoList Item 'item'
        //set item.title to ""
        //set item.description to ""
        //set item.CompletionStatus to false
        //set item.dueDate to LocalDate.now()
        return item;
    }
    public void showItems(){
        //for each item in display items
            //create new row in ToDoItemManager's GridPane
            //add item to row in column 1
    }
    public void addItem(ToDoListItem nextItem){
       items.add(nextItem);
       displayItems.add(nextItem);
    }
    public ArrayList<ToDoListItem> getItems(){
        return this.items;
    }
    public ArrayList<ToDoListItem> getDisplayItems(){
        return this.displayItems;
    }
}
