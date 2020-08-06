package ru.rsreu.kozyura0808.command;

import javax.servlet.http.HttpServletRequest;

import resources.ConfigurationManager;
import ru.rsreu.kozyura0808.dataDAO.UserDAO;

public class BlockUserCommand implements ActionCommand{

	@Override
	public String execute(HttpServletRequest request) {
		String page = ConfigurationManager.getProperty("path.page.getuserlistmoderator");
		
		int id = Integer.parseInt(request.getParameter("ID_USERS"));
		
		UserDAO userDAO = (UserDAO) request.getServletContext().getAttribute("userDAO");
		
		userDAO.blockUser(id);
		
		return page;
	}

}
