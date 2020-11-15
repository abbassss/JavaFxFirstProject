package controller.uiController;
import java.io.IOException;
import java.util.ArrayList;

import controller.userController.User;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.UserModel;


public class ContactController {
	   @FXML
	    private TableColumn<UserModel, Integer> col_age;

	    @FXML
	    private TableColumn<UserModel, String> col_firstname;

	    @FXML
	    private TableView<UserModel> tbl_contact;

	    @FXML
	    private TableColumn<UserModel, String> col_lastname;

	    @FXML
	    private Button btn_insert;

	    @FXML
	    private Button btn_close;
	
	public void load() throws IOException {		  
		
		User usersTable = new User();
		ArrayList<UserModel> usersList= new ArrayList<UserModel>();
		usersList= usersTable.getAllUser();

		col_firstname.setCellValueFactory(new PropertyValueFactory<>("name"));

		col_lastname.setCellValueFactory(new PropertyValueFactory<>("family"));
	    
		col_age.setCellValueFactory(new PropertyValueFactory<>("age"));	
	    
	    tbl_contact.getItems().addAll(usersList);
	    
	}
	
}
