package days04;

import java.util.Scanner;

public class Ex06_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력");
		int n = sc.nextInt();
		
		/*
		 * if ( n % 2 == 0 ) { System.out.println("짝수"); } //if
		 * 
		 * if ( n % 2 != 0 ) { System.out.println("홀수"); } //if
		 */
		
		if ( n % 2 == 0 ) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		System.out.println("end");
	}

}
