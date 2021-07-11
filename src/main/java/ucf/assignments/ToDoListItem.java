/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.CheckBox;
import javafx.scene.input.KeyEvent;

import java.time.LocalDate;

public class ToDoListItem {
    private String title;
    private String description;
    private boolean completionStatus;
    private LocalDate dueDate;
    ToDoListItem(){
        setCompletionStatus(false);
        setDueDate(LocalDate.now());
        setDescription("");
        setTitle("");
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public boolean getCompletionStatus() {
        return completionStatus;
    }
    public LocalDate getDueDate() {
        return dueDate;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
    public void setCompletionStatus(boolean completionStatus) {
        this.completionStatus = completionStatus;
    }
}
