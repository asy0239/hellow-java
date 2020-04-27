package helloworld;

abstract class CarMain {
	abstract void moveCar(); // 추상 클래스를 이용해 메서드이름이 같은 경우에도 다른 기능으로 사용가능
}

class CarSedan extends CarMain {
	public void moveCar() {
		System.out.println("승용차 이동");
	}
}

class CarTruck extends CarMain {
	public void moveCar() {
		System.out.println("트럭 이동");
	}
}

public class java_추상클래스 {
	public static void main(String[] args) {
		CarSedan car1 = new CarSedan();
		car1.moveCar();
		CarTruck car2 = new CarTruck();
		car2.moveCar();
	}
}