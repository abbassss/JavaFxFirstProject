package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.UserModel;

public class UserDAO {

	public static boolean insert_user(UserModel model) throws SQLException {
		String sql = "INSERT INTO \"user\"(firstname, lastname, age)VALUES (?, ?, ?);";
		try (PreparedStatement ps = DBConnection.getDBConnection().prepareStatement(sql)) {
			ps.setString(1, model.getName());
			ps.setString(2, model.getFamily());
			ps.setInt(3, model.getAge());
			if (ps.executeUpdate() == 1) {
				return true;
			} else {
				return false;
			}
		}

	}

	public static boolean update_user(UserModel model) {
		String sql = "UPDATE \"user\" SET firstname = ? , lastname = ? , age = ? WHERE  id =?";

		try (PreparedStatement ps = DBConnection.getDBConnection().prepareStatement(sql)) {
			ps.setString(1, model.getName());
			ps.setString(2, model.getFamily());
			ps.setInt(3, model.getAge());
			ps.setInt(4, model.getId());

			if (ps.executeUpdate() == 1) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			System.out.println("Error while updating user");
			System.err.println(e);
		}

		return true;
	}

	public static boolean delete_user(int id) {
		String sql = "DELETE FROM \"user\" WHERE id = ?";

		try (PreparedStatement ps = DBConnection.getDBConnection().prepareStatement(sql)) {
			ps.setInt(1, id);
			if (ps.executeUpdate() == 1) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			System.out.println("Error while deleting");
			System.err.println(e);
		}

		return true;
	}

	public static ArrayList<UserModel> get_Users_List() {
		ArrayList<UserModel> userList = new ArrayList<UserModel>();
		String sql = "SELECT * FROM \"user\" ";
		try (PreparedStatement ps = DBConnection.getDBConnection().prepareStatement(sql)) {
			try (ResultSet rs = ps.executeQuery()) {
				if (rs != null) {
					while (rs.next()) {
						userList.add(new UserModel(rs.getInt("id"), rs.getString("firstname"), rs.getString("lastname"),
								rs.getInt("age")));
					}
				}
			}

		} catch (Exception e) {
			System.out.println("Error in get_users_list");
		}

		return userList;
	}

}
