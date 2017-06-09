package chap08.sec07.exam02_default_method_extends;

/* 자식 인터페이스 */
public interface ChildInterface2 extends ParentInterface {
	@Override
	public default void method2() { /*실행문*/ }
	
	public void method3();
}

