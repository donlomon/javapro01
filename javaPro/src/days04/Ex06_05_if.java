package days04;

import java.util.Scanner;

public class Ex06_05_if {

	public static void main(String[] args) {
		byte score;
		String grade = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("점수 입력: ");
		score = sc.nextByte();
		
		if ( score <= 100 && score >= 90 ) {
			grade = "수";
		}
		if ( score < 90 && score >= 80 ) {
			grade = "우";
		}
		if ( score < 80 && score >= 70 ) {
			grade = "미";
		}
		if ( score < 70 && score >= 60 ) {
			grade = "양";
		}
		if ( score < 60 && score >= 0 ) {
			grade = "가";
		}
		if ( score > 100 || score < 0 ) {
			grade = "잘못된 값";
		}
		
		System.out.println(grade);

	}

}
