package days07;

import java.util.Random;

public class tt04_02 {

	public static void main(String[] args) {
		
		new Random().ints(1, 46).distinct().limit(6).forEach(System.out::println);

	}

}
