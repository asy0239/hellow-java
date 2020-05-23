[변수, 연산자, if문 연습문제]
=> 패키지 생성 : com.kh.makeTest
 => 실행용 클래스 생성 : TestMain.java
 	>> main() 메소드 포함 : 각 문제별 메서드 실행 테스트함
 => 기능제공용 클래스 생성 : MakeTest.java

[주차장 프로그램]
=> 메소드명: public void parkingCar
=> 실행내용:
1) 주차할 차(자신의 차)의 차종(소형, 중형, 대형)을 입력받는다.
- 삼항연산자 사용
2) 선택한 차량이 맞는지 사용자로부터 y/n을 입력받아 확인한다.s
- if문 사용
3) 주차한 차(자신의 차)를 포함한 현재 주차된 차량 대수를 출력한다.

=> 출력 예시

1:소형, 2:중형, 3:대형
주차할 차 종을 선택해주세요: 3

당신의 차는 대형차가 맞습니까?
맞으면 Y(y), 틀리면 N(n) 입력: Y

// Y(y) 입력할 경우
당신의 차가 주차되었습니다.
>> 현재 주차된 차량 <<
소형: 0대    중형: 0대    대형: 1대

// N(n) 입력할 경우
프로그램을 다시 시작해주세요.


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
		System.out.println("1: 소형 , 2: 중형 , 3: 대형");
		System.out.print("주차할 차 종을 선택해주세요 :");
		myCar = sc.nextInt();
		sc.nextLine();
		System.out.println(
				"당신의 차는 " + ((myCar == 1) ? "소형차" : (myCar == 2) ? "중형차" : (myCar == 3) ? "대형차" : "잘 못 입력!") + "맞습니까?");
		check = sc.nextLine().charAt(0);
		if (check == 'Y' || check == 'y') {
			System.out.println("당신의 차가 주차되었습니다.");
			if (myCar == 1) {
				small_car++;
			} else if (myCar == 2) {
				mid_car++;
			} else if (myCar == 3) {
				big_car++;
			}
			System.out.println(">> 현재 주차된 차량 <<");
			System.out.println("소형 : " + small_car + "대     중형: " +
					mid_car + " 대    대형: " + big_car + " 대");
		} else {
			System.out.println("프로그램을 다시 시작해주세요");
	}
}
}
