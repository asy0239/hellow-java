package �����;

import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1 : ��, 2 : ��, 3: ��\n�� �� ���� �� �ϳ��� �������ּ���");
		int first_result;
		first_result = game.winnerGame();
		System.out.println("���ڴ� : " + game.lastGame(first_result)  + "\nmy : 1 , com : -1");
		
	}
}
