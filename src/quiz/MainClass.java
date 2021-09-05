package quiz;

import java.io.IOException;

import quiz.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainClass extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("eventTest.fxml"));
		AnchorPane root = loader.load();
		Scene scene = new Scene(root);
		
		
		Controller ctl = loader.getController();
		ctl.setRoot(root); 
		
		primaryStage.setScene(scene); 
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
