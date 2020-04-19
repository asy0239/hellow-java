package helloworld;

public class 연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char temp = '-';
		int a = 5, result;
		// 증감 연산자
		// ++a 는 1 증가 , --a 는 -1
		System.out.println(a);
		result = ++a;		
		System.out.printf("전위 연산 : %s\n",result);
		result = a++;
		System.out.printf("후위 연산 : %s\n",result);
		
		
		// 대입 연산자
		int c = 5;
		int d = 10;
		System.out.println(temp);
		System.out.println(c += d); // a = a + b 와 같다
		System.out.println(c *= d); // 위 식에서 c에 15가 대입되서 150이 출력
		
		// 비트연산자
		int num = 7, num2 = 5, result2;
		System.out.println(temp);
		result2 = num & num2;
		System.out.println(result2);
		result2 = num | num2;
		System.out.println(result2);
		result2 = num << num2; // num2  만큼의 자리 수만큼 이동, 왼쪽으로 5 시프트
		// 쉽게 말해 2를 5번 곱한 값
		System.out.println(result2);
		result2 = num >> num2;
		// 2를 5번 나눈 값
		System.out.println(result2);

	}

}
