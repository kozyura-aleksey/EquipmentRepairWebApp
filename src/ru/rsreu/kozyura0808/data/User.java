package ru.rsreu.kozyura0808.data;

/**
 * Class that describes entity User.
 * 
 * @author Aleksey
 *
 */
public class User {
	/**
	 * User ID
	 */
	private int ID_USERS;
	/**
	 * User type ID
	 */
	private int ID_TYPE_USERS;
	/**
	 * User Name
	 */
	private String Name;
	/**
	 * User Surname
	 */
	private String Surname;
	/**
	 * User login
	 */
	private String Login;
	/**
	 * User Password
	 */
	private String Password;
	/**
	 * User phone
	 */
	private String Phone;
	/**
	 * Comments that the user can set
	 */
	private String Comment;
	/**
	 * Rewiew on the work done
	 */
	private String Rewiew;
	/**
	 * User status on site
	 */
	private String Status;
	/**
	 * User block_status for enter on site 
	 */
	private String block_status;

	/**
	 * Get's user block status
	 */
	public String getBlock_status() {
		return block_status;
	}
	/**
	 * Set's user block status
	 */
	public void setBlock_status(String block_status) {
		this.block_status = block_status;
	}
	/**
	 * Get's user status
	 */
	public String getStatus() {
		return Status;
	}
	/**
	 * Set's user status
	 */
	public void setStatus(String status) {
		Status = status;
	}
	/**
	 * Constructor
	 */
	public User() {
		
	}
	/**
	 * Get's user ID
	 */
	public int getID_USERS() {
		return ID_USERS;
	}
	/**
	 * Set's user ID
	 */
	public void setID_USERS(int iD_USERS) {
		ID_USERS = iD_USERS;
	}
	/**
	 * Get's user type ID
	 */
	public int getID_TYPE_USERS() {
		return ID_TYPE_USERS;
	}
	/**
	 * Set's user type ID
	 */
	public void setID_TYPE_USERS(int iD_TYPE_USERS) {
		ID_TYPE_USERS = iD_TYPE_USERS;
	}
	/**
	 * Get's user Name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * Set's user Name
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * Get's user Surname
	 */
	public String getSurname() {
		return Surname;
	}
	/**
	 * Set's user Surname
	 */
	public void setSurname(String surname) {
		Surname = surname;
	}
	/**
	 * Get's user login
	 */
	public String getLogin() {
		return Login;
	}
	/**
	 * Set's user login
	 */
	public void setLogin(String login) {
		Login = login;
	}
	/**
	 * Get's user password
	 */
	public String getPassword() {
		return Password;
	}
	/**
	 * Set's user password
	 */
	public void setPassword(String password) {
		Password = password;
	}
	/**
	 * Get's user phone
	 * 
	 */
	public String getPhone() {
		return Phone;
	}
	/**
	 * Set's user phone
	 */
	public void setPhone(String phone) {
		Phone = phone;
	}
	/**
	 * Get's comments that the user can set
	 */
	public String getComment() {
		return Comment;
	}
	/**
	 * Set's comments that the user can set
	 */
	public void setComment(String comment) {
		Comment = comment;
	}
	/**
	 * Get's rewiew on the work done
	 */
	public String getRewiew() {
		return Rewiew;
	}
	/**
	 * Set's rewiew on the work done
	 */
	public void setRewiew(String rewiew) {
		Rewiew = rewiew;
	}
}
