# java 클래스

## 1. 클래스 개요

- 클래스는 객체를 생성하기 위한 틀과 같은 개념
- 클래스는 속성과 행위를 포함
- 클래스의 예 : 자동차

```java
class 클래스명 {  // 식별자 선언 규칙 - 대문자로 시작
    데이터형 변수명;
    생성자() {}
    데이터형 메서드() {} // 반환형
}

class Car {
    int num; // 속성(승차정원)
    int speed = 120; // 속성 (차량 속도, 120으로 초기화)
    void velUp() { // 메서드(속도 10증가)
        speed += 10;
    }
    void velDown() { //메서드(속도 10감소)
        speed-= 10;
    }
}
```

## 2. 객체 생성 개요

- 클래스를 선언하는 것만으로는 프로그램에서 사용할 수 없으며 객체 생성을 해야만 사용 가능

- 객체 생성 문법

  ```java
  Car tico = new Car();
  ```

- 위 문장은 이미 선언된 Car 클래스를 사용하여 tico라는 객체를 생성하고 있음

- 객체 변수(레퍼런스 변수라고도 함)는 기억공간에 할당됨

- 객체의 속성이나 메서드에 접근하기 위해서는 점(.) 연산자를 사용

```java
tico.speed = 110; // 속성의 값을 정함
tico.velUp(); // 메서드를 호출 
tico.velDown();
```

```java
// Car 클래스를 선언하고 객체를 2개 생성
class Car {
    int num = 5;
    int speed = 110;
    void velUp() {
        speed += 10;
    }
    void velDown() {
        speed -= 5;
    }
}

Car tico1 = new Car();
Car tico2 = new Car();
```

