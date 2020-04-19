package helloworld;

public class 연산자_1 {

	public static void main(String[] args) {
		// 변수 생성
		char c;
		int iNum;
		float f;
		double d;
		// 변수에 값을 저장
		c = 'A';
		iNum = 10000;
		f = 10.1f;
		d = 10.1;
		
		// 출력문
		System.out.println("출력해보자");
		System.out.println(c);
		System.out.println(iNum);
		System.out.println(f);
		System.out.println(d);
		// 산술 연산자
		System.out.println("산술연산자");
		System.out.println(2 + 3);
		System.out.println(2 * 3);
		System.out.println(2 - 3);
		System.out.println(2 % 3);
		System.out.println(2 / 3);
		// 관계 연산자
		System.out.println("관계연산자");
		System.out.println(3 > 2);
		System.out.println(3 < 2);
		System.out.println(3 >= 2);
		System.out.println(3 <= 2);
		System.out.println(3 != 2);
		// 조건 연산자들
		System.out.println("조건연산자");
		System.out.println(c == d && c == f); // and 연산자
		System.out.println(c == d || c == f); // or 연산자
		System.out.println(!(c == d)); // true이면 false로 반환
		System.out.println(c==d? c:f); // 조건식? 수식1:수식2
		// 마지막 값은 삼항 연산자라고도 불린다, 조건식이 true면 수식1 false면 수식2
		

	}

}
