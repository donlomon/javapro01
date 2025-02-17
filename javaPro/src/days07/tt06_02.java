package days07;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class tt06_02 {

	public static void main(String[] args) {
		int [] m;
		m = new int[10];

		for (int i = 0; i < m.length; i++) {
				m[i] = (int)(Math.random()*101);
		}
		System.out.println( Arrays.toString(m) );

		OptionalInt max = IntStream.of(m).max();

		if (max.isPresent()) {
				System.out.println(max.getAsInt());
		}

	}

}
