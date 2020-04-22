# java 상속과 접근제어

## 1. 클래스 상송

### 1. 클래스 상속 개요

- 클래스 상속이란 어느 한 클래스가 가진 모든 것을 물려받아 새로운 클래스를 정의하는 것
- 물려주는 클래스를 부모, 상위 클래스라 하고 물려받는 클래스를 자식, 하위클래스라고 함
- 자동차 클래스를 상속받아 승용차와 트럭 클래스를 생성
- 자동차 클래스는 승용차와 트럭 클래스가 공통으로 가질 수 있는 속성을 정의
- 승용차와 트럭 클래스는 자신만의 고유한 속성만 정의하면 됨

```java
class Parent {
	부모 클래스 속성, 메서드;
}

class Chile extends Parent {
    자식 클래스 속성, 메서드;
}
```

- 자식 클래스에서는 부모 클래스의 속성과 메서드를 그대로 가져다 사용할 수 있음
- 코드를 재사용 할 수 있으므로 프로그램을 쉽게 확장 가능
- 코드의 중복을 줄일 수 있음

```java
class Car {
    int speed = 100;
    void speedUp() {
        speed += 10;
    }
    void speedDown() {
        speed -= 10;
    }
}

class Truck extends Car {
    int weight = 5000;
}

Truck truck = new Truck();
truck.speed = 120;
truck.weight = 3000;
truck.speedUp();
```



## 2. 접근 지정자

### 1. 접근 지정자 개요

- 접근 지정자는 클래스의 멤버변수 또는 메서드에 접근할 수 있는 수준을 나타내는 키워드

- 접근 지정자의 종류

  1. private
  2. protected
  3. public

- private

  클래스 내부에서만 접근 가능

- protected

  클래스 내부와 상속받은 클래스, 동일 패키지 내의 클래스에서 접근 가능

- public

  클래스 외부에서 제한 없이 접근 가능

- 생략 시

  접근 지정자를 생략했을 경우 클래스 내부와 동일 패키지 또는 동일 디렉토리 내에서 접근 가능

- 일반적으로 멤버변수는 private , 메서드는 public 으로 지정하여 멤버변수에 쉽게 접근하지 못하도록 하고 메서드를 통해서만 접근할 수 있도록 함

```java
// private 사용 예
class Car {
    private int speed = 100; // 지금 Car 클래스 내부에서만 적용
}

class Truck extends Car {
    Truck() {
        speed = 120; // 에러, 상속받은 클래스에서 접근 불가능
    }
}

public static void main(String args[]) {
    Truck truck = new Truck();
    truck.speed = 110; // 에러, 클래스 외부이므로 접근 불가능
}
```

```java
// protected 사용 예
class Car {
    protected int speed = 100;
}

class Truck extends Car {
    Truck() {
        speed = 120; // 상속받은 클래스이므로 protected 멤버변수에 접근 가능
    }
}

public static void main(String args[]) {
    Truck car = new Truck();
    car.speed = 110; // 동일 디렉토리 안에 있으므로 접근 가능
}
```

```java
// public 사용 예
class Car {
    public int speed = 100;
    public speedUp() {
        speed += 10;
    }
}

class Truck extends Car {
    Truck() {
        speed = 120; // 상속받은 클래스에서 제한 없이 접근 가능
    }
}

public static void main(String args[]) {
    Car car = new Car();
    car.speed = 110; // 클래스 외부에서도 제한없이 접근 가능
    car.speedUp(); // public 메서드의 경우 외부에서 제한없이 접근 가능
    Truck truck = new Truck();
    truck.speed = 100; // 클래스 외부에서도 제한없이 접근 가능
}
```





https://tbbrother.tistory.com/66?category=308532