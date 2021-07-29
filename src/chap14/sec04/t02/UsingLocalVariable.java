package chap14.sec04.t02;

public class UsingLocalVariable {
	void method(int arg) {
		int localVar = 40;
		
		//arg = 31;
		//localVar = 41;
		
		//람다식
		MyFunctionInterface fi= () -> {
			//로컬 변수 읽기
			System.out.println("arg : " + arg);
			System.out.println("localVar : " + localVar + "\n");
		};
		fi.method();
	}
}
