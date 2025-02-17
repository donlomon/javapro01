package days06_my;

public class Ex03 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if( i % 2 == 0 ) continue;
			System.out.printf("%d+", i);
			sum += i;
		}
		System.out.printf("=%d\n", sum);
	}

}
