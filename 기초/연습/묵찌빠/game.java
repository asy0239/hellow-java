package �����;

import java.util.Random;
import java.util.Scanner;

public class game {
	public static int winnerGame() {
		int comCard, myCard;
		int gameResult = 0;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		myCard = sc.nextInt();

		Random ran = new Random();
		comCard = ran.nextInt(3) + 1;

		while (i < 1) {
			if (myCard == comCard) {
				// �ٽ�
				System.out.println("���׿�");
				break;
			} else if (myCard == 1 && comCard == 2 || myCard == 2 && comCard == 3 || myCard == 3 && comCard == 1) {
				// my ��
				i++;
				gameResult = 1;
			} else {
				// comCard��
				i++;
				gameResult = -1;
			}
		}

		return gameResult;
	}

	public static int lastGame(int firstResult) {
		int comCard, myCard;
		int gameResult = 0;
		int i = 0;
		while (i < 1) {
		Scanner sc = new Scanner(System.in);
		myCard = sc.nextInt();

		Random ran = new Random();
		comCard = ran.nextInt(3) + 1;

			if (myCard == comCard) {
				// ���� ��
				i++;
				gameResult = firstResult;
			} else {
				System.out.println("�ٽ� ���ּ���");
			}

		}
		return gameResult;
	}
}
