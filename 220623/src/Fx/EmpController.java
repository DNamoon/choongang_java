package Fx;

import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import test0.Emp;
import test0.EmpDao;

public class EmpController implements Initializable {
	@FXML private Button btn1;
	Scanner scan = new Scanner(System.in);
	PreparedStatement ps =null;
	ResultSet rs2 = null;
	//Scanner scan = 	new Scanner(System.in);
	EmpDao ed;
	@FXML private Button btn2;
    @FXML private TextField tf1;
    @FXML private TextField tf2;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		ed = new EmpDao();
		try {
			ed.connect();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		btn1.setOnAction(e->{
			try {
				handle1(e);
			} catch (Exception e1) {
				e1.printStackTrace();
			} 
		});
		btn2.setOnAction(e->{
			handle2(e);
		});
		
		
//		btn1.setOnAction(event -> {
//			try {
//				handle1(event);
//			} catch (ClassNotFoundException | SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		});
	}
	
	private void handle2(ActionEvent e) {
		// TODO Auto-generated method stub
//		Emp emp = ed.getEmp(Integer.parseInt(tf1.getText()));
//		tf1.setText(emp.employee_id+"");
//		tf2.setText(emp.first_name);
	}

	public void handle1(ActionEvent event) throws ClassNotFoundException, SQLException {
		
//		EmpDao data = new EmpDao();
//		data.connect();
//		
//		System.out.println("�߰��� ����� ���(����)�� �Է��ϼ��� >>>");
//		int emp_id = scan.nextInt();
//		System.out.println("�߰��� ����� �̸��� �Է��ϼ��� >>>"); 
//		String emp_name = scan.next();
//		System.out.println("�߰��� ����� ������ �Է��ϼ��� >>>");
//		int emp_salary = scan.nextInt();
//		int res = data.input(new Emp(emp_id,emp_name,emp_salary));
		
//int res = data.input(new Emp(27,"������555",700));
//		System.out.println(res+"�� �ԷµǾ����ϴ�.");
		
		//Emp emp = new Emp(Integer.parseInt(tf1.getText()), tf2.getText());
		//int nn = ed.modify(emp);
		//System.out.println(nn+"�� ����!");
		
		
	}
	
}
