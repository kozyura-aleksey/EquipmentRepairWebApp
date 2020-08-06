package ru.rsreu.kozyura0808.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import resources.ConfigurationManager;
import ru.rsreu.kozyura0808.data.Order;
import ru.rsreu.kozyura0808.dataDAO.OrderDAO;

public class SearchRequestCommand implements ActionCommand {

	@Override
	public String execute(HttpServletRequest request) {
		String page = "/requests.jsp";	
		OrderDAO orderDAO = (OrderDAO) request.getServletContext().getAttribute("orderDAO");	
		int number = Integer.parseInt(request.getParameter("order_number"));		
		List<Order> requestList = orderDAO.searchRequest(number);	
		request.setAttribute("requestList", requestList);	
		return page;	
	}
}
