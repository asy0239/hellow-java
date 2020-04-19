package helloworld;

public class java_2차원배열 {
	public static void main(String[] args) {
		int data[][] = {{1,2,3},{4,5,6}};
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				
				System.out.print(data[i][j]);
			}
		}
		
		
	}

}
