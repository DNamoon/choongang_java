package MybatisEx;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class MyBatisService {
	private MyBatisDao dao = new MyBatisDao();
	
	public int insertSt(Student st) {
		SqlSession ses = SqlSessionTemplate.getSession();
		int nn = dao.insertSt(ses, st);
		if(nn>0) {
			ses.commit();
		} else {
			ses.rollback();
		}
		ses.close();
		return nn;
	}
	
//	public int insertEx3_2() {
//		SqlSession ses = SqlSessionTemplate.getSession();
//		int nn = dao.insertEx3_2(ses);
//		if(nn>0) {
//			ses.commit();
//		} else {
//			ses.rollback();
//		}
//		ses.close();
//		return nn;
//	}
//	
//	public String selectName(int nn) {
//		SqlSession ses = SqlSessionTemplate.getSession();
//		String ss = dao.selectName(ses, nn);
//		return ss;		
//	}
//	
//	public int selectId(String userName) {
//		SqlSession ses = SqlSessionTemplate.getSession();
//		int userId = dao.selectId(ses, userName);
//		return userId;
//	}
//	
//	public int insertEx32(Emp emp) {
//		SqlSession ses = SqlSessionTemplate.getSession();
//		int nn = dao.insertEx32(ses,emp);
//		if(nn>0) {
//			ses.commit();
//		} else {
//			ses.rollback();
//		}
//		ses.close();
//		return nn;
//	}
//	
//	public List<Emp> selectList(){
//		SqlSession ses = SqlSessionTemplate.getSession();
//		List<Emp> list = dao.selectList(ses);
//		return list;
//	}
//	
//	public Emp findName(int employee_id){
//		SqlSession ses = SqlSessionTemplate.getSession();
//		Emp emp = dao.findName(ses,employee_id);
//		return emp;
	//}
	
}
