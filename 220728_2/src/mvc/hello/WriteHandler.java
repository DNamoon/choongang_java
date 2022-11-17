package mvc.hello;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import guestbook.model.Message;
import guestbook.service.GetMessageListService;
import guestbook.service.MessageListView;
import guestbook.service.WriteMessageService;
import mvc.command.CommandHandler;

public class WriteHandler implements CommandHandler {
	
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws UnsupportedEncodingException {
		req.setCharacterEncoding("utf-8");
		
		
		
		Message message = new Message();
		
		message.setGuestName(req.getParameter("guestName"));
		message.setPassword(req.getParameter("password"));
		message.setMessage(req.getParameter("message"));
		
		WriteMessageService writeService = WriteMessageService.getInstance();
		writeService.write(message);
	
		
		
		return "/WEB-INF/view/write.jsp";
	}

}
