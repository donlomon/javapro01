package days06_my;

public class Ex07_02 {

	public static void main(String[] args) {
		for (int i = 0, linenum = 1; i < 256; i++) {
			if ( i % 10 == 0 ) {
				System.out.printf("%d: ", linenum++);
			}
			System.out.printf("['%s'] ", (char)i);
			if ( i % 10 == 9 ) {
				System.out.println("");
			}
		}

	}

}
