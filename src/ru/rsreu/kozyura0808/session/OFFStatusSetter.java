package ru.rsreu.kozyura0808.session;

import javax.servlet.http.HttpSessionEvent;

import ru.rsreu.kozyura0808.dataDAO.UserDAO;


public class OFFStatusSetter {

	//sessionEvent - Это класс, представляющий уведомления о событиях для изменения сеансов в веб-приложении.
	//javax.servlet.http.HttpSessionListener — обрабатывает события создания удаления HTTP-сессии;
	public void setOnlineStatus(String status, HttpSessionEvent sessionEvent) {
		try {
			int userId = (Integer) sessionEvent.getSession().getAttribute("ID_USERS");
			UserDAO userDAO = (UserDAO) sessionEvent.getSession().getServletContext().getAttribute("userDAO");
			userDAO.setOnlineStatus(userId, status);	
		} catch (NullPointerException e) {
			return;
		}
	}
}
