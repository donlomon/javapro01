package days06_my;

public class tt02 {

	public static void main(String[] args) {
		int i = 1, sum = 0;
		while ( i < 11 ) {
			System.out.printf("%d + ", i);
			sum += i;
			i++;
		}
		System.out.printf("=%d", sum);
	}

}
