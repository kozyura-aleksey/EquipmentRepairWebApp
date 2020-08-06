package ru.rsreu.kozyura0808.command;

import javax.servlet.http.HttpServletRequest;

import resources.ConfigurationManager;
import ru.rsreu.kozyura0808.dataDAO.OrderDAO;

public class SetMarkFromOrderCommand implements ActionCommand{

	@Override
	public String execute(HttpServletRequest request) {
		String page = ConfigurationManager.getProperty("path.page.getrequestlst");
		
		OrderDAO orderDAO = (OrderDAO) request.getServletContext().getAttribute("orderDAO");
		
		int number = Integer.parseInt(request.getParameter("order_number"));	
		
		int mark = Integer.parseInt(request.getParameter("mark"));
		
		orderDAO.setMark(number, mark);
		
		return page;
	}

}
