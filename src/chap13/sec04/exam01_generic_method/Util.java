package chap13.sec04.exam01_generic_method;

/* 제네릭 메소드 */
public class Util {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}
