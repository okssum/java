package chap06.sec13.exam03_field_method_access.package1;

/* 필드와 메소드의 접근 제한 */
public class B {
	public B() {
		A a = new A();
		a.field1 = 1;   
		a.field2 = 1;   
		//a.field3 = 1;   
		
		a.method1();  
		a.method2();  
		//a.method3();  
	}
}

