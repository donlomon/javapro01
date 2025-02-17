package days06_my;

public class Ex03_02 {

	public static void main(String[] args) {
		
		int sum = 0, i = 0;
		while ( i++ <= 10 ) {
			if ( i % 2 == 1 ) {
				System.out.printf("%d+", i);
				sum += i;
			} //if
		}
		System.out.printf("=%d", sum);

	}

}
