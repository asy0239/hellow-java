package helloworld;
import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		String name;
		String job;
		
		System.out.println("controll shift");
		Scanner in = new Scanner(System.in);
		System.out.println("�̸��� ������?");
		name = in.nextLine();
		System.out.println("���̸� �Է��Ͻÿ�");
		String a = in.nextLine();
		System.out.println("������ ������?");
		job = in.nextLine();
		age = Integer.parseInt(a);
		System.out.printf("�̸��� %s ���̴� %d���ε� %s�Դϴ�.\n",name,age,job);
		System.out.println("���� ����");
	}
}
