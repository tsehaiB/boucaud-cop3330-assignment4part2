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

    public TabContainerController() {

    }

    @FXML
    public void initialize() {
        buildWindow(mainWindow);
        Text readMe = buildReadMe();
        homeTab.setContent(readMe);
    }
    public AnchorPane buildWindow(AnchorPane window) {
        buildMenu(window);
        return window;
    }
    public Text buildReadMe(){
        Text readMe = new Text();
        try {
            readMe = new Text(read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return readMe;
    }
    private void buildMenu(AnchorPane window){
        MenuBar menu = new MenuBar();
        try {
            FXMLLoader loader = new FXMLLoader((ToDoList.class.getResource(("ToDoListMenu.fxml"))));
            menu = loader.load();
            ((ToDoListMenuController) loader.getController()).setTabPane(tPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
        window.getChildren().add(1, menu);
        AnchorPane.setBottomAnchor(menu, 0.0);
        AnchorPane.setLeftAnchor(menu, 0.0);
        AnchorPane.setRightAnchor(menu, 0.0);
    }
    private String read() throws FileNotFoundException {
        File inp = new File("C:\\Users\\Art3mis\\IdeaProjects\\boucuad-cop3330-assignment4part2\\ReadMe.txt");
        Scanner reader = new Scanner(inp);
        String readMe = "";
        while(reader.hasNextLine()){
            readMe += reader.nextLine();
            readMe += "\n";
        }
        return readMe;
    }
}
