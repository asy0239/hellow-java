// ù��° ������ �ι�° ������ �Է¹޴´�
// ù��° ������ �ι�° �������� Ŀ���ϸ� 1~49���̿��� �Ѵ�. : ����
// ù��° ������ �ι�° �������� ũ�� ���� 1~49 ���̰� �ƴҽ�  :  �Է��� ���� �ι��� �������� ũ�� 1~49�� �ʰ��մϴ�. �� ����մϴ�.
// ù��° ������ �ι�° �������� ���� �� : 1~49���̰� �ƴϾ �ι�° �������� ���ڰ� �۽��ϴ�.�� ���.

//������ ��� ù��° �Է°� �ۼ����ֽø� �˴ϴ�. ex) �Է��� ���� :  ù��° ������ X�Դϴ�. ���.

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
				System.out.println("ù��° �������� " + first + "�Դϴ�.");
			}
			else {
				System.out.println("first �� second �� ���� ũ���� 1 ~ 49 ������ �ʰ��մϴ�.");
			}
		}else {
			System.out.println("second �� first ���� Ů�ϴ�.");
		}
	}
}
