package ru.rsreu.kozyura0808.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import resources.ConfigurationManager;
import ru.rsreu.kozyura0808.data.Order;
import ru.rsreu.kozyura0808.dataDAO.OrderDAO;

public class MasterCommand implements ActionCommand {

	@Override
	public String execute(HttpServletRequest request) {
		String page = "/requestsMaster.jsp";	
		OrderDAO orderDAO = (OrderDAO) request.getServletContext().getAttribute("orderDAO");
		List<Order> requestList = orderDAO.getRequestList();
		request.setAttribute("requestList", requestList);
		return page;
	}

}
