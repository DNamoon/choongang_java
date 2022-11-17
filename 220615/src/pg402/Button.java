package pg402;

public class Button {
	OnClickListener listener;
	
/*	
	public OnClickListener getListener() {
		return listener;
	}*/


	public void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}

	interface OnClickListener{  //인터페이스는 객체생성 못 한대. 그러면 다형성 이용하겠네
		void onClick();
	}

}
