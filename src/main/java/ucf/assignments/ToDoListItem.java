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
    @FXML
    private TextField TitleTextField;
    @FXML
    private TextArea DescriptionTextArea;
    @FXML
    private CheckBox CompletionCheckBox;
    @FXML
    private DatePicker DueDateField;
    private String title;
    private String description;
    private boolean completionStatus;
    private LocalDate dueDate;

    @FXML
    public void Enter(KeyEvent keyEvent) {
        //set Description instance variable equal to 'this' DescriptionTextArea's current value
    }

    @FXML
    public void DueDateChanged(ActionEvent actionEvent) {
        //set DueDate instance variable equal to 'this' DueDate's current value
    }

    @FXML
    public void StatusChanged(ActionEvent actionEvent) {
        //set CompletionStatus instance variable equal to 'this' CompletionCheckBox's current value
    }

    @FXML
    public void TitleEntered(ActionEvent actionEvent) {
        //set ItemTitle instance variable equal to 'this' TitleTextField's current value
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
}
