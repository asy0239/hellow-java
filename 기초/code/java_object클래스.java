package helloworld;

public class java_object클래스 {
	public static void main(String[] args) {
		java_object클래스 exam = new java_object클래스();
		String str1 = new String("자바");
		String str2 = new String("자바");
		System.out.println(str1==str2); // 메모리 저장 위치를 비교하므로 false
		String str3 = str1;
		System.out.println(str1==str3);
		System.out.println(str1.equals(str2)); // 문자열을 비교하므로 true
		}
}
