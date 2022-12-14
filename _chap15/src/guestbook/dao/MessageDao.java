package guestbook.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import guestbook.model.Message;
//import jdbc.JdbcUtil;


public class MessageDao {
	private static MessageDao messageDao = new MessageDao();
	public static MessageDao getInstance() {
		return messageDao;
	}
	
	private MessageDao() {}
	
	public int insert(Connection conn, Message message) throws SQLException {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(
					"insert into guestbook_message"+
					"(guest_name, password, message) values (?,?,?)");
		pstmt.setString(1, message.getGuestName());
		pstmt.setString(2, message.getPassword());
		pstmt.setString(3, message.getMessage());
		return pstmt.executeUpdate();
		} finally {
			//JdbcUtil.close(pstmt);
		}
	}
	
//	public Message select(Connection conn, int messageId) {
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		psmt = conn.prepare
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
