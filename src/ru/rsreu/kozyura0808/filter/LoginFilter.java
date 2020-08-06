package ru.rsreu.kozyura0808.filter;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;

import resources.ConfigurationManager;

public class LoginFilter implements Filter {

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletRequest ServletRequest = (HttpServletRequest) request;
		HttpServletResponse ServletResponse = (HttpServletResponse) response;
		String page = null;
		String command = ServletRequest.getParameter("command");
		Object session = ServletRequest.getSession(true);
		if (session == null) {
			if (command == null || "login".equals(command)) {
				filterChain.doFilter(request, response);			
				return;
			} 
			
			page = ConfigurationManager.getProperty("path.page.index");			
			ServletResponse.sendRedirect(ServletRequest.getContextPath() + page);		
			return;
		}
		filterChain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
	}
}
