package mini_time;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppEmp extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage ps) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("base.fxml"));
		Scene sc = new Scene(root);
		ps.setTitle("Find.app");
		ps.setScene(sc);
		ps.show();
	}
}
