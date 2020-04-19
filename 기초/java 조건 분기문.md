# java 조건 분기문



## 1. if, else 구문

### 1. 단순 if 구문

- 조건식의 결과가 참일 경우 if 구문 바로 아래 문장을 수행
- 조건식의 결과가 거짓일 경우 if 구문 바로 아래의 문장은 건너뛴다
- 문장은 한 라인일 수도 있고 여러 라인일 수도 있다
- 문장이 한 라인일 경우 블록 기호 {{ }} 를 사용하지 않아도 된다
- 문장이 여러 라인일 경우 반드시 블록 기호 {{ }} 를 사용함

```java
if (조건식) {
	문장
}
// ex) score 가 90 이상일 경우 '합격'을 저장한다
if (score >= 90) {
    result = "합격";
}
```

### 2. 단순 if else 구문

- 조건식의 결과가 참일 경우 if 구문 바로 아래 문장, 거짓일 경우 else 아래 구문

```java
if (조건식) {
	문장1
} else {
	문장2
}

// ex) score 가 90 이상일 경우 '합격' 그 외 '불합격'
if (score >= 90) {
    result = "합격";
} else {
    result = "불합격";
}
```

### 3. 다중 if else 구문

- 조건식의 결과가 3개 이상일 경우 사용
- 조건식이 여러 개로 구성되며 두 번째 조건식부터 else if (조건식) 형태

```java
if (조건식1) {
    문장1
} else if (조건식2){
    문장2
} else {
    문장3
}

// ex) score 가 90 이상이면 'a', 80 이상이면 'b', 그외 'c'
if (score >= 90) {
    result ="a";
} else if (score >= 80) {
    result = "b"
} else {
    result = "c"
}
    
```

## 2. switch case 구문

### 1. switch case 문법

- 다중 분기에 사용
- 분기의 판단 기준은 조건식이 아닌 식의 값으로서 반드시 정수로 나타냄 ( x / 10 , x + 10 ...)
- break , default 문장은 생략 가능

```java
switch (정수식) {
    case 값1;
        문장1;
        break; // 이번 case 구문이 실행되면 끝맺음을 해준다. 없으면 다음 case 구문으로 넘어간다
    case 값2;
        문장2;
        :
        :
    case 값n;
        문장n;
        break;
    default; // case 구문 외의 다른 값일 경우
        문장;
}


// ex) score 가 90 이상일 경우 'A', 80 이상일 경우 "B", 그 외의 경우 "C"
switch (score/10) {
        case 10; // break 문을 넣지 않아 100이 들어와도 case 9의 구문이 동작한다
        case 9;
        	grade = "A";
        	break;
        case 8;
        	grade = "B";
        	break;
        default;
        	grade = "C";
}
```