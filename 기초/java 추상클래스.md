# java 추상클래스

## 1. 추상 클래스

- 객체를 생성할 수 없는 클래스
- class 앞에 "abstract" 키워드를 추가

```java
abstract class 클래스명 {
	문장;
}
```

- 동일한 목적으로 접근 가능한 자식 클래스들을 정의하기 위해 사용
- 추상 클래스 자체는 내용을 갖지 않으며 상속을 위해 설계
- 추상 클래스는 일반 메서드나 멤버 변수를 가질 수 있음

## 2. 추상 메서드

- 내용을 갖지 않으며 몸통 부분이 없는 메서드
- 메서드명 앞에 "abstract" 키워드를 추가함

```java
abstract 반환데이터형 메서드명();
```

- 추상 메서드를 가지는 클래스는 반드시 추상 클래스이어야 함
- 추상 메서드는 실제 내용이 없으므로 호출이 불가능함
- 추상 클래스가 아닌 클래스에서 추상 메서드를 정의할 경우 에러
- 추상 메서드는 상속을 받는 자식 클래스에서 실제 내용을 구현함
- 추상 클래스의 상속을 받는 클래스에서는 추상 클래스의 메서드를 반드시 오버라이딩해야 함

```java
abstract class AbstractMain {
    abstract void printTest();
}

class AbstractSub extends AbstractMain {
    abstract void printTest() {
        System.out.println("Hello java");
    }
}

public static void main(String[] args) {
    AbstractSub test = new AbstractSub();
    test.printTest();
}
```

## 3. 메서드 오버라이딩

- 부모 클래스에 정의된 메서드를 자식 클래스에서 동일한 이름의 메서드로 재정의하는 기법
- 자식 클래스의 객체를 생성 후 오버라이딩 된 메서드 호출 시 부모 클래스의 메서드는 무시되고 자식 클래스의 오버라이딩 된 메서드가 처리
- 오버라이딩 된 메서드의 접근 지정자는 부모 클래스의 메서드와 동일하거나 넓은 범위로 설정
- 부모 클래스의 메서드와 오버라이딩 된 자식 클래스의 메서드는 선언부가 동일해야 함
- 메서드가 동일하기 위한 조건은 메서드명, 매개변수, 반환 데이터형, 접근 지정자

```java
class Parent {
    public void printTest() {
        System.out.println("부모 클래스의 메서드");
    }
}


class Child extends Parent {
    public void printTest() {
        System.out.println("자식 클래스의 메서드");
    }
}


class Exam {
    public static void main(String[] args) {
        Child test = new Child();
        test.printTest(); // '자식 클래스의 메서드' 가 출력됨
    }
}
```

- 클래스 설계 시 상속관계를 활용하는 것이 체계적인 방법

- 비슷한 종류의 클래스를 정의할 경우

  공통적인 속성 및 메서드를 부모 클래스에서 정의하고 자식 클래스에서 상속받도록 함

- 비슷한 클래스들이 유사한 기능의 메서드를 정의할 경우

  완전히 다른 이름보다 동일한 이름으로 선언하여 접근하도록 하는 것이 사용자에게 혼동을 줄일 수 있음

```java
abstract class Car {
    abstract void moveCar(); // 추상 메서드
}

class Sedan extends Car {
    void moveCar() {
        System.out.println("승용차 이동");
    }
}

class Truck extends Car {
    void moveCar() {
        System.out.println("트럭 이동");
    }
}
```

- 비슷한 종류의 클래스를 설계할 경우 공통적인 특성을 갖는 메서드를 부모 클래스에 정의하고 자식 클래스에서 상속받아 오버라이딩하여 구현하는 것이 체계적인 기법

- 다른 예제, 도형이라는 클래스를 만드는 데 공통적인 부분은 Shap에 각 도형 별로 다른 부분, 꼭지점의 개수나 각 도형의 변의 개수 등은 각 클래스부분에 정의한다 보면 쉬울 것 같다

```java
class Shape {
    // 공통적인 부분
}

class Rect extends Shape {
    Rect() {
        System.out.println("사각형");
    }
}

class Oval extends Shape {
    Oval() {
        System.out.println("원");
    }
}

class Tri extends Shape {
    Tri() {
        System.out.println("삼각형");
    }
}

```

