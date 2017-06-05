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
		
# 3. 클래스
- 클래스(class): 현실 세계의 설계도. 객체를 생성하기 위한 필드, 메소드가 정의되어 있음
- 인스턴스(instance): 클래스로부터 만들어진 객체. 클래스로부터 객체를 만드는 가정을 인스턴스화라고 함
