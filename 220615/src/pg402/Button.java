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

	interface OnClickListener{  //�������̽��� ��ü���� �� �Ѵ�. �׷��� ������ �̿��ϰڳ�
		void onClick();
	}

}
