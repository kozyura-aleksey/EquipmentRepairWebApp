package ru.rsreu.kozyura0808.oracledb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import resources.ConfigurationManager;
import ru.rsreu.kozyura0808.data.Order;
import ru.rsreu.kozyura0808.dataDAO.OrderDAO;

public class OracleOrderDAO implements OrderDAO{
	private Connection connection;

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	public OracleOrderDAO(Connection connection) {
		this.setConnection(connection);
	}
		
	private Order createOrder(ResultSet resultSet) {
		Order order = new Order();
		try {
			order.setItem(resultSet.getString(1));
			order.setRepair(resultSet.getString(2));
			order.setName(resultSet.getString(3));
			order.setSurname(resultSet.getString(4));
			order.setPhone(resultSet.getString(5));
			order.setMark(resultSet.getInt(6));
			order.setOrder_number(resultSet.getInt("order_number"));
			order.setStatus(resultSet.getString(8));
			order.setDescription(resultSet.getString(9));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return order;
	}
		
	
	@Override
	public List<Order> getRequestList() {
		List<Order> requestList = new ArrayList<Order>();
		Statement statement = null;
		ResultSet resultSet = null;

		String queryGetRequestList = ConfigurationManager.getProperty("getRequestList");

		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(queryGetRequestList);

			while (resultSet.next()) {
				requestList.add(createOrder(resultSet));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return requestList;
	}

	@Override
	public void addOrder(Order order) {
		PreparedStatement preparedSt = null;

		String queryAddUser = ConfigurationManager.getProperty("addRequest");

		String item = order.getItem();
		//int ordernumber = order.getOrder_number();
		//String statusrequest = order.getStatus();
		String repair = order.getRepair();
		int id = order.getID();
		String description = order.getDescription();
		
		try {
			preparedSt = connection.prepareStatement(queryAddUser);
			preparedSt.setString(1, item);
			//preparedSt.setInt(2, ordernumber);
			//preparedSt.setString(2, statusrequest);
			preparedSt.setString(2, repair);
			preparedSt.setInt(3, id);
			preparedSt.setString(4, description);
			preparedSt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	@Override
	public void takeRequest(int number) {
		PreparedStatement preparedSt = null;	
		
		String updateStatus = ConfigurationManager.getProperty("updateStatus");
		try {
			preparedSt = connection.prepareStatement(updateStatus);
			preparedSt.setInt(1, number);
			preparedSt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();			
		}
	}

	@Override
	public List<Order> searchRequest(int orderNumber) {
		List<Order> requestList = new ArrayList<Order>();
		PreparedStatement preparedSt = null;
		ResultSet resultSet = null;
		
		String querySearchRequestList = ConfigurationManager.getProperty("searchRequest");

		try {
			preparedSt = connection.prepareStatement(querySearchRequestList);
			preparedSt.setInt(1, orderNumber);
			resultSet = preparedSt.executeQuery();

			while (resultSet.next()) {
				requestList.add(createOrder(resultSet));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return requestList;
	}

	@Override
	public void setMark(int number, int mark) {
		PreparedStatement preparedSt = null;
		
		String queryRemoveUser = ConfigurationManager.getProperty("setMark");
		
		try {
			preparedSt = connection.prepareStatement(queryRemoveUser);
			preparedSt.setInt(1, mark);
			preparedSt.setInt(2, number);
			preparedSt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
