package chap15.sec02.t03;

import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		double startTime;
		double endTime;
		double arrTime;
		double linkedTime;
		double gapTime;
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime =  System.nanoTime();
		
		arrTime = endTime-startTime;
		System.out.println("ArrayList   걸린시간 : " + (arrTime) + " ns");
		
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime =  System.nanoTime();
		linkedTime = endTime-startTime;
		System.out.println("LinkedList 걸린시간 : " + (linkedTime) + " ns");
		
		gapTime = arrTime / linkedTime;
		
		System.out.println("비율 : 약 " + (gapTime) + "배");
		
	}
}
