/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Tsehai Boucaud
 */

package ucf.assignments;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListItemTest {

    @Test
    void setTitle() {
        ToDoListItem item = new ToDoListItem();
        item.setTitle("Title of ToDoList");
        assertEquals(item.getTitle(), "Title of ToDoList");
    }

    @Test
    void setDescription() {
        ToDoListItem item = new ToDoListItem();
        item.setDescription("Description of ToDoList");
        assertEquals(item.getDescription(), "Description of ToDoList");
    }

    @Test
    void setDueDate() {
        ToDoListItem item = new ToDoListItem();
        item.setDueDate(LocalDate.now());
        assertEquals(item.getDueDate(), LocalDate.now());
    }

    @Test
    void setCompletionStatus() {
        ToDoListItem item = new ToDoListItem();
        item.setCompletionStatus(true);
        assertEquals(item.getCompletionStatus(), true);
    }
}