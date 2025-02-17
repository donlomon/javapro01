package days06_my;

import java.util.Scanner;

public class Ex04_02 {

	public static void main(String[] args) {
		int sum = 0, i, n, m;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 범위 입력: ");
		n = sc.nextInt();
		m = sc.nextInt();
		
		for ( i = n; i <= m; i++ ) {
			System.out.printf("%d+", i);
			sum += i;
		}
		System.out.printf("=%d", sum);
	}

}
