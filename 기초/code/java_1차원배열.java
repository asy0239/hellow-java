package helloworld;

public class java_1차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int data[] = new int[5];
		//for (int i = 0; i<5; i++) {
			//data[i] = 10;
		//}
		//System.out.print(data);
		
		int data[] = {10,20,30,40,50};
		for(int i = 0; i<5; i++) {
			System.out.print(data[i]);
		}
		System.out.println();
		System.out.println(data);
		int x = 10;
		String.valueOf(x); // 자료형 바꿀 때 유용
		System.out.println("문자"+x);
	}

}
