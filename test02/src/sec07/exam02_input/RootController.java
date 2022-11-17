package sec07.exam02_input;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TextField;

public class RootController implements Initializable {
	@FXML private TextField txtTitle;
	@FXML private TextField txtPassword;
	@FXML private TextField txtNum;


	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
	
	public void handleBtnRegAction(ActionEvent e) {
		String title = txtTitle.getText();
		System.out.println("title: " + title);
		
		String password = txtPassword.getText();
		System.out.println("password: " + password);
		
	}
	
public void handleBtnAction(ActionEvent e) {
		
		String id = ((Node)e.getSource()).getId();
		System.out.println(id);
		
		String text1 = txtNum.getText();
		int num1 = Integer.parseInt(text1);
		
		String text2 = txtTitle.getText();
		int num2 = Integer.parseInt(text2);
		
		
		if (id.equals("btnPlus")) {
			System.out.println("더하기");
			int res = num1 +num2;
			System.out.println("더하기 결과: "+ res);
			System.out.println("============");
		}
		
		if (id.equals("btnMinus")) {
			System.out.println("빼기");
			int res = num1 +num2;
			System.out.println("빼기 결과: "+ res);
			System.out.println("============");
		}
		
		
		
	}

	public void handleBtnPlusAction(ActionEvent e) {
		
		String id = ((Node)e.getSource()).getId();
		System.out.println(id);
		
		String text1 = txtNum.getText();
		int num1 = Integer.parseInt(text1);
		
		String text2 = txtTitle.getText();
		int num2 = Integer.parseInt(text2);
		int res = num1 + num2;
		
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		
		System.out.println("더하기 결과: "+ res);
		System.out.println("============");
	}
	
	public void handleBtnMinusAction(ActionEvent e) {
		String text1 = txtNum.getText();
		int num1 = Integer.parseInt(text1);
		
		String text2 = txtTitle.getText();
		int num2 = Integer.parseInt(text2);
		int res2 = num1 - num2;
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		
		System.out.println("빼기 결과: "+ res2);
		System.out.println("============");
	}
	
	public void handleBtnMulAction(ActionEvent e) {
		String text1 = txtNum.getText();
		int num1 = Integer.parseInt(text1);
		
		String text2 = txtTitle.getText();
		int num2 = Integer.parseInt(text2);
		int res3 = num1 * num2;
		
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		
		System.out.println("곱하기 결과: "+ res3);
		System.out.println("============");
	}
	
	public void handleBtnDivAction(ActionEvent e) {
		String text1 = txtNum.getText();
		double num1 = Integer.parseInt(text1);
		
		String text2 = txtTitle.getText();
		double num2 = Integer.parseInt(text2);
		double res4 = num1 / num2;
		
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		
		System.out.println("나누기 결과: "+ res4);
		System.out.println("============");
	}
	
	
	public void handleBtnCancelAction(ActionEvent e) {
		Platform.exit();
	}
}
