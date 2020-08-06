package ru.rsreu.kozyura0808;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import resources.MessageManager;
import ru.rsreu.kozyura0808.command.ActionCommand;
import ru.rsreu.kozyura0808.command.CommandEnum;
import ru.rsreu.kozyura0808.command.EmptyCommand;

import java.util.List;

public class ActionFactory {

	public ActionCommand defineCommand(HttpServletRequest request) {
		ActionCommand current = new EmptyCommand();

		String action = request.getParameter("command");
		if (action == null || action.isEmpty()) {
			return current;
		}
		try {
			CommandEnum currentEnum = CommandEnum.valueOf(action.toUpperCase());

			current = currentEnum.getCurrentCommand();
		} catch (IllegalArgumentException e) {
			request.setAttribute("wrongAction", action + MessageManager.getProperty("message.wrongaction"));
		}
		return current;
	}

	public String checkCommandType(HttpServletRequest request) {
		String commandType = null;
		CommandEnum commandEnum = CommandEnum.valueOf(request.getParameter("command").toUpperCase());

		CommandEnum[] commandArray = CommandEnum.values();
		List<CommandEnum> forwardCommandsList = new ArrayList<CommandEnum>();
		List<CommandEnum> redirectCommandsList = new ArrayList<CommandEnum>();

		for (CommandEnum command : commandArray) {
			if ("forward".equals(command.checkCommandType())) {
				forwardCommandsList.add(command);
			} else {
				redirectCommandsList.add(command);
			}
		}

		if (forwardCommandsList.contains(commandEnum)) {
			commandType = "forward";
		} else {
			commandType = "redirect";
		}
		return commandType;
	}
}
