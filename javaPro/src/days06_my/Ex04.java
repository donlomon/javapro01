package days06_my;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		int sum = 0, n, i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 입력: ");
		n = sc.nextInt();
		
		while ( i <= n ) {
			System.out.printf("%d+", i);
			sum += i++;
		}
		System.out.printf("=%d", sum);
	}

}
