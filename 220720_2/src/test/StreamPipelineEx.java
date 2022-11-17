package test;

import java.util.Arrays;
import java.util.List;

public class StreamPipelineEx {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
			new Member("ȫ�浿",Member.MALE,33),
			new Member("������",Member.FEMALE,15),
			new Member("�̼���",Member.MALE,25)
			); 
		
		//��Ʈ������ �߰�ó���� ����ó���� ���ļ� ������ ����Ʈ���� ���� ��� ���̸� ���ϴ� ����
		double ageAvg = list.stream()                   //����Ʈ stream()�޼��� �� �θ���
				.filter(m->m.getSex() == Member.MALE)   //�߰�ó�� - ���� �����ϱ�
				.mapToInt(Member :: getAge)             //�߰�ó�� - Member Ŭ������ getAge()
				                                        //�޼��� Ȱ���Ͽ� ������ ���� ���� ��������
				.average()								//������ ���� ��� ���ϱ�
				.getAsDouble();							//���� ��� Double ������ ��Ÿ����	
		
		System.out.println("���� ���� ����� " + ageAvg + "�Դϴ�.");
		//��°�� >>>
		//���� ���� ����� 29.0�Դϴ�.
	}

}
