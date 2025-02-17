package days04;

import java.util.Scanner;

public class Ex06_04 {
	
	public static void main(String[] args) {
		byte score;
		String grade;
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("점수 입력: ");
		score = sc.nextByte();
		
		if ( score > 100 || score < 0 ) {
			grade = "잘못된 값";
		} else if (score >= 90) {
			grade = "수";
		} else if (score >= 80) {
			grade = "우";
		} else if (score >= 70) {
			grade = "미";
		} else if (score >= 60) {
			grade = "양";
		} else {
			grade = "가";
		}
		
		System.out.println(grade);

	}

}
