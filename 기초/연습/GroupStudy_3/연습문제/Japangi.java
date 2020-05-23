자판기 입니다.
 삼항연산자, 입출력, 산술연산자를 배우기 위한 문제입니다.

 얼마를 넣을 지 정함
 세 개의 품목 중 자신이 원하는 걸 선택하고, 거스름돈을 반환시켜줍니다.
 단, if문 사용 금지!


출력예시

자판기 목록
==========================
1. 콜라      2. 사이다     3. 생수 
  500원         450원         200원
==========================
얼마를 넣을 거니??
1000
1000원이 들어왔습니다.물건을 선택해 주세요.
1
1 번을 선택했습니다. 
거스름 돈은 500원 입니다.


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
		System.out.println("자판기 목록");
		System.out.println("========================");
		System.out.println("1. 콜라      2. 사이다      3. 생수");
		System.out.println(" 500원            450원          200원");
		System.out.println("========================");
		System.out.print("얼마를 넣을 거니??");
		in = sc.nextInt();
		
		System.out.printf("%d원이 들어왔습니다. 물건을 선택해 주세요. :" , in);
		cho = sc.nextInt();
		
		System.out.printf("%d 번을 선택했습니다.", cho);
		
		System.out.println("거스름 돈은 " + 
		((cho == 1)? in - col: (cho == 2)? in - sy :(cho == 3)? in - wat: "잘 못 입력됨!") + "입니다.");
	}

}
