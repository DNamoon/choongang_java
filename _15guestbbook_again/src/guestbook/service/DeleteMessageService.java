package guestbook.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import guestbook.dao.MessageDao;
import guestbook.model.Message;
import jdbc.JdbcUtil;
import jdbc.connection.ConnectionProvider;

public class DeleteMessageService {
	//�̱������� ����
	//�ʵ� �ϳ��� ��ü ����
	private static DeleteMessageService instance = new DeleteMessageService();
	//getInstance() �޼��� - �ܺ� Ŭ�������� DeleteMessageService ��ü ���� �ʿ��� �� ȣ���ϴ� �޼���. public
	public static DeleteMessageService getInstance() {
		return instance;
	}
	//������ - ��Ŭ������ �����ϱ� ���� private���� ����
	private DeleteMessageService() {}
	
	public void deleteMessage(int messageId, String password) {
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);
			
			MessageDao messageDao = MessageDao.getInstance();
			Message message = messageDao.select(conn, messageId);
			if(message == null) {
				throw new MessageNotFoundException("�޽��� ����");
			}
			if(!message.matchPassword(password)) {
				throw new InvalidPasswordException("�н����� ����ġ");
			}
			messageDao.delete(conn, messageId);
			conn.commit();
		} catch (SQLException e) {
			JdbcUtil.rollback(conn);
			throw new ServiceException("���� ����: " + e.getMessage(),e);
		} catch (InvalidPasswordException | MessageNotFoundException e) {
			JdbcUtil.rollback(conn);
			throw e;
		}finally {
			JdbcUtil.close(conn);
		}
		
	}	
	
}
