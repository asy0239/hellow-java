# java object 클래스

- 자바의 최상위 클래스는 java.lang.Object 클래스
- 자바의 모든 클래스는 Object 클래스로 부터 상속받음
- 새로 정의되는 모든 클래스는 extends 키워드가 없어도 묵시적으로 Object클래스로부터 상속받음
- Object 클래스에는 toString() 메서드와 equals() 메서드가 정의되어 있음

```java
// toString 메서드
public String toString() // 객체의 문자열을 반환
```

```java
// equals 메서드
public boolean equals(Object obj) // 두 객체의 내용을 비교하여 참, 거짓을 반환
```

## 1. tostring 메서드

- toString 메서드는 객체의 정보를 문자열 형태로 반환
- 간단한 클래스의 객체를 생성하여 toString 메서드 호출

```java
class House {
    double size;
    String housename;
    public House() {
        System.out.println("집 클래스 생성자");
    }
    public static void main(String[] args) {
        House house = new House();
        System.out.println(house.toString());
    }
}
// Object 클래스에 정의된 toString 메서드가 호출되며 클래스명과 해쉬코드의 조합이 출력
```

- 클래스의 특성에 따라 다른 문자열을 출력하려면 toString 메서드를 다음과 같이 오버라이딩하여 구현해야 함

```java
public String toString() {}
```

## 2. equals 메서드

- 자바의  기본 데이터형에 대해서 비교할 경우 값이 같으면 true

```java
int num1 = 1, num2 = 1;
if(num1 == num2) // true
    System.out.println("두 정수는 같다");
```

- String 클래스와 같은 객체의 내용에 대해서 비교할 경우 동일한 메모리에 할당되었는지를 판단하므로 "==" 연산자를 사용하면 false

```java
String str1 = new String("자바");
String str2 = new String("자바");
if(str1 == str2) //false
    System.out.println("두 문자열은 같다");
```

- 두 객체변수가 동일한 메모리에 생성되었을 경우 "==" 연산자 비교  시 true

```java
String str1 = new String("자바");
String str2 = str1;
if(str1 == str2) //true
    System.out.println("두 문자열은 같다")
```

- equals 활용

```java
String str1 = new String("자바");
String str2 = new String("자바");
if(str1.equals(str2)) //true
    System.out.println("두 문자열은 같다")
```

- String 클래스가 아닌 객체의 내용을 비교할 경우

```java
class Car {
    String carName = "티코";
}

Car car1 = new Car();
Car car2 = new Car();
if (car1.equals(car2)) // 두 객체의 내용이 같더라고 false
    Syetem.out.println("두 객체의 내용은 같다")
    
// 위와 같이 객체의 내용을 비교하기 위해서는 equals 메서드를 오버라이딩하여 구체적으로 비교해야함, 문자열끼리 비교를 해주어야함
```

```java
// 예제
public class Car {
    String carName;
    public Car(String str) {
        carName = str;
    }
    public boolean equals(Object obj) {
        Car tmp = (Car)obj;
        if (carName.equals(tmp.carName))
            return true;
        else
            return false;
    }
}

public class EqTest {
    public static void main(String[] args) {
        Car car1 = new Car("티코");
        Car car2 = new Car("티코");
        if (car1.equals(car2))
            System.out.println("두 객체의 내용은 같다");
        else
            System.out.println("두 객체의 내용은 다르다");
    }
}
```

