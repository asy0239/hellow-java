package helloworld;

public class switch_case {
	
	public static void main(String[] args) {
		int score = 100;
		switch (score / 10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		default:
			System.out.println("C");
			
		}
	}

}
