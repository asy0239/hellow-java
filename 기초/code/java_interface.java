package helloworld;

interface VolumeSystem {
	void volumeUp();
	void volumeDown();
}

public class java_interface implements VolumeSystem {
	public void volumeUp() {
		System.out.println("������ ���δ�");
	}
	public void volumeDown() {
		System.out.println("������ �����");
	}
	public static void main(String[] args) {
		java_interface audio = new java_interface();
		audio.volumeUp();
		audio.volumeDown();
	}
}
