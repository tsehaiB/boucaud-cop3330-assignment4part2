package ucf.assignments;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.io.IOException;

public class TabContainerController {
    @FXML
    private TabPane tPane;
    @FXML
    private Tab homeTab;
    @FXML
    private AnchorPane mainWindow;
    public TabContainerController(){

    }
    @FXML
    public void initialize(){
        MenuBar menu = new MenuBar();
        Text readMe = new Text("Read Me (With Honorable Acknowledgement to Ray:");
        try {
            menu = FXMLLoader.load(ToDoList.class.getResource(("ToDoListMenu.fxml")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        homeTab.setContent(readMe);
        mainWindow.getChildren().add(1,menu);
        AnchorPane.setBottomAnchor(menu,0.0);
        AnchorPane.setLeftAnchor(menu, 0.0);
        AnchorPane.setRightAnchor(menu, 0.0);
        
    }

}
