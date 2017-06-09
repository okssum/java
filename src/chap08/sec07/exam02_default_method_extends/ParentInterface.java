package chap08.sec07.exam02_default_method_extends;

/* 부모 인터페이스 */
public interface ParentInterface {
    public void method1();
    public default void method2() { /*실행문*/ }
}

