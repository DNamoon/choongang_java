package annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnoExam {

	public static void main(String[] args) {
		
		long start = 0, end = 0;
		
		Method[] dms = Serv.class.getDeclaredMethods();  //Serv 바이트코드(컴파일 된 .class 파일)을 가져와서 거기에 
														 //methods가 있는지 물어본다. 있으면 배열로 가져와라.
		
		for (Method mt: dms) {
			//PrnAnno 적용되었는지 확인
			if(mt.isAnnotationPresent(PrnAnno.class)) {
				//PrnAnno 객체 얻기
				PrnAnno pra = mt.getAnnotation(PrnAnno.class);	
				System.out.println(mt.getName());
				for(int i=0;i<pra.nnn();i++) {
					System.out.print(pra.vvv());
				}
				System.out.println();

				
				
				try {  //예외사항 try-catch 구문
					mt.invoke(new Serv());  //Serv() 객체를 생성해서 억지로 돌린거래.
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
