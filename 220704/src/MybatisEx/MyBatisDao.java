package MybatisEx;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class MyBatisDao {
	
	public int insertSt(SqlSession ses, Student st) {
		int nn = ses.insert("streamEx.insertSt", st);
		return nn;
	}
	
//	public List<Emp> selectList(SqlSession ses) {
//		List<Emp> ss = ses.selectList("mybatis.selectList");
//		return ss;
//	}
//
//	
//	public int insertEx3_2(SqlSession ses) {
//		int nn = ses.insert("mybatis.insertEx3_2");  //mapper에 생성한 namespace.insertid 부문이다.
//		return nn;
//	}
//	
//	public String selectName(SqlSession ses, int nn) {
//		String ss = ses.selectOne("mybatis.selectName", nn);
//		return ss;
//	}
//	
//	public int selectId(SqlSession ses, String userName) {
//		int userId = ses.selectOne("mybatis.selectId", userName);
//		return userId;
//	}
//	
//	public int insertEx32(SqlSession ses, Emp emp) {
//		int nn = ses.insert("mybatis.insertEx32",emp);
//		return nn;
//	}
//	
//	public Emp findName(SqlSession ses, int employee_id) {
//		Emp emp = ses.selectOne("mybatis.findName",employee_id);
//		return emp;
//	}

}
