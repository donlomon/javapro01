package days07;

import java.util.Arrays;

public class tt04 {

	public static void main(String[] args) {
		int index = 0, n;
		int [] lotto = new int[6];
		lotto[index++] = (int) (Math.random() * 45) + 1;

		while ( index <= 5 ) {
				n = (int) (Math.random() * 45) + 1;
				boolean flag = false;
				for (int i = 0; i < index; i++) {
						if( lotto[i] == n ) {
								System.out.println("*");
								flag = true;
								break;
						}
				} // for i	
				if( !flag ) lotto[index++] = n;
		} // while
		System.out.println( Arrays.toString(lotto) );

	}

}
