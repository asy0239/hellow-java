[����, ������, if�� ��������]
=> ��Ű�� ���� : com.kh.makeTest
 => ����� Ŭ���� ���� : TestMain.java
 	>> main() �޼ҵ� ���� : �� ������ �޼��� ���� �׽�Ʈ��
 => ��������� Ŭ���� ���� : MakeTest.java

[������ ���α׷�]
=> �޼ҵ��: public void parkingCar
=> ���೻��:
1) ������ ��(�ڽ��� ��)�� ����(����, ����, ����)�� �Է¹޴´�.
- ���׿����� ���
2) ������ ������ �´��� ����ڷκ��� y/n�� �Է¹޾� Ȯ���Ѵ�.s
- if�� ���
3) ������ ��(�ڽ��� ��)�� ������ ���� ������ ���� ����� ����Ѵ�.

=> ��� ����

1:����, 2:����, 3:����
������ �� ���� �������ּ���: 3

����� ���� �������� �½��ϱ�?
������ Y(y), Ʋ���� N(n) �Է�: Y

// Y(y) �Է��� ���
����� ���� �����Ǿ����ϴ�.
>> ���� ������ ���� <<
����: 0��    ����: 0��    ����: 1��

// N(n) �Է��� ���
���α׷��� �ٽ� �������ּ���.


package study_3_group;

import java.util.Scanner;

public class func_cho {
	public void parkingCar() {
		int myCar;
		int small_car = 0;
		int mid_car = 0;
		int big_car = 0;
		char check;
		Scanner sc = new Scanner(System.in);
		System.out.println("1: ���� , 2: ���� , 3: ����");
		System.out.print("������ �� ���� �������ּ��� :");
		myCar = sc.nextInt();
		sc.nextLine();
		System.out.println(
				"����� ���� " + ((myCar == 1) ? "������" : (myCar == 2) ? "������" : (myCar == 3) ? "������" : "�� �� �Է�!") + "�½��ϱ�?");
		check = sc.nextLine().charAt(0);
		if (check == 'Y' || check == 'y') {
			System.out.println("����� ���� �����Ǿ����ϴ�.");
			if (myCar == 1) {
				small_car++;
			} else if (myCar == 2) {
				mid_car++;
			} else if (myCar == 3) {
				big_car++;
			}
			System.out.println(">> ���� ������ ���� <<");
			System.out.println("���� : " + small_car + "��     ����: " +
					mid_car + " ��    ����: " + big_car + " ��");
		} else {
			System.out.println("���α׷��� �ٽ� �������ּ���");
	}
}
}
