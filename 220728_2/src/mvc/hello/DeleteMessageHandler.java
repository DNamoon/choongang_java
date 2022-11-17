package mvc.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import guestbook.service.DeleteMessageService;
import guestbook.service.InvalidPassowrdException;
import mvc.command.CommandHandler;

public class DeleteMessageHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) {

		int messageId = Integer.parseInt(req.getParameter("messageId"));
		String password = req.getParameter("password");
		boolean invalidPassowrd = false;
		try {
			DeleteMessageService deleteService = 
					DeleteMessageService.getInstance();
			deleteService.deleteMessage(messageId, password);
		} catch(InvalidPassowrdException ex) {
			invalidPassowrd = true;
		}
		
		String deleteMsg = null;
		String result = null;
		if (!invalidPassowrd) {
			deleteMsg = "/WEB-INF/view/deleteMsg1.jsp";
			result = "메시지를 삭제하였습니다.";
		} else { 
			deleteMsg = "/WEB-INF/view/deleteMsg2.jsp";
			result = "입력한 암호가 올바르지 않습니다.";
		}
		
		req.setAttribute("result", result);
		
		//return deleteMsg;
		return "/WEB-INF/view/deleteMsg.jsp";

	}

}
