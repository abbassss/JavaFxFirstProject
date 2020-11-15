package application;

import java.io.IOException;

import controller.uiController.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import model.UserModel;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/Contact.fxml"));
			Parent parent = fxmlLoader.load();	
			Scene scene = new Scene(parent,600,600);
			primaryStage.setScene(scene);
			primaryStage.show();
			ContactController controller=(ContactController)fxmlLoader.getController();
			controller.load();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}	
	
	public static void main(String[] args) {
		launch(args);
		
	}
}
