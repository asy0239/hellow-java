// 첫번째 정수와 두번째 정수를 입력받는다
// 첫번째 정수는 두번째 정수보다 커야하며 1~49사이여야 한다. : 정상값
// 첫번째 정수가 두번째 정수보다 크나 만약 1~49 사이가 아닐시  :  입력한 값은 두번쨰 정수보다 크나 1~49를 초과합니다. 를 출력합니다.
// 첫번째 정수가 두번째 정수보다 작을 시 : 1~49사이가 아니어도 두번째 정수보다 숫자가 작습니다.를 출력.

//정상값인 경우 첫번째 입력값 작성해주시면 됩니다. ex) 입력한 값은 :  첫번째 정수값 X입니다. 출력.

package study_3_group;

import java.util.Scanner;

public class func_chan {
	public void chan() {
		int first , second;
		Scanner sc = new Scanner(System.in);
		
		first = sc.nextInt();
		second = sc.nextInt();
		
		if (first > second) {
			if((first > 1 && first < 50) && (second > 1 && second < 50)) {
				System.out.println("첫번째 정수값은 " + first + "입니다.");
			}
			else {
				System.out.println("first 가 second 값 보다 크지만 1 ~ 49 범위를 초과합니다.");
			}
		}else {
			System.out.println("second 가 first 보다 큽니다.");
		}
	}
}
