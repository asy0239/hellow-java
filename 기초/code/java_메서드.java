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

public class java_�޼��� {
	void printString() {
		System.out.println("�ڹ� ���α׷���");
	}
	
	void printString(int count) {
		int i;
		for(i=0; i< count; i++) {
			System.out.printf("�ڹ� ���α׷���(%s)\n",count);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Met sum = new Met();
		System.out.println(sum.addData(10));
		
		java_�޼��� ex = new java_�޼���();
		ex.printString();
		ex.printString(3);
		
		

	}

}
