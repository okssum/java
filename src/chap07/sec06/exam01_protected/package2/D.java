package chap07.sec06.exam01_protected.package2;

import chap07.sec06.exam01_protected.package1.A;

/* protected 접근 제한자 */
public class D extends A {
	public D() { // A 클래스의 생성자가 protected익기 때문에 
		super(); // new 연산자를 사용해서 생성자를 직접 호출할 수 없고, 자식 생성자에서 super()로 A 생성자를 호출할 수 있음
		this.field = "value";
		this.method();
	}
}
