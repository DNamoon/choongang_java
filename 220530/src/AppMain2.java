import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain2 extends Application{
	public AppMain2() {
		System.out.println(Thread.currentThread().getName()+": AppMain2() ȣ��");
	}
	

	@Override
	public void init() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+": init() ȣ��");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+": start() ȣ��");
		primaryStage.show();
	}


	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+": stop() ȣ��");
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+": main() ȣ��");
		launch(args);
	}
	
	

}
