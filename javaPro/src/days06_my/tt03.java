package days06_my;

import java.util.Scanner;

public class tt03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("점수 입력: ");
		int score = sc.nextInt();
		
		if ( score >= 90 ) {
			System.out.println("수");
		} else if ( score >= 80 ) {
			System.out.println("우");
		} else if ( score >= 70 ) {
			System.out.println("미");
		} else if ( score >= 60 ) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}
	}
}
