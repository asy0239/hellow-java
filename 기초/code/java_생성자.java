package helloworld;

public class java_持失切 {
	public java_持失切(String language) {
		// TODO Auto-generated constructor stub
		System.out.println(language + "持失");
	}
	public java_持失切() {
		System.out.println("戚 採歳精 持失切");		
	}
	
	public java_持失切(int num) {
		for(int i = 0; i < num; i++) {
			System.out.printf("神獄稽漁 持失切 %s\n",i);
		}
	}
	public java_持失切(int num1, int num2) {
		System.out.print(num1 + "+");
		System.out.println(num2);
	}

	public static void main(String[] args) {
		java_持失切 ex1 = new java_持失切("java");
		java_持失切 ex2 = new java_持失切("C++");
		java_持失切 ex3 = new java_持失切("Basic");
		java_持失切 ex4 = new java_持失切(1); 
		java_持失切 ex5 = new java_持失切();
		java_持失切 ex6 = new java_持失切(1,2);
	}

}
