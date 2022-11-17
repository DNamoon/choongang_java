package pg460;

public class Member {
	public String id;
	public Member(String id) {
		this.id = id;
	}
	@Override  //객체가 같아지는게 아니고 같아지게끔 보여지도록?
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Member mm = (Member) obj;
		if(this.id.equals(mm.id)) {
			return true;
		}
		return false;
	}
}
