package helloworld;

public class java_objectŬ���� {
	public static void main(String[] args) {
		java_objectŬ���� exam = new java_objectŬ����();
		String str1 = new String("�ڹ�");
		String str2 = new String("�ڹ�");
		System.out.println(str1==str2); // �޸� ���� ��ġ�� ���ϹǷ� false
		String str3 = str1;
		System.out.println(str1==str3);
		System.out.println(str1.equals(str2)); // ���ڿ��� ���ϹǷ� true
		}
}
