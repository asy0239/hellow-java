//����1��

���� �ΰ��� �Ǽ� �ΰ��� �Է� ��������.
����(����) �Է� �ޱ� M,F
���ڿ��� �̸� �Է� �ޱ�

������ M�̸� ���� F�� ���� �� �������� ����ϱ�
�̸��� ���ϰ� �̸����� �и��ϱ�
���� �ΰ��� ���� ����� "���", ������ "����"�� ����ϱ�
�Ǽ� �ΰ��� �̿��Ͽ� ������� ����ϱ�

��� ����: ��� or ����
��� ����: �̸��� OOO�̰� ���� O �̸��� OO �̰� ������ OO�Դϴ�.
��� ����: �Ǽ� �θ� ��������� ������ ��µǰ� �ϼ���.

����2��

//�ΰ��� ���ڸ� �Է� ��������.

//�Է� ���� �� ���� �ϳ� �� ������ ����, ����� ���, 0�̸� 0�� ��� �ǰ� �ϰ�
//��� ������ ��� �ϼ���.
//���ڴ� -500 ~ 1000
//���ڰ� -500 ~ 1000�� �ƴϸ� -500 ~ 1000 ������ ���ڸ� �Է��ϼ���.�� ����ϼ���.

package study_3_group;

import java.util.Scanner;

public class func {
	public void prob1() {
		int num1, num2;
		char gender;
		String name;
		double dnum1, dnum2;

		Scanner sc = new Scanner(System.in);
		System.out.print("�ΰ��� ���ڸ� �Է� �������� : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		sc.nextLine();

		System.out.println((num1 > 0 && num2 > 0) ? "���" : (num1 < 0 && num2 < 0) ? "����" : "0");

		System.out.print("������ �Է��ϼ��� : ");
		gender = sc.nextLine().charAt(0);
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.nextLine();

		System.out.println(
				"�̸��� " + name + "�̰� ���� " + name.charAt(0) + " �̸��� " + name.charAt(1) + name.charAt(2) + "�Դϴ�.");

		System.out.print("�ΰ��� �Ǽ��� �Է��ϼ��� : ");
		dnum1 = sc.nextDouble();
		dnum2 = sc.nextDouble();

		System.out.println("dnum1 + dnum2 = " + (dnum1 + dnum2));
		System.out.println("dnum1 - dnum2 = " + (dnum1 - dnum2));
		System.out.println("dnum1 * dnum2 = " + (dnum1 * dnum2));
		System.out.println("dnum1 / dnum2 = " + (dnum1 / dnum2));
		System.out.println("dnum1 % dnum2 = " + (dnum1 % dnum2));

	}

	public void prob2() {
		int num1, num2;
		Scanner sc = new Scanner(System.in);

		System.out.println("���� �� ���� �Է� �������� : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		if ((num1 < -500 || num1 > 1000) || (num2 < -500 || num2 > 1000)) {
			System.out.println("-500 ~ 1000 ������ ���ڸ� �Է��ϼ���");
		} else {
			System.out.println((num1 < 0) ? "num1 �� ����" : (num1 > 0) ? "num1 �� ���" : "0");
			System.out.println((num2 < 0) ? "num2 �� ����" : (num2 > 0) ? "num2 �� ���" : "0");

			System.out.println("num1 + num2 = " + (num1 + num2));
			System.out.println("num1 - num2 = " + (num1 - num2));
			System.out.println("num1 * num2 = " + (num1 * num2));
			System.out.println("num1 / num2 = " + (num1 / num2));
			System.out.println("num1 % num2 = " + (num1 % num2));

		}

	}

}
