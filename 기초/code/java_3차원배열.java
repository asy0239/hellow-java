package helloworld;

public class java_3차원배열 {
	public static void main(String[] args) {
		int [][][] data = new int[3][5][5];
		int num = 31;
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				for(int z = 0; z<data[i][j].length; z++) {
					// System.out.print(num+"\t");
					// data[i][j][z] = num;
					data[i][j][z] = num;
					num++;
					
					}
				}
			}
		
		for(int i = 0; i < data.length; i++) {
			System.out.println((i+1)+"번째 2차원 배열");
			for(int j = 0; j < data[i].length; j++) {
				for(int val: data[i][j]) {
					System.out.print(val+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		}
	}

