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

public class 상속_접근제어 {
	public static void main(String[] args) {
		Truck truck = new Truck();
//		truck.speed = 110; // speed 변수는 private 이므로 오류 발생
		truck.speedUp();
		
		System.out.println(Car2.speed);		
	}

}

