package chap12.Thread.State.Yield;

public class YieldExample {

	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		threadA.start();
		threadB.start();  //A, B 모두 실행
		
		try {Thread.sleep(3000);}  catch (InterruptedException e) {}
		threadA.work = false; // B만 실행
		
		try {Thread.sleep(3000);}  catch (InterruptedException e) {}
		threadA.work = true;  //A, B 모두 실행

		try {Thread.sleep(3000);}  catch (InterruptedException e) {}
		threadA.stop = true;
		threadB.stop = true;  //A, B 모두 종료
	}
}
