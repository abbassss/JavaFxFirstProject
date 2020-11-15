package utils;

import model.UserModel;

public class ValidationUtil {

	public static boolean isValid_user(UserModel model) {
		
		if (model.getName() == null) {
			System.out.println("name is null");
			return false;
		} else if (model.getFamily() == null) {
			System.out.println("family is null");
			return false;
		} else if (model.getAge() == 0) {
			System.out.println("age is null");
			return false;
		}
		return true;
	}

}
