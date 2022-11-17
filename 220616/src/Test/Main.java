package Test;

public class Main {

	public static void main(String[] args) {
		/*A.C c = new A.C();     //Á¤Àû ¸â¹öÅ¬·¡½º ¹Ù±ù Å¬·¡½º °´Ã¼ »ý¼º¾øÀÌ »ç¿ë°¡´É È®ÀÎÇÏ°í ½Í¾úÀ½.
		System.out.println(c.field1=3);*/
		A a = new A();
		
		//ÀÎ½ºÅÏ½º ¸â¹ö Å¬·¡½º °´Ã¼ »ý¼º
		A.B b = a.new B();
		b.field1 =3;
		b.method1();
		
		//Á¤Àû ¸â¹ö Å¬·¡½º °´Ã¼ »ý¼º
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.memthod2();
		
		//·ÎÄÃ Å¬·¡½º °´Ã¼ »ý¼ºÀ» À§ÇÑ ¸Þ¼Òµå È£­ˆ¤©
		a.method();
		
		
	}

}
