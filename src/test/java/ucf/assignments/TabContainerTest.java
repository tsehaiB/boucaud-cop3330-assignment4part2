/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Tsehai Boucaud
 */

package ucf.assignments;

import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class TabContainerTest {


    @Test
    void buildReadMe() throws FileNotFoundException {

        //given
        File inp = new File("C:\\Users\\Art3mis\\IdeaProjects\\boucuad-cop3330-assignment4part2\\ReadMe.txt");
        Scanner reader = new Scanner(inp);
        String expected = "";
        TabContainer myTabs = new TabContainer();
        //when
        while(reader.hasNextLine()){
            expected += reader.nextLine();
            expected += "\n";
        }
        String actual = (myTabs.buildReadMe()).getText();
        //then
        assertEquals(actual, expected);
    }
}