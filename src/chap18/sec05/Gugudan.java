package chap18.sec05;

import java.io.IOException;
import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner (System.in);
		while(true) {
			System.out.println("구구단 몇단 : ");
			System.out.print("(종료하려면 2~9 이외의 숫자나 문자를 입력하세요.)");
			int dan = scan.nextInt();
			if(!(dan==0 || dan == 1)){
				System.out.println(dan+ "단 출력");
				for (int j =1 ; j <=9 ; j++) {
					System.out.printf("%d  *  %d  = %2d \n", dan, j, dan*j);
					}
				}else {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
		}
	}
}