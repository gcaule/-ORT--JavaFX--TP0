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

		//On crée le layout de base
		AnchorPane anchorpane = new AnchorPane();

		//On crée le layout qui contiendra les éléments de l'UI
		GridPane root = new GridPane();

		//On crée les objets
		Label labelUserName = new Label("Login");
		TextField fieldUserName = new TextField();

		Label labelPassword = new Label("Password");
		PasswordField fieldPassword = new PasswordField();

		//On ajoute les objets au GridPane avec des coordonnées (colonne, ligne)
		root.add(labelUserName, 0, 0);
		root.add(fieldUserName, 1, 0);

		root.add(labelPassword, 0, 1);
		root.add(fieldPassword, 1, 1);

		//On crée un autre layout pour les boutons
		HBox hbox = new HBox();

		Button cancelButton = new Button("Cancel");
		Button enterButton = new Button("OK");

		//On met les boutons dans leur layout
		ObservableList list = hbox.getChildren();
		list.addAll(cancelButton, enterButton);

		//On ajoute le layout des boutons dans le GridPane, puis le GridPane dans le layout de base
		root.add(hbox, 1, 2);
		anchorpane.getChildren().addAll(root);

		//On fait un peu de mise en page
		anchorpane.setTopAnchor(root, 15.0);
		anchorpane.setBottomAnchor(root, 15.0);
		anchorpane.setLeftAnchor(root, 15.0);
		anchorpane.setRightAnchor(root, 15.0);

		//On place le layout de base sur la scène et la scène sur le stage (qu'on affiche)
		Scene scene = new Scene(anchorpane, 337, 136);

		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
