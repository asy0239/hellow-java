package helloworld;

public class ������_1 {

	public static void main(String[] args) {
		// ���� ����
		char c;
		int iNum;
		float f;
		double d;
		// ������ ���� ����
		c = 'A';
		iNum = 10000;
		f = 10.1f;
		d = 10.1;
		
		// ��¹�
		System.out.println("����غ���");
		System.out.println(c);
		System.out.println(iNum);
		System.out.println(f);
		System.out.println(d);
		// ��� ������
		System.out.println("���������");
		System.out.println(2 + 3);
		System.out.println(2 * 3);
		System.out.println(2 - 3);
		System.out.println(2 % 3);
		System.out.println(2 / 3);
		// ���� ������
		System.out.println("���迬����");
		System.out.println(3 > 2);
		System.out.println(3 < 2);
		System.out.println(3 >= 2);
		System.out.println(3 <= 2);
		System.out.println(3 != 2);
		// ���� �����ڵ�
		System.out.println("���ǿ�����");
		System.out.println(c == d && c == f); // and ������
		System.out.println(c == d || c == f); // or ������
		System.out.println(!(c == d)); // true�̸� false�� ��ȯ
		System.out.println(c==d? c:f); // ���ǽ�? ����1:����2
		// ������ ���� ���� �����ڶ�� �Ҹ���, ���ǽ��� true�� ����1 false�� ����2
		

	}

}
