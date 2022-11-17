package strategy;

public class StrategyExam {
	public static void main(String[] args) {
		

		//Strategy st = new OpAdd();
		//OpAdd st = new OpAdd();  //�̷��� �� �� ���°ǰ���?
		Context con = new Context(new OpAdd());
		System.out.println(con);
		
		System.out.println(con.execute(10,20));
		System.out.println("=================");
		
		OpAdd s = new OpAdd();  //�׷��� �̰Ŵ� Strategy Ÿ���� �ƴѵ�  
		
		Context con2 = new Context(s);  //Context �ȿ� s ��� ������
		System.out.println(con2.execute(10, 20));
		System.out.println("=================");
		
		con = new Context(new OpSub());
		System.out.println(con);
		System.out.println(con.execute(10, 20));
	}

}
