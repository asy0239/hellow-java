package helloworld;

abstract class CarMain {
	abstract void moveCar(); // �߻� Ŭ������ �̿��� �޼����̸��� ���� ��쿡�� �ٸ� ������� ��밡��
}

class CarSedan extends CarMain {
	public void moveCar() {
		System.out.println("�¿��� �̵�");
	}
}

class CarTruck extends CarMain {
	public void moveCar() {
		System.out.println("Ʈ�� �̵�");
	}
}

public class java_�߻�Ŭ���� {
	public static void main(String[] args) {
		CarSedan car1 = new CarSedan();
		car1.moveCar();
		CarTruck car2 = new CarTruck();
		car2.moveCar();
	}
}