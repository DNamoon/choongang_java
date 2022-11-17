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
			result = "�޽����� �����Ͽ����ϴ�.";
		} else { 
			deleteMsg = "/WEB-INF/view/deleteMsg2.jsp";
			result = "�Է��� ��ȣ�� �ùٸ��� �ʽ��ϴ�.";
		}
		
		req.setAttribute("result", result);
		
		//return deleteMsg;
		return "/WEB-INF/view/deleteMsg.jsp";

	}

}
