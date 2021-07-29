package chap13.four.boxing;

public class Util {
	public static <T> Box <T>boxing (T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}
