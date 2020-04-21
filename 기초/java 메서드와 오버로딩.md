

# java 메서드와 오버로딩

## 1. 메서드 정의

### 1. 메서드 개요

- 클래스 내에 위치하며 **행위를 담당**하는 프로그램 영역

```java
반환데이터형 메서드명(매개변수 리스트) {
	변수 선언;
	문장;
	return 반환 값;
}
```

- 메서드명은 식별자 선언 규칙에 따라 부여
- 매개변수 리스트는 데이터형과 변수명으로 나타내며 한 개도 없을 수도 있음
- 반환데이터형은 반환 값의 타입과 일치해야 하며 반환할 값이 없을 경우 void로 기술
- 반환값이 없을 경우 return 문은 생략 가능

### 2. 메소드 활용

```java
// 반환값이 없으며 문자열을 5번 출력하는 메서드 정의
void printString() { // void 반환값 없음
    int i;
    for(i = 0; i < 5; i++) {
        System.out.println("자바 프로그래밍");
    }
}
```

```java
// 반환값이 없으며 매개변수에 전달된 횟수만큼 문자열을 출력하는 메서드 정의
void printString(int count) {
    for(i = 0; i < count; i++) {
        System.out.println("자바 프로그래밍");
    }
}
```

```java
// 1부터 10까지의 합을 구해 반환하는 메서드 정의
int addData() {
	int i, sum = 0;
    for(i = 1; i <= 10; i++){
        sum+=i;
    }
    return sum;
}
```

```java
// 1부터 매개변수에 전달된 값까지의 합을 구해 반환하는 메서드 정의
int addData(int num) {
    int i, sum = 0;
    for(i = 1; i <= num; i++){
        sum += i;
    }
    return sum;
}
```

## 2. 오버로딩

### 1. 오버로딩 개요

- 메서도 오버로딩(overloading)이란?

  메서드의 명칭이 동일하나 매개변수의 개수와 타입을 다르게 구현하는 것을 의미

- 메서드를 동일한 이름으로 여러 개 정의 가능하며 반환타입은 다를 수 있음

- 동일한 이름의 메서드가 다르게 인식되기 위한 조건

  메서드의 매개변수 개수가 다름

  메서드의 매게변수 개수가 동일하나 데이터형이 다름

- 메서드의 명칭이 동일하나 접근 제한자 또는 반환데이터형만 다른경우

  오버로딩으로 간주되지 않으며 이 경우 컴파일 에러 발생

### 2. 오버로딩 활용

```java
// 매개변수의 개수가 다른 경우 오버로딩
void printString() {
    System.out.println("자바 프로그래밍")
}

void printString(int count) {
    int i;
    for(i = 0; i < count; i++)
        System.out.println("자바 프로그래밍");
}

// 호출 시 매개변수의 입력으로 구분
```

```java
// 매개변수의 데이터형이 다른 경우 오버로딩
void addData(int num1, int num2) {
    int result;
    result = num1 + num2;
    System.out.println(result);
}

void addData(double num1, double num2) {
    double result;
    result = num1 + num2;
    System.out.println(result);
}

// 실수 값과 정수 값으로 구분
```

