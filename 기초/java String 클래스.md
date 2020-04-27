# java String 클래스

## 1. String 클래스 개요

- String 클래스는 기본 데이터형이 아니므로 객체를 생성해야 사용 가능함

```java
// new 연산자 이용
String str = new String("자바 프로그래밍"); // 매개변수가 문자열인 생성자

// 이 방법으로 생성할 경우 동일한 문자열이라도 다른 기억공간에 생성

String str1 = new String("자바");
String str2 = new String("자바");
System.out.println(str1==str2); // false
```

- 문자열 할당을 이용한 객체 생성

```1
String str = "자바 프로그래밍"
// 이 방법으로 동일한 문자열을 생성할 경우 같은 기억공간에 할당됨

String str1 = "자바";
String str2 = "자바";
System.out.println(str1==str2); // true
```

|                메서드                |                             내용                             |
| :----------------------------------: | :----------------------------------------------------------: |
|             int length()             |                      문자열의 길이 반환                      |
|      boolean equals(String str)      |                두 문자열의 내용이 같으면 true                |
|     String substring(int begin)      | begin 위치부터 마지막까지의 문자열 반환, 인덱스는 0부터 시작 |
| String substring(int begin, int end) |         begin 위치부터 end 위치 전까지의 문자열 반환         |
|         String toLowerCase()         |                소문자로 치환된 문자열을 반환                 |
|         String toUpperCase()         |                대문자로 치환된 문자열을 반환                 |
|            String trim()             |           문자열 앞뒤 공백을 제거한 문자열을 반환            |

```java
String str1 = new String("java Programming");
System.out.println(str.length()); // 16
String str2 = new String("java Programming");
System.out.println(str1.equals(str2)); // true
String str3 = str1.substring(3); //a Programming 반환
str3 = str1.substring(0,3); // jav 반환
// String 클래스의 메서드는 자신의 문자열을 수정하지 않으므로 새로운 객체를 생성하여 반환 받아 사용해야 함
```

- 문자열 결합을 위한 "+" 연산자

  문자열끼리 "+" 연산을 할 경우 두 문자열이 연결

  숫자데이터와 문자열을 "+" 연산하면 숫자 데이터가 문자열로 자동 형변환

```java
String str1 = new String("java");
String str2 = new String("Programming")
System.out.println(str1+str2); // javaProgramming
System.out.println(str1+100); // java100
```

## 2. StringBuffer 클래스

- String 클래스는 객체가 가진 내용을 수정할 수 없으나 StringBuffer 클래스는 객체의 내용을 수정할 수 있음

|                        메서드                        |                            내용                             |
| :--------------------------------------------------: | :---------------------------------------------------------: |
|                     int length()                     |                      문자열 길이 반환                       |
|           StringBuffer append(String str)            |                         문자열 추가                         |
|                  String toString()                   |        StringBuffer 객체의 내용을 String 객체로 생성        |
|                 StringBuffer delete                  |         start위치부터 end-1 위치까지의 내용을 삭제          |
| StringBuffer replace(int start, int end, String str) | start 위치부터 end-1 위치까지의 내용을 주어진 문자열로 치환 |
|                StringBuffer reverse()                |                 문자열의 순서를 반대로 배치                 |
|     StringBuffer insert(int offset, String str)      |                 offset 위치에 문자열을 추가                 |

```java
StringBuffer sb = new StringBuffer(); // 객체 생성
sb.append("java Programming"); // 문자열 추가
Syetem.out.println(sb.toString()) // toString 생략가능
sb.replace(0,5,"jsp") // java -> jsp
sb.delete(0,3) // jsp 삭제
sb.reverse(); // 문자열 순서 반대로 재배치 
// gnimmargorp
```

