package chap13.sec02;

public class Box<T> {  // 제네릭을 사용한 경우
	private T t;
	public T get() { return t; }
	public void set(T t) { this.t = t; }
}
