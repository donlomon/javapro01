package days04;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		int n;
		String res = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수 입력");
		n=sc.nextInt();
		
		switch ( n % 2 ) {
		case 0:
			System.out.println("짝수");
			break;
			
		case 1:
			System.out.println("홀수");
			break;

		//default:
			//break;
		} //switch

	}

}
