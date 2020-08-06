package ru.rsreu.kozyura0808.dataDAO;

import java.util.List;

import ru.rsreu.kozyura0808.data.Order;
/**
 * OrderDAO
 * 
 * @author Aleksey
 *
 */
public interface OrderDAO {
	/**
	 * Method for receiving list orders
	 */
	List<Order> getRequestList();
	/**
	 * Method for add order
	 * @param order - order to be added
	 */
	void addOrder(Order order);
	/**
	 * Method for take request for master
	 * @param number - number of order
	 */
	void takeRequest(int number);
	/**
	 * Method for search request by Order Number
	 * @param orderNumber - number of order
	 */
	List<Order> searchRequest(int orderNumber);
	/**
	 * Method for establishing a repair mark
	 * @param number - number of order
	 * @param mark - mark of repair work
	 */
	void setMark(int number, int mark);
}
