package annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnoExam {

	public static void main(String[] args) {
		
		long start = 0, end = 0;
		
		Method[] dms = Serv.class.getDeclaredMethods();  //Serv ����Ʈ�ڵ�(������ �� .class ����)�� �����ͼ� �ű⿡ 
														 //methods�� �ִ��� �����. ������ �迭�� �����Ͷ�.
		
		for (Method mt: dms) {
			//PrnAnno ����Ǿ����� Ȯ��
			if(mt.isAnnotationPresent(PrnAnno.class)) {
				//PrnAnno ��ü ���
				PrnAnno pra = mt.getAnnotation(PrnAnno.class);	
				System.out.println(mt.getName());
				for(int i=0;i<pra.nnn();i++) {
					System.out.print(pra.vvv());
				}
				System.out.println();

				
				
				try {  //���ܻ��� try-catch ����
					mt.invoke(new Serv());  //Serv() ��ü�� �����ؼ� ������ �����ŷ�.
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
