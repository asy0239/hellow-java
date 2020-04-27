package helloworld;

public class java_string_class {
	public static void main(String[] args) {
		String str1 = new String("Java Programming");
		System.out.println(str1.length());
		String str2 = new String("Java Programming");
		System.out.println(str1.equals(str2));
		String str3 = str1.substring(3);
		System.out.println(str3);
		str3 = str1.substring(0,3);
		System.out.println(str3);
		String str10 = new String("Java");
		String str11 = new String("Programming");
		System.out.println(str10+str11);
		System.out.println(10.3 + str10);
		StringBuffer sb = new StringBuffer();
		sb.append("Java Programming");
		System.out.println(sb.toString()); // toString 삭제 가능
		sb.replace(0, 5, "jsp");
		System.out.println(sb);
		sb.delete(0, 3);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
	

}
