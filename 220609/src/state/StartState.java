package state;

public class StartState implements State {

	@Override   //������̼�
	public void doAction(Context con) {  //�Ű������� ContextŬ������ ��ü�� �ްڴٴ� �ǹ�?
		System.out.println("�÷��̾� ���� ��");
		con.setSt(this); // ���� ��ü ���� �� �ߴµ� ���赵�� �̸� ���� ��.
	}
	
	public String toString() {
		return "���� ����";
	}
	

}
