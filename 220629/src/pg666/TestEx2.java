package pg666;

import java.util.Arrays;

public class TestEx2 {  //p.667 ���ϵ�ī�� Ÿ�� �Ű� ����
	
	public static void regCo(Course<? super Worker> co) {
		System.out.println(co.getName() + " ������:" + Arrays.toString(co.getStudents()));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course<Person> pco = new Course<Person> ("�Ϲ��ΰ���", 5);
		pco.add(new Person("�Ϲ���"));
		Course<Worker> pco2 = new Course<Worker> ("�����ΰ���",5);
		pco.add(new Worker("������"));
		Course<Student> pco3 = new Course<Student> ("�л�����",5);
		pco.add(new Student("�л�"));
		pco.add(new HighStudent("����л�"));
		
		regCo(pco);
		
		//Course<Worker> wc = new
	}

}
