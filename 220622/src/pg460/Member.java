package pg460;

public class Member {
	public String id;
	public Member(String id) {
		this.id = id;
	}
	@Override  //��ü�� �������°� �ƴϰ� �������Բ� ����������?
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Member mm = (Member) obj;
		if(this.id.equals(mm.id)) {
			return true;
		}
		return false;
	}
}
