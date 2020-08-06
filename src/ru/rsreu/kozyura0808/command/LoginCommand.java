package ru.rsreu.kozyura0808.command;

import javax.servlet.http.HttpServletRequest;

import resources.ConfigurationManager;
import ru.rsreu.kozyura0808.dataDAO.UserDAO;

public class LoginCommand implements ActionCommand {
	private static final String PARAM_NAME_LOGIN = "login";
	private static final String PARAM_NAME_PASSWORD = "password";

	@Override
	public String execute(HttpServletRequest request) {
		String page = null;
		UserDAO userDAO = (UserDAO) request.getServletContext().getAttribute("userDAO");
	
		String login = request.getParameter(PARAM_NAME_LOGIN);
		String pass = request.getParameter(PARAM_NAME_PASSWORD);
		
		int idType = userDAO.confirmUser(login, pass);
		int idUser = userDAO.getUserId(login);
		String block_status = userDAO.geUserBlockStatus(login);

		userDAO.setOnlineStatus(idUser, "ON");

		request.getSession().setAttribute("ID_USERS", idUser);
		request.getSession().setAttribute("ID_TYPE_USERS", idType);

		if (block_status == null) {
			
		} else {
			if (block_status.equals("No")) {
				switch (idType) {
				case 1:
					page = ConfigurationManager.getProperty("path.page.master");
					break;

				case 2:
					page = ConfigurationManager.getProperty("path.page.userpage");
					break;

				case 3:
					page = ConfigurationManager.getProperty("path.page.getuserlistmoderator");
					break;

				case 4:
					page = ConfigurationManager.getProperty("path.page.adminpage");
					break;

				}
			} else {
				page = "/ban.jsp";
			}
		}
		return page;
	}
}
