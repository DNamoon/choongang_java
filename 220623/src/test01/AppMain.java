package test01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {   //p.868 FXML �ε�

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));   //fxml ���� �ε� 
		//FXMLLoader�� fxml ���Ϸε� �ϴ� �ŷ�.
		Scene scene = new Scene(root);  //������ â ���� ��ɾ�??
		
		primaryStage.setTitle("�α���");;
		primaryStage.setScene(scene);
		primaryStage.show(); 
		
	}

}
