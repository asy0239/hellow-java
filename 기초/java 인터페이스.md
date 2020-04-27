# java 인터페이스

## 1. 인터페이스 개요

- 인터페이스는 클래스와는 다른 개념
- 명칭과 매개변수가 동일한 메서드로 객체에 접근 가능하도록 하기 위한 기법
- 인터페이스의 모든 메서드는 추상 메서드이며 "abstract" 키워드를 붙이지 않아도 됨
- 인터페이스에 정의된 메서드는 인터페이스를 사용하는 클래스에서 반드시 구현해야 함
- 인터페이스의 모든 메서드는 public 으로 선언해야 함
- 인터페이스는 값을 저장하는 일반 변수를 가질 수 없으나 상수는 사용 가능함
- 인터페이스의 메서드는 내부적으로 "public abstract" 로 인식함
- 클래스에서 인터페이스를 적용할 때 "구현한다."라는 표현을 쓰며 "implements" 키워드를 사용함
- 인터페이스를 적용하는 클래스에서 인터페이스의 메서드 내용을 구체적으로 구현해야 함
- 자바의 클래스는 다중 상속이 불가능하나 인터페이스를 이용할 경우 다중 상속이 가능

```java
// 기본 문법
interface Volume {
	void volumeUp();
}

// 인터페이스를 클래스에서 구현하는 문법
class Audio implements Volume {
    public void volumeUp() {
        
    }
}
// 예시
interface Volume {
    void volumeUp();
    void volumeDown();
}

class Audio implements Volume {
    public void volumeUp() {
        System.out.println("오디오 볼륨을 높인다"); // 실제로 행동하는 부분은 여기에 작성
    }
    public void volumeDown() {
        System.out.println("오디오 볼륨을 낮춘다");
    }
}

```

- 인터페이스의 정의
  1. 인터페이스는 추상 메서드를 가지고 있으며 메서드외 내용을 기술하지 않음
  2. 인터페이스에 선언된 메서드는 인터페이스를 적용하는 클래스에서 실제 내용을 구현해 주어야 함

## 2. 다중 상속

- 자바의 클래스는 다중 상속이 불가능

- 인터페이스를 이용하여 다중 상속 가능

- 다중 상속의 부작용

  ex) 승용차와 트럭 모두를 상속받게 될 경우 중복적인 상속을 받을 우려가 있음

```java
// 다중 상속 문법
interface Volume { }
interface Tuner { }
class Audio implements Volume, Tuner { }
```

```java
//예시
interface Volume {
    void printVolume();
}

interface Tuner {
    void printTuner(); // 인터페이스 정의
}

class Audio implements Volume, Tuner {  // 2개의 인터페이스 구현(다중 상속 효과)
    public void printVolume() {
        System.out.println("볼륨 조절기");
    }
    public void printTuner() {
        System.out.println("채널 선택기");
    }
}
```

```java
// 예시 2
interface Volume {
    void printVolume();
}

interface Tuner {
    void printTuner();
}

interface Controller extends Volume, Tuner {
    void printController();
}

class Audio implements Controller { 
    public void printVolume() {
        System.out.println("볼륨 조절기");
    }
    public void printTuner() {
        System.out.println("채널 선택기");
    }
    public void printController() {
        System.out.println("볼륨, 채널 통합 조정");
    }
}
// 위 같이 Controller 인터페이스를 구현 할 경우 Controller의 상속받는 모든 메서드를 구현 해주어야 함
```

