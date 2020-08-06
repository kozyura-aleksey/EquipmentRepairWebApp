package ru.rsreu.kozyura0808.oracledb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import resources.ConfigurationManager;
import ru.rsreu.kozyura0808.data.User;
import ru.rsreu.kozyura0808.dataDAO.UserDAO;

public class OracleUserDAO implements UserDAO {
	private Connection connection;

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public OracleUserDAO(Connection connection) {
		this.setConnection(connection);
	}

	private User createUser(ResultSet resultSet) {
		User user = new User();
		try {
			user.setID_USERS(resultSet.getInt(1));
			user.setID_TYPE_USERS(resultSet.getInt(2));
			user.setName(resultSet.getString(3));
			user.setSurname(resultSet.getString(4));
			user.setLogin(resultSet.getString(5));
			user.setPassword(resultSet.getString(6));
			user.setPhone(resultSet.getString(7));
			user.setComment(resultSet.getString(8));
			user.setRewiew(resultSet.getString(9));
			user.setStatus(resultSet.getString(10));
			user.setBlock_status(resultSet.getString(11));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	

	@Override
	public int confirmUser(String userLogin, String userPass) {
		PreparedStatement preparedSt = null;
		ResultSet resultSet = null;
		int idType = 0;

		String query = ConfigurationManager.getProperty("confirmUser");
		try {
			preparedSt = connection.prepareStatement(query);
			preparedSt.setString(1, userLogin);
			preparedSt.setString(2, userPass);
			resultSet = preparedSt.executeQuery();

			if (resultSet.next()) {
				idType = resultSet.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return idType;
	}

	@Override
	public int getUserId(String userLogin) {
		PreparedStatement preparedSt = null;
		ResultSet resultSet = null;
		int userId = 0;
		String query = ConfigurationManager.getProperty("getUserId");
		try {
			preparedSt = connection.prepareStatement(query);
			preparedSt.setString(1, userLogin);
			resultSet = preparedSt.executeQuery();

			if (resultSet.next()) {
				userId = resultSet.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userId;
	}

	@Override
	public List<User> getUserList() {
		List<User> userList = new ArrayList<User>();
		Statement statement = null;
		ResultSet resultSet = null;

		String queryGetUserList = ConfigurationManager.getProperty("getUserList");

		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(queryGetUserList);

			while (resultSet.next()) {
				userList.add(createUser(resultSet));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return userList;
	}

	@Override
	public void addUser(User user) {
		PreparedStatement preparedSt = null;

		String queryAddUser = ConfigurationManager.getProperty("addUser");

		//int id_users = user.getID_USERS();
		int type_user = user.getID_TYPE_USERS();
		String name = user.getName();
		String surname = user.getSurname();
		String login = user.getLogin();
		String password = user.getPassword();
		String phone = user.getPhone();
		String comment = user.getComment();
		String rewiew = user.getRewiew();
		String status = user.getStatus();
		String block_status = user.getBlock_status();
		try {
			preparedSt = connection.prepareStatement(queryAddUser);
			//preparedSt.setInt(1, id_users);
			preparedSt.setInt(1, type_user);
			preparedSt.setString(2, name);
			preparedSt.setString(3, surname);
			preparedSt.setString(4, login);
			preparedSt.setString(5, password);
			preparedSt.setString(6, phone);
			preparedSt.setString(7, comment);
			preparedSt.setString(8, rewiew);
			preparedSt.setString(9, status);
			preparedSt.setString(10, block_status);
			preparedSt.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void removeUser(int userId) {
		PreparedStatement preparedSt = null;

		String queryRemoveUser = ConfigurationManager.getProperty("removeUser");

		try {
			preparedSt = connection.prepareStatement(queryRemoveUser);
			preparedSt.setInt(1, userId);
			preparedSt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void blockUser(int userId) {
		PreparedStatement preparedSt = null;
		
		String queryRemoveUser = ConfigurationManager.getProperty("blockUser");
		
		try {
			preparedSt = connection.prepareStatement(queryRemoveUser);
			preparedSt.setInt(1, userId);
			preparedSt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void setOnlineStatus(int userId, String status) {
		PreparedStatement preparedSt = null;
		String querySetOnlineStatus = ConfigurationManager.getProperty("setOnlineStatus");

		try {
			preparedSt = connection.prepareStatement(querySetOnlineStatus);
			preparedSt.setString(1, status);
			preparedSt.setInt(2, userId);
			preparedSt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}

	@Override
	public String geUserBlockStatus(String userLogin) {
		PreparedStatement preparedSt = null;
		ResultSet resultSet = null;
		String status = null;
		String query = ConfigurationManager.getProperty("getUserStatus");
		try {
			preparedSt = connection.prepareStatement(query);
			preparedSt.setString(1, userLogin);
			resultSet = preparedSt.executeQuery();

			if (resultSet.next()) {
				status = resultSet.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
}
