# java 데이터 형

## 1 . 기본형

- 자바의 기본형은 논리형, 문자형, 정수형, 실수형으로 구성된다.

1. 논리형 - boolean - true, false 두가지 모양으로만 존재, 참, 거짓을 표현하기 위한 자료형, 1바이트
2. 문자형 - char - 2byte, ASCII 코드가 아닌 UNICODE를 사용한다
3. 정수형 - byte, short, int, long - 1,2,4,8byte 순으로 4가지 타입의 크기가 다르다
4. 실수형 - float, double - 4, 8byte 순, 소수점을 갖는 수를 저장

## 2. 참조형

- 기본형을 제외한 다른 모든 자료형을 참조형이라고 함
- 클래스, 배열, 문자열 등에 사용되는 자료형은 참조형으로 선언되어야 함
- 실제 값이 저장된 기억공간의 주소를 의미

```java
int arr[]; //배열 선언
String str; //문자열 객체 선언
```

## 3. 변수와 상수

### 1.  변수의 선언 및 사용

- 프로그램 실행 중에 변하는 값을 저장할 수 있는 기억공간으로 사용하기 위해서는 사전에 선언되어야 한다
- 변수를 선언하는 방법

```java
int age; // 정수형
boolean check; // 논리형
char ch; // 문자형
double height; // 실수형
```

- 변수는 식별자 선언 규칙에 따라 선언되어야 함
- 변수 선언과 동시에 저장될 값을 지정할 수 있음

```java
int age = 20;
boolean check = true;
char ch = 'A'; // 반드시 작은따음표를 사용해야 한다.
double height = 10.5;
```

### 식별자

- 변수명, 클래스명, 메서드명 등을 지정할 때 사용하는 문자열로서 프로그래머가 임의로 지정할 수 있으나 따라야하는 규칙이 있다.

#### 규칙

- 식별자로 사용할 수 있는 문자는 영어, 한글, 숫자, **밑줄문자** 등이며 숫자로 시작할 수 없음
- 대소문자는 구분되어 사용된다
- 특수문자는 사용 불가능하나 "$"는 사용 가능함, 가급적이면 변수명에는 사용하지 않는다
- 예약어(키워드)는 사용 불가능함

```java
//사용 가능한 식별자
nAge, k123, h_123
//사용 불가능한 식별자
7week : 숫자로 시작
while : 예약어
@net : 특수문자
```

### 2. 상수의 선언 및 사용

- 상수는 리터럴로 사용하거나 추후에 다룰 "final"키워드를 이용해서 정의할 수 있음

```java
// 상수 선언 방법
final int age = 20;
final double phi = 3.14; 
// 한번 저장하면 변경이 불가능
```

#### 리터널(Literal)

- 리터럴은 변수나 필드에 지정할 수 있는 값을 의미함
- 데이터 타입에 따라 표기법이 다름

```java
// 논리형
final boolean a = true // true, false
// 문자형
final char a = 'A' // 작은따음표!
// 정수형
final int a = 10
final int a = 0x12 // 16진수, 0x를 붙힘
final int a = 012  // 8진수, 0을 붙힘
// 실수형
final double a = 3.14
final double a = 0.31e+3 // 지수 표기
final float a = 3.14f // float형 상수
final double a = 3.14 // 더블 형 상수
```

