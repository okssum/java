자바(JAVA)
=======

# 1. 자바 소개
## 1.1 자바의 특징
- 이식성이 높은 언어이다.
- 객체 지향 언어이다.
- 함수적 스타일 코딩을 지원한다.
- 메모리를 자동으로 관리한다.
- 다양한 애플리케이션을 개발할 수 있다.
- 멀티 스레드를 쉽게 구현할 수 있다.
- 동적 로딩을 지원한다.
- 막강한 오픈소스 라이브러리가 풍부하다.

## 1.2 자바 가상 기계(Java Vertual Machine)

## 1.3 자바 개발 도구
- JRE(Java Runtime Environment) = JVM + 표준 클래스 라이브러리
- JDK(Java Development Kit) = JRE + 개발에 필요한 도구

## 1.4 자바 프로그램 개발 순서
	.java 소스 파일 작성
		↓
	컴파일러(javac.exe)로 바이트 코드 파일 생성
		↓
	JVM 구동 명령어(java.exe)로 실행
	
## 1.5 주석
- //:  //부터 라인 끝까지 주석으로 처리 (행 주석)
- /* ~ */:  /* 와 */ 사이에 있는 모든 범위를 주석으로 처리 (범위 주석)
****


# 2. 객체 지향 프로그래밍(OOP: Object Oriented Programming)
## 2.1 객체(Object)
- 물리적으로 존재하거나 추상적으로 생각할 수 있는 것 중에서 자신의 속성을 가지고 있고 다른 것과 식별 가능한 것
- 필드(속성)와 메소드(동작)로 구성되어 있음

## 2.2 객체 모델링(Object Modeling)
- 현실 세계의 객체를 소프트웨어 객체로 설계하는 것

## 2.3 객체 지향 프로그래밍
- 현실 세계에서 어떤 제품을 만들 때, 부픔을 먼저 개발하고 이 부품들을 하나씩 조립해서 완성된 제품을 만들 듯이, 소프트웨어를 개발할 때에도 부품에 해당되는 객체들을 먼저 만들고, 이것들을 하나씩 조립해서 완성된 프로그램을 만드는 기법
- 만들고자 하는 완성품인 객체를 모델링하고, 집합 관계에 있는 부품 객체와 사용 관계에 있는 객체를 하나씩 설계한 후 조립하는 방식으로 프로그램을 개발하는 기법

## 2.4 객체 지향 프로그래밍 특징
- 캡슐화(Encapsulation)
	- 객체의 필드, 메소드를 하나로 묶고 실제 구현 내용을 감추는 것
	- 외부 객체는 객체 내부의 구조를 알지 못하며 객체가 노출해서 제공하는 필드와 메소드만 이용할 수 있음
	- 외부의 잘못된 사용으로 인해 객체가 손상되지 않도록 함
- 상속(Inheritance)
	- 상위 객체는 자기가 가지고 있는 필드와 메소드를 하위 객체에게 물려주어 하위 객체가 사용할 수 있도록 해줌
	- 상위 객체를 재사용해서 하위 객체를 쉽고 빨리 설계할 수 있도록 도와주고, 이미 잘 개발된 객체를 재사용해서 새로운 객체를 만들기 때문에 반복된 코드의 중복을 줄여줌
	- 상위 객체의 수정으로 모든 하위 객체들의 수정 효과를 가져오므로 유지 보수 시간을 최소화시켜줌
- 다형성(Polymorphism)
	- 같은 타입이지만 실행 결과가 다양한 객체를 이용할 수 있는 성질
	- 부모 타입에는 모든 자식 객체가 대입될 수 있고, 인터페이스 타입에는 모든 구현 객체가 대입될 수 있음
	- 다형성의 효과로 객체는 부품화가 가능함
		- ex) 자동차를 설계할 때 타이어 인터페이스 타입을 적용했다면 이 인터페이스를 구현한 실제 타이어들은 어떤 것이든 상관없이 장착(대입)이 가능함	
***


# 3. 클래스
- 현실 세계의 설계도. 객체를 생성하기 위한 필드, 메소드가 정의되어 있음
## 3.1 클래스의 구성 멤버
- 필드(field): 객체의 고유 데이터, 부품 객체, 상태 정보를 저장하는 곳
- 생성자(constructor): new 연산자와 같이 사용되어 클래스로부터 객체를 생성할 때 호출되어 객체의 초기화를 담당
- 메소드(method): 객체의 동작에 해당하는 중괄호 {} 블록
	
## 3.2 인스턴스(instance)
- 클래스로부터 만들어진 객체
- 인스턴스 멤버: 객체(인스턴스)를 생성한 후 사용할 수 있는 필드와 메소드

## 3.3 오버로딩(overloading)
- 클래스 내에 같은 이름의 메소드(생성자)를 여러 개 선언하는 것
- 매개 변수의 타입, 개수, 순서 중 하나가 달라야 함

## 3.4 정적 멤버(static)
- 클래스에 고정된 멤버. 객체를 생성하지 않고 사용할 수 있는 정적 필드와 정적 메소드를 말함
- 객체(인스턴스)에 소속된 멤버가 아니라 클래스에 소속된 멤버이기 때문에 '클래스 멤버'라고도 함
### 3.4.1 싱글톤(Singleton)
- 단 하나만 생성되는 객체
	
## 3.5 final 필드와 상수
### 3.5.1 final 필드
- 초기값이 저장되면 이것이 최종적인 값이 되어서 프로그램 실행 도중 수정할 수 없음
- 만약 초기화되지 않은 final 필드를 그대로 남겨두면 컴파일 에러가 발생함
### 3.5.2 상수(static final)
- 불변의 값을 저장하는 필드
### 3.5.3 final 필드와 상수의 차이점
- final 필드는 객체마다 저장되고, 생성자의 매개값을 통해서 여러 가지 값을 가질 수 있기 때문에 상수가 될 수 없음. 
상수는 객체마다 저장되지 않고, 클래스에만 포함됨. 여러 가지 값으로 초기화될 수 없음

## 3.6 접근제한자
|접근 제한|적용 대상|접근할 수 없는 클래스|
|:---- |:-----|:------------|
|**public**|클래스, 필드, 생성자, 메소드|없음|
|**protected**|필드, 생성자, 메소드|자식 클래스가 아닌 다른 패키지에 소속된 클래스|
|**default**|클래스, 필드, 생성자, 메소드|다른 패키지에 소속된 클래스|
|**private**|필드, 생성자, 메소드|모든 외부 클래스|

## 3.7 메소드 오버라이딩(@Override)
- 상속된 메소드의 내용이 자식 클래스에 맞지 않을 경우, 자식 클래스에서 동일한 메소드를 재정의하는 것
- 메소드 오버라이딩 규칙
	- 부모의 메소드와 동일한 시그너처(리턴 타입, 메소드 이름, 매개 변수 리스트)를 가져야 함
	- 접근 제한을 더 강하게 오버라이딩할 수 없음
	- 새로운 예외(Exception)를 throws할 수 없음
	
## 3.8 final 클래스와 final 메소드
### 3.8.1 상속할 수 없는 final 클래스
- 이 클래스는 최종적인 클래스이므로 상속 할 수 없는 클래스가 됨
### 3.8.2 오버라이딩할 수 없는 final 메소드
- 이 메소드는 최종적인 메소드이므로 오버라이딩할 수 없음

## 3.9 추상 클래스
### 3.9.1 추상 클래스의 개념
- 실체 클래스: 객체를 직접 생성할 수 있는 클래스
- 추상 클래스: 이 클래스들의 공통적인 특성을 추출해서 선언한 클래스
- 추상 클래스는 실체 클래스의 공통되는 필드와 메소드를 추출해서 만들었기 때문에 객체를 직접 생성해서 사용할 수 없음
- 새로운 실체 클래스를 만들기 위해 부모 클래스로만 사용됨
- new 연산자로 직접 생성자를 호출할 수는 없지만 자식 객체가 생성될 때 super(...)를 호출해서 추상 클래스 객체를 생성하므로 추상 클래스도 생성자가 반드시 있어야 함
### 3.9.2 추상 클래스의 용도
- 실체 클래스들의 공통된 필드와 메소드의 이름을 통일할 목적
- 실체 클래스를 작성할 때 시간을 절약
### 3.9.3 추상 메소드와 오버라이딩
- 추상 클래스를 설계할 때, 하위 클래스가 반드시 실행 내용을 채우도록 강요하고 싶은 메소드가 있을 경우, 해당 메소드를 추상 메소드로 선언

# 4. 인터페이스
- 객체의 사용 방법을 정의한 타입
- 코드 변경 없이 실행 내용과 리턴값을 다양화할 수 있음



출처: [이것이 자바다](http://www.hanbit.co.kr/store/books/look.php?p_code=B1460673937)
