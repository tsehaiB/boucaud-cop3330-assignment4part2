/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;

import java.time.LocalDate;

public class ToDoListItemController {
    public ToDoListItemController(){

    }
    @FXML
    public void initialize(){
        item.setCompletionStatus(false);
        item.setDueDate(LocalDate.now());
        item.setDescription("");
        item.setTitle("");
    }
    @FXML
    public BorderPane myItem;
    @FXML
    private TextField TitleTextField;
    @FXML
    private TextArea DescriptionTextArea;
    @FXML
    private CheckBox CompletionCheckBox;
    @FXML
    private DatePicker DueDateField;

    private ToDoListItem item = new ToDoListItem();

    @FXML
    public void Enter(KeyEvent keyEvent) {
        //item.setDescription(DescriptionTextArea.getText(0,252) + "...");
        item.setDescription(DescriptionTextArea.getText());
        //System.out.println(item.getDescription());
        //set Description instance variable equal to 'this' DescriptionTextArea's current value
    }

    @FXML
    public void DueDateChanged(ActionEvent actionEvent) {
        item.setDueDate(DueDateField.getValue());
        //set DueDate instance variable equal to 'this' DueDate's current value
    }

    @FXML
    public void StatusChanged(ActionEvent actionEvent) {
        item.setCompletionStatus(CompletionCheckBox.isSelected());
        //set CompletionStatus instance variable equal to 'this' CompletionCheckBox's current value
    }

    @FXML
    public void TitleEntered(ActionEvent actionEvent) {
        item.setTitle(TitleTextField.getText());
        //set ItemTitle instance variable equal to 'this' TitleTextField's current value
    }

    public ToDoListItem getItem(){
        return this.item;
    }
}
