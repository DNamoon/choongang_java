import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application {

	public AppMain() {
		System.out.println(Thread.currentThread().getName()+" 생성자");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+ ": 메인");
		launch(args);  //객체 생성 및 메인 윈도우 생성한 다음 start()메서드 호출
		
	}

	@Override
	public void start(Stage ps) throws Exception {
		// TODO Auto-generated method stub
		ps.show();  //윈도우 보여주기
	}
	
	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName()+ ": init");
	}
	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub
		System.out.println();
	}
	


}
