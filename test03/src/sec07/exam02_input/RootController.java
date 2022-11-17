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

	@FXML private TextField txtName;
	@FXML private TextField txtKorean;
	@FXML private TextField txtMath;
	@FXML private TextField txtEnglish;
	


	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
	
	
	
	public void handleBtnSum(ActionEvent e) {
		String name = txtName.getText();
		
		String korean = txtKorean.getText();
		int num1 = Integer.parseInt(korean);
		
		String math = txtMath.getText();
		int num2 = Integer.parseInt(math);
		
		String english = txtEnglish.getText();
		int num3 = Integer.parseInt(english);
		
		int res = num1 + num2 + num3;
		System.out.println(res);
		

	}
	
	public void handleBtnCancelAction(ActionEvent e) {
		Platform.exit();
	}
}
