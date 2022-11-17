package mvc.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import guestbook.model.Message;
import mvc.command.CommandHandler;

public class ConfirmDeletionHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) {
		
		Message message =  new Message();
		
		message.setPassword(req.getParameter("password"));
		
		
		return "/WEB-INF/view/confirmDel.jsp";
	}

}
