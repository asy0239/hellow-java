package helloworld;

public class if_else_�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ܼ� if else ��
		int a = 88;
		String result;
		if (a >= 90) {
			result = "�հ�";
			System.out.println(result);
		} else {
			result = "���հ�";
			System.out.println(result);
		}
		
		
		if (a >= 90) result = "�հ�"; // ������ �Ѷ����̸� {}�� �ʿ����
		else result = "���հ�";
		
		// ���� if else ��
		if (a >= 90) {
			result = "A���";				
		}
		else if (a >= 80 & a < 90) {
			result = "B���";
		}
		else {
			result = "c���";	
		}
		System.out.println(result);
	}

}

