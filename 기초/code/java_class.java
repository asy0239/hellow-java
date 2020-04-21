package helloworld;

class Car {
	int num = 5;
	int speed = 110;
	void velUp() {
		speed += 10;
		System.out.println("+10");
	}
	void velDown() {
		speed -= 5;
		System.out.println("-5");
	}
}

public class java_class {
	public static void main(String[] args) {
		Car tico = new Car();
		System.out.println(tico.speed);
		tico.velUp();
		tico.velUp();
		System.out.println(tico.speed);
		tico.velDown();
		tico.velDown();
		System.out.println(tico.speed);
	}

}
