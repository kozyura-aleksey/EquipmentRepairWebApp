package ru.rsreu.kozyura0808.command;

import javax.servlet.http.HttpServletRequest;

import resources.ConfigurationManager;
import ru.rsreu.kozyura0808.dataDAO.OrderDAO;

public class TakeRequestCommand implements ActionCommand{

	@Override
	public String execute(HttpServletRequest request) {
		String page = ConfigurationManager.getProperty("path.page.getrequestlistmaster");		
		int number = Integer.parseInt(request.getParameter("order_number"));	
		OrderDAO orderDAO = (OrderDAO) request.getServletContext().getAttribute("orderDAO");	
		orderDAO.takeRequest(number);	
		return page;
	}

}
