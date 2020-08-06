package ru.rsreu.kozyura0808.data;

/**
 * Class that describes entity Order.
 * 
 * @author Aleksey
 *
 */
public class Order {
	/**
	 * Type of Repair
	 */
	private String Repair;
	/**
	 * Item to be repaired
	 */
	private String Item;
	/**
	 * User ID
	 */
	private int ID;
	
	/**
	 * User Name
	 */
	private String Name;
	/**
	 * User Surname
	 */
	private String Surname;
	/**
	 * User Phone
	 */
	private String Phone;
	/**
	 * Mark which will be given for repairs
	 */
	private int Mark;
	/**
	 * Number given to the order
	 */
	private int Order_number;
	/**
	 * User status on site
	 */
	private String Status;
	/**
	 * Description of a specific item
	 */
	private String Description;
	
	/**
	 * Get's order Description
	 */
	public String getDescription() {
		return Description;
	}
	/**
	 * Set's order Description
	 */
	public void setDescription(String description) {
		Description = description;
	}
	/**
	 * Get's user ID
	 */
	public int getID() {
		return ID;
	}

	/**
	 * Set's user ID
	 */
	public void setID(int iD) {
		ID = iD;
	}
	/**
	 * Get's user Status
	 */
	public String getStatus() {
		return Status;
	}
	/**
	 * Set's user Status
	 */
	public void setStatus(String status) {
		Status = status;
	}
	/**
	 * Constructor
	 */
	public Order() {

	}
	/**
	 * Get's order Number
	 */
	public int getOrder_number() {
		return Order_number;
	}
	/**
	 * Set's order Number
	 */
	public void setOrder_number(int order_number) {
		Order_number = order_number;
	}
	/**
	 * Get's type Repair
	 */
	public String getRepair() {
		return Repair;
	}
	/**
	 * Set's type Repair
	 */
	public void setRepair(String repair) {
		Repair = repair;
	}
	/**
	 * Get's order Item
	 */
	public String getItem() {
		return Item;
	}
	/**
	 * Set's order Item
	 */
	public void setItem(String item) {
		Item = item;
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
	 * Get's user phone
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
	 * Get's order Mark
	 */
	public int getMark() {
		return Mark;
	}
	/**
	 * Set's order Mark
	 */
	public void setMark(int mark) {
		Mark = mark;
	}
	
}
