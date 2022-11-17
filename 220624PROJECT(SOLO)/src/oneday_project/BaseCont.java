package oneday_project;


import java.net.URL;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
//import test.Emp;

public class BaseCont implements Initializable {
	@FXML private Button btn1;
	@FXML private Button btn2;
	@FXML private TextField tfempNum; 
	@FXML private TextField tfempName; 
	@FXML private TextField tfemail; 
	@FXML private TextField tfempdef; 
	@FXML private TextField tffindName;
	@FXML private TextArea tfout;
	@FXML private TextField tftime;
	EmpProjDao data;
	
	
	private boolean stop;   //28추가한것.
	@FXML private Label lblTime;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		data = new EmpProjDao();
		try {
			data.Connect();
		} catch (ClassNotFoundException | SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		btn1.setOnAction(e -> {
			try {
				handle1(e);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		btn2.setOnAction(e->{
			try {
				handle2(e);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
	}
	
	public void handle1(ActionEvent e) throws SQLException {
//		int title = Integer.parseInt(empNum.getText());
//		System.out.println();
//		System.out.println("버튼1 클릭");
//		
//		//data.getColumn(new EmpProj(title));
//		findName.setText(data.getColumn(new EmpProj(title)));
		EmpProj emp = data.getColumn(Integer.parseInt(tfempNum.getText()));
		
		//EmpProjDao emp = data.getColumn(new EmpProj(empNum.getText()));
				//(Integer.parseInt(empNum.getText()));
		tfempName.setText(emp.empName);
		tfemail.setText(emp.email);
		tfempdef.setText(emp.department);
		//====================================================================
		while(true) {
			
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			String strTime = sdf.format(new Date());
			Platform.runLater(()->{
				tftime.setText(strTime);
				
			});
			try {
				Thread.sleep(100);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
//		stop = false;
//		Thread thread = new Thread() {
//			@Override
//			public void run() {
//				SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
//				while(!stop) {
//					String strTime = sdf.format(new Date());
//					Platform.runLater(()->{
//						lblTime.setText(strTime);
//					});
//					try { Thread.sleep(100); } catch (InterruptedException e) {}
//				}
//			};
//		};
//		thread.setDaemon(true);
//		thread.start();
	}
		
		
//		stop = false;
//		Thread thread = new Thread() {
//			@Override
//			public void run() {
//				SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
//				while(!stop) {
//					String strTime = sdf.format(new Date());
//					Platform.runLater(()->{
//						lblTime.setText(strTime);
//					});
//				}
//			}
//		};
//		thread.setDaemon(true);
//		thread.start();
		
//		result.setText("<<검색 결과>>");
//		tfempId.setText(emp.empId+"");
//		tfempname.setText(emp.name);
//		tfsalary.setText(emp.salary+"");
		
		
	//}
	
	public void handle2(ActionEvent e) throws SQLException {
		
	}
	
//	public void handle2(ActionEvent e) throws SQLException {
//		tfout.setTextFormatter(data.getTable());
//	}
	

}
