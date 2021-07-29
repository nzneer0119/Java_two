package chap13.sec01;

public class Box {  // 제네릭을 사용하지 않은 경우
	private Object object;
	public void set(Object object) { this.object = object; }
	public Object get() { return object; }
}
