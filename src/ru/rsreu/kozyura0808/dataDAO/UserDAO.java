package ru.rsreu.kozyura0808.dataDAO;

import java.util.List;

import ru.rsreu.kozyura0808.data.User;
/**
 * UserDAO
 * 
 * @author Aleksey
 *
 */
public interface UserDAO {
	/**
	 * Method for get type user by User login,password
	 * @param userLogin - User Login
	 * @param userPass - User Password
	 */
	int confirmUser(String userLogin, String userPass);
	/**
	 * Method for get user ID by userLogin
	 * @param userLogin - User Login
	 */
	int getUserId(String userLogin);
	/**
	 * Method for get User Block Status by userLogin 
	 * @param userLogin - User login
	 */
	String geUserBlockStatus(String userLogin);
	/**
	 * Method for get List Of Users
	 */
	List<User> getUserList();
	/**
	 * Method for add User
	 * @param user - User to be added
	 */
	void addUser(User user);
	/**
	 * Method for remove User by ID
	 * @param userID - ID of User
	 */
	void removeUser(int userId);
	/**
	 * Method for block user by userID
	 * @param userID - ID of User
	 */
	void blockUser(int userId);
	/**
	 * Method for update status by user ID
	 * @param userID - ID of User
	 * @param status - Status to be set
	 */
	void setOnlineStatus(int userId, String status);

}
