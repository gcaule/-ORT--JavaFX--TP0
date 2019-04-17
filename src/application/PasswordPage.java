package application;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PasswordPage extends Application{
	
	public static void main(String[] args) {

		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	
	AnchorPane anchorpane = new AnchorPane();
	
	GridPane root = new GridPane();

    Label labelUserName = new Label("Login");
    TextField fieldUserName = new TextField();

    Label labelPassword = new Label("Password");
    PasswordField fieldPassword = new PasswordField();
    
    root.add(labelUserName, 0, 0);
    root.add(fieldUserName, 1, 0);
    
    root.add(labelPassword, 0, 1);
    root.add(fieldPassword, 1, 1);
    
    HBox hbox = new HBox();
    
    Button cancelButton = new Button("Cancel");
    Button enterButton = new Button("OK");
    
    ObservableList list = hbox.getChildren();
    list.addAll(cancelButton, enterButton);
    
    root.add(hbox, 1, 2);
    
	anchorpane.getChildren().addAll(root);
	
	anchorpane.setTopAnchor(root, 15.0);
	anchorpane.setBottomAnchor(root, 15.0);
	anchorpane.setLeftAnchor(root, 15.0);
	anchorpane.setRightAnchor(root, 15.0);
	
	Scene scene = new Scene(anchorpane, 337, 136);

	primaryStage.setScene(scene);
	primaryStage.show();
	
	}

}
