���Ǳ� �Դϴ�.
 ���׿�����, �����, ��������ڸ� ���� ���� �����Դϴ�.

 �󸶸� ���� �� ����
 �� ���� ǰ�� �� �ڽ��� ���ϴ� �� �����ϰ�, �Ž������� ��ȯ�����ݴϴ�.
 ��, if�� ��� ����!


��¿���

���Ǳ� ���
==========================
1. �ݶ�      2. ���̴�     3. ���� 
  500��         450��         200��
==========================
�󸶸� ���� �Ŵ�??
1000
1000���� ���Խ��ϴ�.������ ������ �ּ���.
1
1 ���� �����߽��ϴ�. 
�Ž��� ���� 500�� �Դϴ�.


package study_3_group;

import java.util.Scanner;

public class Japangi {

	public void func() {
		// TODO Auto-generated method stub
		int cho, in, out;
		int col = 500;
		int sy = 450;
		int wat = 200;
		Scanner sc = new Scanner(System.in);
		System.out.println("���Ǳ� ���");
		System.out.println("========================");
		System.out.println("1. �ݶ�      2. ���̴�      3. ����");
		System.out.println(" 500��            450��          200��");
		System.out.println("========================");
		System.out.print("�󸶸� ���� �Ŵ�??");
		in = sc.nextInt();
		
		System.out.printf("%d���� ���Խ��ϴ�. ������ ������ �ּ���. :" , in);
		cho = sc.nextInt();
		
		System.out.printf("%d ���� �����߽��ϴ�.", cho);
		
		System.out.println("�Ž��� ���� " + 
		((cho == 1)? in - col: (cho == 2)? in - sy :(cho == 3)? in - wat: "�� �� �Էµ�!") + "�Դϴ�.");
	}

}
