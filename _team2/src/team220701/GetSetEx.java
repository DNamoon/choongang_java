package team220701;

public class GetSetEx {
	
	public static void main(String[] args) {
		
		GetSetMethod gugudan = new GetSetMethod();
		
		gugudan.setGu(3);
		int num = gugudan.getGu();
		
		//for문 이용 구구단
		for(int i=1;i<10;i++) {
			System.out.println(num + " x " + i + " = " + num*i);
		}
		
		System.out.println();
		
		//while문 이용 구구단
		int i = 1;
		while(i<10) {
			System.out.println(num + " x " + i + " = " + num*i);
			i++;
		}
		
		System.out.println();
		//구구단
		for(int num2=gugudan.getGu();num2<10;num2++) {
			System.out.println("==========="+num2+"단"+"==============");
			for(int i2=1;i2<10;i2++) {
				System.out.println(num2 + " x " + i2 + " = " + num2*i2);
			}
		}
		
	}
}
