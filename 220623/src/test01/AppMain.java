package test01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {   //p.868 FXML 로딩

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));   //fxml 파일 로딩 
		//FXMLLoader가 fxml 파일로딩 하는 거래.
		Scene scene = new Scene(root);  //윈도우 창 여는 명령어??
		
		primaryStage.setTitle("로그인");;
		primaryStage.setScene(scene);
		primaryStage.show(); 
		
	}

}
