package days07;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		int[] m, m2;
		m = m2 = new int[10];

		for (int i = 0; i < m.length; i++) {
			m[i] = (int) (Math.random() * 101); // 0 <= <= 100
		}
		System.out.println(Arrays.toString(m));

		System.out.printf("정수 입력: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int min, a = 0;
		min = m[0];

		for (int i = 0; i < m.length; i++) {
			int diff = Math.abs( m[i]-n );
			m2[i] = diff;
		} // for
	}

}
