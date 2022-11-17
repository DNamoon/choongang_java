package pg691;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class TestEx {
	public static void main(String[] args) {
		BiConsumer<Integer,String> co = (tt,ff)->{
			System.out.println(tt+"8"+ff);
			System.out.println("가나다라");
		};
		co.accept(234,"sdfakj");
	}
}
