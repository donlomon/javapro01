package days07;

import java.util.Scanner;

public class tt05 {

	public static void main(String[] args) {
		int n, m ;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 양의 정수( n m ) 입력 ? ");
		n = scanner.nextInt();
		m = scanner.nextInt();	

		int sum = 0;

		int min = Math.min(n, m);
		int max = Math.max(n, m);

		if( min % 2 == 1 ) min++;

		while( min <= max ) { 
				System.out.printf("%d+", min);
				sum += min;
				min += 2;
		}
		System.out.printf("\b=%d\n", sum);

	}

}
