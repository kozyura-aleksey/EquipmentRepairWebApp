package ru.rsreu.kozyura0808;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import resources.ConfigurationManager;
import ru.rsreu.kozyura0808.command.ActionCommand;
import ru.rsreu.kozyura0808.dataDAO.DAOFactory;
import ru.rsreu.kozyura0808.dataDAO.DBType;
/**
 * FrontController - controller that handles all requests
 * 
 * @author Aleksey
 *
 */
@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Get requests processing
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * Post requests processing
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * User requests processing
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 * 
	 */
	private void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = null;
		
		if (request.getServletContext().getAttribute("DAOFactory") == null) {
			createDAOs(request);
		}
		ActionFactory client = new ActionFactory();
		String commandType = client.checkCommandType(request);
		ActionCommand command = client.defineCommand(request);
		
		page = command.execute(request);
		if (page != null) {
			if ("forward".equals(commandType)) {
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(page);
				dispatcher.forward(request, response);
			} else {
				response.sendRedirect(request.getContextPath() + page);
			}

		} else {
			page = ConfigurationManager.getProperty("path.page.index");
			response.sendRedirect(request.getContextPath() + page);
		}
		
	}
	/**
	 * Creating DAOs
	 * @param request
	 */
	private void createDAOs(HttpServletRequest request) {
		DAOFactory daoFactory = DAOFactory.getInstance(DBType.ORACLE);
		request.getServletContext().setAttribute("DAOFactory", daoFactory);
		request.getServletContext().setAttribute("userDAO", daoFactory.getUserDAO());
		request.getServletContext().setAttribute("orderDAO", daoFactory.getOrderDAO());
	}
}
