package helloworld;

class ExamStatic {
	static int count = 0;
}

public class java_static {
	static int count = 100;
	int age = 30;
	public static int getCount() {
		return count;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ExamStatic.count);
		ExamStatic.count++;
		System.out.println(ExamStatic.count);
		System.out.println(java_static.getCount());
		System.out.println("mathŬ���� ���!" + (Math.random()*100));
		// 0~1 ���� ���� 
		System.out.println("mathŬ���� ���!" + (Math.sqrt(25.0)*10));
		// 25.0 �� ������
	}

}
