package days06_my;

import java.util.Scanner;

public class Ex04_03 {

	public static void main(String[] args) {
		int sum = 0, i, n, m;
	    
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 범위 입력: ");
		n = sc.nextInt();
		m = sc.nextInt();
		
		int min = n > m ? m : n ; // Math.min(n,m);
	    int max = Math.max(n, m);
		
		for ( i = min; i <= max; i++ ) {
			System.out.printf("%d+", i);
			sum += i;
		}
		System.out.printf("=%d", sum);
	}

}
