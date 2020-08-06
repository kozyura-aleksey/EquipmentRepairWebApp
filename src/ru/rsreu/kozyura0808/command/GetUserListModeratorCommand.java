package ru.rsreu.kozyura0808.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import resources.ConfigurationManager;
import ru.rsreu.kozyura0808.data.User;
import ru.rsreu.kozyura0808.dataDAO.UserDAO;

public class GetUserListModeratorCommand implements ActionCommand{

	@Override
	public String execute(HttpServletRequest request) {
		String page = ConfigurationManager.getProperty("path.page.usersModerator");
		UserDAO userDAO = (UserDAO) request.getServletContext().getAttribute("userDAO");
		List<User> userList = userDAO.getUserList();
		request.setAttribute("userList", userList);
		return page;
	}

}
