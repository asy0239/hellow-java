# java 내부클래스

## 1. 내부클래스 개요

- 클래스 내에 또 다른 클래스를 포함하는 기법
- 포함하는 클래스를 외부클래스, 포함되는 클래스를 내부클래스
- 내부 클래스에서 외부 클래스의 접근은 제한 없이 가능
- 외부 클래스에서 내부 클래스의 멤버 변수나 메서드에 접근 시 내부 클래스의 객체를 생성해야 함
- 컴파일 한 뒤에는 내부 클래스 파일이 별도로 생성됨

```
// 별도로 생성된 파일명
외부클래스명$내부클래스명.class
```

- GUI 프로그래밍에서 이벤트 처리에 활용

```java
// 내부 클래스 문법
class OuterExam {
    public OuterExam() {
        System.out.println("외부 클래스의 생성자");
        innerExam inner = new innerExam();
        inner.printExam(); // 내부 클래스의 메서드 호출
    }
    public void printOuter() {
        System.out.println("외부 클래스의 메서드");
    }
    class InnerExam {
        public void printExam() {
            System.out.println("내부 클래스 메서드");
            printOuter(); // 외부 클래스의 메서드를 호출
        }        
    }
    public static void main(String[] args) {
        OuterExam outer = new OuterExam();
    }
}
```

## 2. 내부 익명 클래스 개요

- 일반적으로 클래스는 정의와 생성이 분리되어 있음
- 내부 익명 클래스는 정의와 생성이 통하된 형태이며 클래스의 명칭이 없음
- 클래스의 인스턴스를 메서드 호출 시 매개변수에 넣을 때 사용
- 인스턴스 생성 후 레퍼런스를 유지할 필요가 없을 때 사용
- 익명 클래스는 클래스를 상속하거나 인터페이스를 구현할 때 사용할 수 있음

```java
// 내부 익명 클래스 문법
new 부모클래스명(매개변수) {
    클래스 정의;  // 일반적인 클래스 문법을 사용
}
```

```java
// 기본 문법
class First {
    public void printMsg() {
        System.out.println("첫 번째 클래스");
    }
}

public class TestMain {
    public static void main(String[] args) {
        First first = new First();
        first.printMsg():
        First second = new First() { // 내무 익명 클래스
            public void printMsg() {
                System.out.println("오버라이딩한 첫 번째 클래스");
            }
        };
        second.printMsg();
    }
}
```

```java
// 예시
public class HelloProgram {
    interface HelloLanguage {
        public void language();
    }
    public void helloLang() {
        HelloLanguage javalang = new HelloLanguage() {
            public void language() {
                System.out.println("java Language");
            }
        };
        javalang.language();
    }
    public static void main(String[] args) {
        HelloProgram myhello = new HelloProgram();
        myhello.helloLang();
    }
}

```

