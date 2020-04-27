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
		System.out.println("이름이 뭔가요?");
		name = in.nextLine();
		System.out.println("나이를 입력하시오");
		String a = in.nextLine();
		System.out.println("직업이 뭔가요?");
		job = in.nextLine();
		age = Integer.parseInt(a);
		System.out.printf("이름은 %s 나이는 %d살인데 %s입니다.\n",name,age,job);
		System.out.println("에잉 ㅉㅉ");
	}
}
