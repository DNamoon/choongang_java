package oneday_project;

import java.sql.SQLException;

public class TestMain {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		EmpProjDao test = new EmpProjDao();
		test.Connect();
		test.getTable();
	}

}
