package helloworld;

public class ������_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char temp = '-';
		int a = 5, result;
		// ���� ������
		// ++a �� 1 ���� , --a �� -1
		System.out.println(a);
		result = ++a;		
		System.out.printf("���� ���� : %s\n",result);
		result = a++;
		System.out.printf("���� ���� : %s\n",result);
		
		
		// ���� ������
		int c = 5;
		int d = 10;
		System.out.println(temp);
		System.out.println(c += d); // a = a + b �� ����
		System.out.println(c *= d); // �� �Ŀ��� c�� 15�� ���ԵǼ� 150�� ���
		
		// ��Ʈ������
		int num = 7, num2 = 5, result2;
		System.out.println(temp);
		result2 = num & num2;
		System.out.println(result2);
		result2 = num | num2;
		System.out.println(result2);
		result2 = num << num2; // num2  ��ŭ�� �ڸ� ����ŭ �̵�, �������� 5 ����Ʈ
		// ���� ���� 2�� 5�� ���� ��
		System.out.println(result2);
		result2 = num >> num2;
		// 2�� 5�� ���� ��
		System.out.println(result2);

	}

}
