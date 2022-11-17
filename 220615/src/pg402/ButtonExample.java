package pg402;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button btn = new Button();
		
//		OnClickListener btn2 = new CallListener();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}

}
