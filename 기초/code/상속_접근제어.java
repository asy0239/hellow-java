package helloworld;

class Car2 {
	public static int speed = 100; 
	public void speedUp() {
		speed += 10;
	}
}

class Truck extends Car2 {
	private int weight = 5000;
}

public class ���_�������� {
	public static void main(String[] args) {
		Truck truck = new Truck();
//		truck.speed = 110; // speed ������ private �̹Ƿ� ���� �߻�
		truck.speedUp();
		
		System.out.println(Car2.speed);		
	}

}

