package helloworld;

public class java_����Ŭ���� {
	public java_����Ŭ����() {
		System.out.println("�ܺ� Ŭ������ ������");
		InnerExam inner = new InnerExam();
		inner.printExam(); // ���� Ŭ������ �޼��带 ������ �� ��ä ����
	}
	public void printOuter() {
		System.out.println("�ܺ� Ŭ������ �޼���");
	}
	class InnerExam {
		int x = 100;
		public void printExam() {
			System.out.println("���� Ŭ���� �޼���");
			printOuter(); // �ܺ�Ŭ������ �޼��带 ��ü�������� ���ٰ���
		}
	}
	public static void main(String[] args) {
		java_����Ŭ���� outer = new java_����Ŭ����();
		outer.printOuter();		
		java_����Ŭ����.InnerExam inner = outer.new InnerExam();
		System.out.println(inner.x);
		inner.printExam();
	}

}

