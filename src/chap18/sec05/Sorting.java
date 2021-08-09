package chap18.sec05;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		
		int[] k = {21, 5, 18, 32, 19, 3, 26};
		Arrays.sort(k);
		for(int i=0; i<k.length; i++) {
			System.out.print(k[i]+ " ");
		}
	}
}
