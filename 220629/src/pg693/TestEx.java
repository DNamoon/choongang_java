package pg693;

import java.util.function.DoubleSupplier;

public class TestEx {

	public static void main(String[] args) {
		DoubleSupplier ins = () -> { 
			double num = (Math.random()*6)+1;
			return num;
			};
			double nn =ins.getAsDouble();
			System.out.println(nn);

	}
}
