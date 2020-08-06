package ru.rsreu.kozyura0808.command;

import javax.servlet.http.HttpServletRequest;

import resources.ConfigurationManager;
import ru.rsreu.kozyura0808.data.User;
import ru.rsreu.kozyura0808.dataDAO.UserDAO;

public class AddNewUserCommand implements ActionCommand {

	@Override
	public String execute(HttpServletRequest request) {
		String page = ConfigurationManager.getProperty("path.page.getuserlist");

		//int id_users = Integer.parseInt(request.getParameter("id_users"));
		int type_user = Integer.parseInt(request.getParameter("type_user"));
		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");
		String comment = request.getParameter("comment");
		String rewiew = request.getParameter("rewiew");
		String status = request.getParameter("status");
		

		User user = new User();
		//user.setID_USERS(id_users);
		user.setID_TYPE_USERS(type_user);
		user.setName(name);
		user.setSurname(surname);
		user.setLogin(login);
		user.setPassword(password);
		user.setPhone(phone);
		user.setComment(comment);
		user.setRewiew(rewiew);
		user.setStatus(status);
		
		UserDAO userDAO = (UserDAO) request.getServletContext().getAttribute("userDAO");
		userDAO.addUser(user);
		return page;
	}

}
