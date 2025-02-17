package days07;

import java.util.Arrays;

public class tt06 {

	public static void main(String[] args) {
		int [] m;
		m = new int[10];

		for (int i = 0; i < m.length; i++) {
				m[i] = (int)(Math.random()*101);
		}
		System.out.println( Arrays.toString(m) );

		int max;
		max = m[0];

		for (int i = 1; i < m.length; i++) {
				max = Math.max(max, m[i]);
		} // for
		System.out.println( max );
	}

}
