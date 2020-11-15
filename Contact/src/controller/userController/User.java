package controller.userController;

import java.sql.SQLException;
import java.util.ArrayList;

import helper.UserHelper;
import model.UserModel;
import utils.ValidationUtil;

public class User {

	public static void insert() {

		UserModel model = new UserModel("ali", "alizade", 20);
		if (ValidationUtil.isValid_user(model) == false) {
			return;
		}

		try {
			if (UserHelper.createNewUser(model)) {
				System.out.println("user is add to database");
			} else {
				System.out.println("Error we con't add to databs");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void update() {
				
		UserModel model = new UserModel(1,"ehsan","alizade",24);
		if(ValidationUtil.isValid_user(model) == false) {
			return;
		}
		
		try {
			
			if (UserHelper.updateUser(model)) {
				System.out.println("user updated.");
			}
			else {
				System.out.println("Error while updating user.");
			}
			
		} catch (Exception e) {
			System.out.println("exception happend during update");
			System.err.println(e);
		}
		
	}
	
	public static void delete() {
		
		try {
			
			if (UserHelper.deleteUser(1)) {
				System.out.println("user deleted");
			}
			else {
				System.out.println("user didn't delete");
			}
			
		} catch (Exception e) {
			System.out.println("exception happend during delete");
			System.err.println(e);			
		}
	}
	
	public static void edit() {
		int id = 2;
		//getalluser function changed
/*		UserModel user = getAllUser(id);
		
		if (user != null) {
			System.out.println(user.getId()+" ,"+user.getName()+" ,"+user.getFamily()+" ,"+user.getAge());
		}
		else {
			System.out.println("user not found");
		}
*/		
	}
	
	public ArrayList<UserModel> getAllUser() {
		ArrayList<UserModel> result = UserHelper.getUserList();
		return result;
		
//		UserModel user = null;		
//		for (UserModel userModel : result) {
			
//			if (userModel.getId() == id) {
//				user = new UserModel(userModel.getId(),userModel.getName(),userModel.getFamily(),userModel.getAge()); 				
//			}
//			System.out.println(userModel.getId()+" ,"+userModel.getName()+" ,"+userModel.getFamily()+" ,"+userModel.getAge());
//		}
//		return user;
	}

}
