package helloworld;

public class java_������ {
	public java_������(String language) {
		// TODO Auto-generated constructor stub
		System.out.println(language + "����");
	}
	public java_������() {
		System.out.println("�� �κ��� ������");		
	}
	
	public java_������(int num) {
		for(int i = 0; i < num; i++) {
			System.out.printf("�����ε� ������ %s\n",i);
		}
	}
	public java_������(int num1, int num2) {
		System.out.print(num1 + "+");
		System.out.println(num2);
	}

	public static void main(String[] args) {
		java_������ ex1 = new java_������("java");
		java_������ ex2 = new java_������("C++");
		java_������ ex3 = new java_������("Basic");
		java_������ ex4 = new java_������(1); 
		java_������ ex5 = new java_������();
		java_������ ex6 = new java_������(1,2);
	}

}
