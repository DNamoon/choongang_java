package test01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class RootController implements Initializable { //p.868
	@FXML private Button btn1;
	@FXML private Button btn2;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		btn1.setOnAction(e ->handle1(e));
//		btn2.setOnAction(new EventHandler<ActionEvent>() {
//			@Override
//			public void handle(ActionEvent event) {
//				handle2(event);
//			}
//		});
		btn2.setOnAction(e -> handle2(e));
	}


	public void handle1(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("로그인 버튼 누름!");
	}  
	
	public void handle2(ActionEvent e) {
		System.out.println("종료 버튼 누름!");
	}
	

}
