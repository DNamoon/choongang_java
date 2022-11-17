package Exam324;
class Aaa{
	void ppp(Bbb bb) {
		bb.run();
	}
}

interface Bbb{
	void run();
}
/*
abstract class Bbb{
	void run() {
	}
}*/
class Ddd implements Bbb{ //extends Bbb{
	public void run() {
		System.out.println("Ddd 달린다.");
	}
	
}
class Eee implements Bbb{
	public void run() {
		System.out.println("Eee 달린다.");
	}
	
}
public class Exam01 {
	public static void main(String[] args) {
		Aaa aa = new Aaa();
		//Ddd dd = new Ddd();
		Eee ee = new Eee();
		
		/*aa.ppp(dd);
		aa.ppp(ee);*/
		
		Bbb dd = new Ddd();
		
		
	}
}
