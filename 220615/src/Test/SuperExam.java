package Test;

public class SuperExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supersonic sa = new Supersonic();
		sa.takeOff();
		sa.fly();
		sa.flyMode = Supersonic.SUPERSONIC;
		sa.fly();
		sa.flyMode = Supersonic.NORMAL;
		sa.fly();
		sa.land();
	}

}
