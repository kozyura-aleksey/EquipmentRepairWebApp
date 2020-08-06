package ru.rsreu.kozyura0808.command;

import javax.servlet.http.HttpServletRequest;

import resources.ConfigurationManager;
import ru.rsreu.kozyura0808.dataDAO.UserDAO;

public class RemoveUserCommand implements ActionCommand{

	@Override
	public String execute(HttpServletRequest request) {
		String page = ConfigurationManager.getProperty("path.page.getuserlist");
				
		int id = Integer.parseInt(request.getParameter("ID_USERS"));
		
		UserDAO userDAO = (UserDAO) request.getServletContext().getAttribute("userDAO");
		
		if (id == 3) {
			String AdminRemoveError = ConfigurationManager.getProperty("AdminRemoveError");
			request.setAttribute("AdminRemoveError", AdminRemoveError);
		} else {
			userDAO.removeUser(id);
		}
		return page;
	} 

}
