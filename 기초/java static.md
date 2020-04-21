# java static

## 1. 정적 멤버변수

### 1. static 개요

- 일반적으로 클래스의 객체가 생성될 경우 멤버변수는 각각의 객체가 독립적으로 사용
- 여러 객체가 멤버변수를 공유하고자 할 경우 static 키워드 사용

```java
// static 정의 문법
class ExamStatic {
    static int count = 0;
    int age = 30;
}

ExamStatic a = new ExamStatic();
ExamStatic b = new ExamStatic(); 

// age 변수는 각각 독립적으로 a,b 에 저장되고 count 변수는 서로 공유하는 특성
```

- 위와 같은 클래스의 경우 count 변수는 생성된 객체에서 공유할 수 있으며 age 변수는 객체마다 독립적으로 유지
- static 멤버변수는 생성된 객체의 개수를 셀 필요가 있을 경우 유용하게 사용
- static 멤버변수는 아래와 같이 객체 생성 없이 멤버에 접근 가능

```java
ExamStatic.count;
```

- static 멤버변수는 클래스명으로도 접근할 수 있고 객체 생성  후 객체변수로도 접근 가능
- static 멤버변수는 객체 생성 이전에 메모리 할당, 즉 new 연산자 없이 활용 가능

### 2. 정적 멤버변수 정의 활용

```java
class ExamStatic {
    static int count = 0;
}
```

- 정적 멤버변수 사용

```java
ExamStatic test = new ExamStatic()
test.count = 1;

ExamStatic.count = 2; // 객체 생성없이 한번에 사용 가능
```

## 2. 정적 메서드

### 1. 정적 메서드 개요

- 클래스 차원에서 사용 가능한 메서드
- 객체 생성 없이 클래스명으로 간편하게 호출 가능
- 정적 메서드 내에서는 일반 멤버변수 사용 불가능
- 정적 메서드 정의 예

```java
class ExamStatic {
    static int count = 0;
    int age = 30;
    public static int getCount() {
        return count;
    }
}

ExamStatic.getCount();
```

### 2. 정적 메서드 활용

```java
// 라인 출력 정적 메서드 정의
class ExamStatic {
    public static void printLine() {
        System.out.println("===================================");
    }
    public static void main(String[] args) {
        ExamStatic.printLine();
    }
}
```

```java
// 자바에서 제공하느 수학관련 클래스인 Math 클래스의 정적 메서드를 사용

System.out.println(Math.random());

System.out.println(Math.sqrt(25,0));
```

