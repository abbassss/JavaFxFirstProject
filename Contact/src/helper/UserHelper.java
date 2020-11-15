package helper;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.UserDAO;
import model.UserModel;

public class UserHelper {

	public static boolean createNewUser(UserModel model) throws SQLException {
		return UserDAO.insert_user(model);
	}
	
	public static boolean updateUser(UserModel model) {
		return UserDAO.update_user(model);
	}
	
	public static boolean deleteUser(int id) {
		return UserDAO.delete_user(id);
	}
	
	public static ArrayList<UserModel> getUserList() {
		return UserDAO.get_Users_List();
	}
}
