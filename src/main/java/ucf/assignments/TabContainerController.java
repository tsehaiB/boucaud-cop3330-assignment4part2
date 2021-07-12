package ucf.assignments;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TabContainerController {
    @FXML
    private TabPane tPane;
    @FXML
    private Tab homeTab;
    @FXML
    private AnchorPane mainWindow;
    private TabContainer tabContainer = new TabContainer();
    public TabContainerController() {

    }

    @FXML
    public void initialize() {
        tabContainer.buildWindow(mainWindow, tPane);
        Text readMe = tabContainer.buildReadMe();
        homeTab.setContent(readMe);
    }

}
