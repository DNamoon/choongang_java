package pg658;

public class BoxEX {

	public static void main(String[] args) {
		Box<Integer> nn = new Box();
		nn.set(100);
		int gg = nn.get();
		System.out.println(gg);
		
		Box<String> bb =new Box();
		bb.set("hello");
		String ss = bb.get();
		System.out.println(ss);

	}

}
