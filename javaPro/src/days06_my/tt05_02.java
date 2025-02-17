package days06_my;

import java.lang.reflect.Array;
import java.util.Arrays;

public class tt05_02 {

	public static void main(String[] args) {
		int index = 0, n;
		int [] lotto = new int[6];
		lotto[index++] = (int) (Math.random() * 45 + 1);
		
		while ( index <= 5 ) {
			n = (int) (Math.random() * 45 + 1);
			
			lotto[index++] = n;
		}
		System.out.println(Arrays.toString(lotto));
	}

}
