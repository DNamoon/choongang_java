package Fx;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import test0.EmpDao;

public class EmpFxAppMain extends Application {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		launch(args);
		
	
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
//		// TODO Auto-generated method stub
		Parent root = FXMLLoader.load(getClass().getResource("root2.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("EmpFxAppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
