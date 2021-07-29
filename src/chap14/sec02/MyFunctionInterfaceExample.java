package chap14.sec02;

public class MyFunctionInterfaceExample {

	public static void main(String[] args) {
		MyFunctionInterface fi;
		
		/*fi = () -> {
			String str = "method call1";
			System.out.println(str);};
				fi.method();
		
		fi = () -> {System.out.println("method call1"); };
		fi.method();		
		
		fi = () -> {System.out.println("method call2"); };
		fi.method();
		
		fi = () -> {System.out.println("method call3"); };
		fi.method();
		*/
		fi = (x) -> {System.out.println(x); };
		fi.method("method call3");
		
	}

}
