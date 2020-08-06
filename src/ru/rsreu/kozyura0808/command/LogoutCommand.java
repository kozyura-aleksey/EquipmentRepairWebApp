package ru.rsreu.kozyura0808.command;

import javax.servlet.http.HttpServletRequest;

import resources.ConfigurationManager;

public class LogoutCommand implements ActionCommand {
	@Override
	public String execute(HttpServletRequest request) {
		String page = ConfigurationManager.getProperty("path.page.index");
		request.getSession().invalidate();
		return page;
	}
}
