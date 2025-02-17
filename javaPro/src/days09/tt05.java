package days09;

public class tt05 {

	public static void main(String[] args) {
		int sum = 0, term = 1, inc = 1;

		while (inc <= 10) {
			sum += term;
			System.out.printf("%d+", term);
			term += inc++;
		} // while
		System.out.printf("=%d", sum);

	}

}
