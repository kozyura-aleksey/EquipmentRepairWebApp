package ru.rsreu.kozyura0808.oracledb;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;

import ru.rsreu.kozyura0808.dataDAO.DAOFactory;
import ru.rsreu.kozyura0808.dataDAO.OrderDAO;
import ru.rsreu.kozyura0808.dataDAO.UserDAO;

import java.sql.Connection;

public class OracleDAOFactory extends DAOFactory {
	private static volatile OracleDAOFactory instance;
	private Connection connection;

	private OracleDAOFactory() {
	}

	public static OracleDAOFactory getInstance() throws ClassNotFoundException, SQLException {
		OracleDAOFactory factory = instance;
		if (instance == null) {
			synchronized (OracleDAOFactory.class) {
				instance = factory = new OracleDAOFactory();
				factory.connected();
			}
		}
		return factory;
	}

	private void connected() throws ClassNotFoundException, SQLException {
		Locale.setDefault(Locale.ENGLISH);
		DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "user1";
		String password = "pass";
		connection = DriverManager.getConnection(url, user, password);
	}

	@Override
	public UserDAO getUserDAO() {
		return new OracleUserDAO(connection);
	}

	@Override
	public OrderDAO getOrderDAO() {
		return new OracleOrderDAO(connection);
	}

}
