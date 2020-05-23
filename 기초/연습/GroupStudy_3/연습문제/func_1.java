//문제1번

정수 두개와 실수 두개를 입력 받으세요.
성별(문자) 입력 받기 M,F
문자열로 이름 입력 받기

성별이 M이면 남자 F면 여자 가 나오도록 출력하기
이름을 성하고 이름으로 분리하기
정수 두개를 각각 양수면 "양수", 음수면 "음수"로 출력하기
실수 두개를 이용하여 산술연산 출력하기

출력 예제: 양수 or 음수
출력 예제: 이름은 OOO이고 성은 O 이름은 OO 이고 성별은 OO입니다.
출력 예제: 실수 로만 산술연산자 순서로 출력되게 하세요.

문제2번

//두개의 숫자를 입력 받으세요.

//입력 받은 후 숫자 하나 당 음수면 음수, 양수면 양수, 0이면 0이 출력 되게 하고
//산술 연산을 출력 하세요.
//숫자는 -500 ~ 1000
//숫자가 -500 ~ 1000이 아니면 -500 ~ 1000 사이의 숫자를 입력하세요.를 출력하세요.

package study_3_group;

import java.util.Scanner;

public class func {
	public void prob1() {
		int num1, num2;
		char gender;
		String name;
		double dnum1, dnum2;

		Scanner sc = new Scanner(System.in);
		System.out.print("두개의 숫자를 입력 받으세요 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		sc.nextLine();

		System.out.println((num1 > 0 && num2 > 0) ? "양수" : (num1 < 0 && num2 < 0) ? "음수" : "0");

		System.out.print("성별을 입력하세요 : ");
		gender = sc.nextLine().charAt(0);
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();

		System.out.println(
				"이름은 " + name + "이고 성은 " + name.charAt(0) + " 이름은 " + name.charAt(1) + name.charAt(2) + "입니다.");

		System.out.print("두개의 실수를 입력하세요 : ");
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

		System.out.println("정수 두 개를 입력 받으세요 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		if ((num1 < -500 || num1 > 1000) || (num2 < -500 || num2 > 1000)) {
			System.out.println("-500 ~ 1000 사이의 숫자를 입력하세요");
		} else {
			System.out.println((num1 < 0) ? "num1 은 음수" : (num1 > 0) ? "num1 은 양수" : "0");
			System.out.println((num2 < 0) ? "num2 은 음수" : (num2 > 0) ? "num2 은 양수" : "0");

			System.out.println("num1 + num2 = " + (num1 + num2));
			System.out.println("num1 - num2 = " + (num1 - num2));
			System.out.println("num1 * num2 = " + (num1 * num2));
			System.out.println("num1 / num2 = " + (num1 / num2));
			System.out.println("num1 % num2 = " + (num1 % num2));

		}

	}

}
