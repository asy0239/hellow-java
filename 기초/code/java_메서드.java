package helloworld;

class Met {
	int addData(int num) {
		int i, sum = 0;
		for(i = 0; i<=num; i++) {
			sum += i;
		}
		return sum;
	}
	
}

public class java_메서드 {
	void printString() {
		System.out.println("자바 프로그래밍");
	}
	
	void printString(int count) {
		int i;
		for(i=0; i< count; i++) {
			System.out.printf("자바 프로그래밍(%s)\n",count);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Met sum = new Met();
		System.out.println(sum.addData(10));
		
		java_메서드 ex = new java_메서드();
		ex.printString();
		ex.printString(3);
		
		

	}

}
