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
		System.out.println("math클래스 사용!" + (Math.random()*100));
		// 0~1 사이 난수 
		System.out.println("math클래스 사용!" + (Math.sqrt(25.0)*10));
		// 25.0 의 제곱근
	}

}
