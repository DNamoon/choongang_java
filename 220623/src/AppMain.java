import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application {

	public AppMain() {
		System.out.println(Thread.currentThread().getName()+" ������");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+ ": ����");
		launch(args);  //��ü ���� �� ���� ������ ������ ���� start()�޼��� ȣ��
		
	}

	@Override
	public void start(Stage ps) throws Exception {
		// TODO Auto-generated method stub
		ps.show();  //������ �����ֱ�
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
