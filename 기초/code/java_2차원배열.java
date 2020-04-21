package helloworld;

public class java_2차원배열 {
	public static void main (String[] args) {
		int data[][] = new int[2][3];
		int count = 1;
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				data[i][j] = count;
				System.out.print(data[i][j]+" ");
				count++;
			}
			System.out.println();
		}
		
	}

}
