package ru.rsreu.kozyura0808.command;

import javax.servlet.http.HttpServletRequest;

import resources.ConfigurationManager;
import ru.rsreu.kozyura0808.data.Order;
import ru.rsreu.kozyura0808.dataDAO.OrderDAO;
import ru.rsreu.kozyura0808.dataDAO.UserDAO;

public class AddNewRequestCommand implements ActionCommand {

	@Override
	public String execute(HttpServletRequest request) {
		String page = ConfigurationManager.getProperty("path.page.getrequestlst");
		
		UserDAO userDAO = (UserDAO) request.getServletContext().getAttribute("userDAO");
		int id_user = (Integer) request.getSession().getAttribute("ID_USERS");
		String name = (String) request.getSession().getAttribute("name");
		String surname = (String) request.getSession().getAttribute("surname");
			
		String item = request.getParameter("item");	
		String repair = request.getParameter("type_repair");
		String description = request.getParameter("description");
		
		Order order = new Order();
		order.setItem(item);
		order.setRepair(repair);
		order.setID(id_user);
		//order.setName(name);
		//order.setSurname(surname);
		//order.setPhone(phone);
		order.setDescription(description);
		
		OrderDAO orderDAO = (OrderDAO) request.getServletContext().getAttribute("orderDAO");
		orderDAO.addOrder(order);
		return page;
	}

}
