package ru.rsreu.kozyura0808.command;

public enum CommandEnum {
	LOGIN("forward") {
		{
			this.command = new LoginCommand();
		}
	},
	LOGOUT("forward") {
		{
			this.command = new LogoutCommand();
		}
	},
	SEARCH("forward") {
		{
			this.command = new SearchRequestCommand();
		}
	},
	MASTER("forward"){
		{
			this.command = new MasterCommand();
		}
	},
	GETUSERLIST("forward"){
		{
			this.command = new GetUserListCommand();
		}
	},
	GETUSERLISTMODERATOR("forward"){
		{
			this.command = new GetUserListModeratorCommand();
		}
	},
	ADDNEWUSER("redirect"){
		{
			this.command = new AddNewUserCommand();
		}
	},
	REMOVEUSER("redirect"){
		{
			this.command = new RemoveUserCommand();
		}
	},
	GETREQUESTLIST("forward"){
		{
			this.command = new GetRequestListCommand();
		}
	},
	GETREQUESTLISTMASTER("forward"){
		{
			this.command = new GetRequestListMasterCommand();
		}
	},
	ADDNEWREQUEST("redirect"){
		{
			this.command = new AddNewRequestCommand();
		}
	},
	TAKEREQUEST("redirect"){
		{
			this.command = new TakeRequestCommand();
		}
	},
	BLOCKUSER("redirect"){
		{
			this.command = new BlockUserCommand();
		}
	},
	SETMARK("redirect"){
		{
			this.command = new SetMarkFromOrderCommand();
		}
	};

	ActionCommand command;

	private String forwardOrRedirectCommand;

	CommandEnum(String forwardOrRedirectCommand) {
		this.forwardOrRedirectCommand = forwardOrRedirectCommand;
	}

	public ActionCommand getCurrentCommand() {
		return command;
	}

	public String checkCommandType() {
		return this.forwardOrRedirectCommand;
	}
}
