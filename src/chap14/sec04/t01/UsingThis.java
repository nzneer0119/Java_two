package chap14.sec04.t01;

public class UsingThis {
	public int outterField = 10;
	
	class Inner {
		int innerField = 20;
		
		void method() {
			//람다식
			MyFunctionInterface fi = () -> {
				System.out.println("outterfield : " + outterField);
				System.out.println("outterfield : " + UsingThis.this.outterField + "\n");
				
				System.out.println("innerfield : " + innerField);
				System.out.println("innerfield : " + this.innerField + "\n");
			};
			fi.method();
		}
	}
}
