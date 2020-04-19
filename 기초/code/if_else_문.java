package helloworld;

public class if_else_문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 단순 if else 문
		int a = 88;
		String result;
		if (a >= 90) {
			result = "합격";
			System.out.println(result);
		} else {
			result = "불합격";
			System.out.println(result);
		}
		
		
		if (a >= 90) result = "합격"; // 문장이 한라인이면 {}가 필요없다
		else result = "불합격";
		
		// 다중 if else 문
		if (a >= 90) {
			result = "A등급";				
		}
		else if (a >= 80 & a < 90) {
			result = "B등급";
		}
		else {
			result = "c등급";	
		}
		System.out.println(result);
	}

}

