package days07;

public class Ex01 {

	public static void main(String[] args) {
		boolean sw = false;
		int sum = 0;
		for (int i = 1; i <= 8; i++) {
			System.out.printf( (sw ? "+" : "-") + "%d/%d ", i, i+1);
			sw = !sw;
			sum += i / (i+1);
		}
		System.out.printf("\b=%d\n", sum);  // \b는 앞의 문자를 하나 지움

	}

}
