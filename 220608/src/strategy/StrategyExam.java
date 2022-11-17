package strategy;

public class StrategyExam {
	public static void main(String[] args) {
		

		//Strategy st = new OpAdd();
		//OpAdd st = new OpAdd();  //이렇게 볼 수 없는건가요?
		Context con = new Context(new OpAdd());
		System.out.println(con);
		
		System.out.println(con.execute(10,20));
		System.out.println("=================");
		
		OpAdd s = new OpAdd();  //그러면 이거는 Strategy 타입이 아닌데  
		
		Context con2 = new Context(s);  //Context 안에 s 어떻게 들어간건지
		System.out.println(con2.execute(10, 20));
		System.out.println("=================");
		
		con = new Context(new OpSub());
		System.out.println(con);
		System.out.println(con.execute(10, 20));
	}

}
