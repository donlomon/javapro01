package days06_my;

public class tt01 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			System.out.printf("%d + ", i);
			sum += i;
		}
		System.out.printf("=%d", sum);
	}

}
