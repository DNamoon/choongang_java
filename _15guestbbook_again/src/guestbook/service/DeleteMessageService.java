package guestbook.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import guestbook.dao.MessageDao;
import guestbook.model.Message;
import jdbc.JdbcUtil;
import jdbc.connection.ConnectionProvider;

public class DeleteMessageService {
	//싱글톤으로 구현
	//필드 하나의 객체 생성
	private static DeleteMessageService instance = new DeleteMessageService();
	//getInstance() 메서드 - 외부 클래스에서 DeleteMessageService 객체 생성 필요할 때 호출하는 메서드. public
	public static DeleteMessageService getInstance() {
		return instance;
	}
	//생성자 - 싱클톤으로 구현하기 위해 private으로 구현
	private DeleteMessageService() {}
	
	public void deleteMessage(int messageId, String password) {
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);
			
			MessageDao messageDao = MessageDao.getInstance();
			Message message = messageDao.select(conn, messageId);
			if(message == null) {
				throw new MessageNotFoundException("메시지 없음");
			}
			if(!message.matchPassword(password)) {
				throw new InvalidPasswordException("패스워드 불일치");
			}
			messageDao.delete(conn, messageId);
			conn.commit();
		} catch (SQLException e) {
			JdbcUtil.rollback(conn);
			throw new ServiceException("삭제 실패: " + e.getMessage(),e);
		} catch (InvalidPasswordException | MessageNotFoundException e) {
			JdbcUtil.rollback(conn);
			throw e;
		}finally {
			JdbcUtil.close(conn);
		}
		
	}	
	
}
