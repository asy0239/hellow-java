package helloworld;

public class java_내부클래스 {
	public java_내부클래스() {
		System.out.println("외부 클래스의 생성자");
		InnerExam inner = new InnerExam();
		inner.printExam(); // 내부 클래스의 메서드를 접근할 시 객채 생성
	}
	public void printOuter() {
		System.out.println("외부 클래스의 메서드");
	}
	class InnerExam {
		int x = 100;
		public void printExam() {
			System.out.println("내부 클래스 메서드");
			printOuter(); // 외부클래스의 메서드를 객체생성없이 접근가능
		}
	}
	public static void main(String[] args) {
		java_내부클래스 outer = new java_내부클래스();
		outer.printOuter();		
		java_내부클래스.InnerExam inner = outer.new InnerExam();
		System.out.println(inner.x);
		inner.printExam();
	}

}

