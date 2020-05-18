package lotto;

import java.util.Random;

public class lotto {
	public static void main(String[] args) {
		Random ran = new Random();
		int[] lotto= new int[6];
		int[] lotto_try = new int[6];
		int cnt = 0;
		int change = 0;
		while (cnt < 5) {
			cnt = 0;
			for (int i = 0; i < lotto.length; i++) {
				lotto_try[i] = ran.nextInt(45)+1;
				System.out.print(i + "번째 숫자   " + lotto_try[i] + "  ");
			}
			
			System.out.println();
			
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = ran.nextInt(45)+1;
				System.out.print(i + "번째 숫자   " + lotto[i] + "  ");		
			}
			
			for (int i = 0; i < lotto.length; i++) {
				
				if (lotto[i] == lotto_try[i]) {
					cnt++;
				}
			}
			System.out.println("\n **"+change++ + "번 시도!");
			System.out.println(cnt + "개 맞음!");
		}
		
		
	}
}

