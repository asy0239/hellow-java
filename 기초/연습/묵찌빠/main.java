package 묵찌빠;

import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1 : 묵, 2 : 찌, 3: 빠\n세 개 숫자 중 하나를 선택해주세요");
		int first_result;
		first_result = game.winnerGame();
		System.out.println("승자는 : " + game.lastGame(first_result)  + "\nmy : 1 , com : -1");
		
	}
}
