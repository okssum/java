package chap13.sec07.exam01_generic_extends_implements;

/* 제네릭 인터페이스 */
public interface Storage<T> {
	public void add(T item, int index);
	public T get(int index);
}
