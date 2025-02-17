package days07;

import java.util.Scanner;

public class tt03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0, lineNumber = 1; i < 256; i++) {
			if (i % 7 == 0)
				System.out.printf("%d :", lineNumber);
			System.out.printf("[%c]", (char) i);
			if (i % 7 == 6) {
				System.out.println();
				if (lineNumber % 5 == 0) {
					System.out.println("\t 계속하려면 엔터치세요..");
					scanner.nextLine();
				} // if
				lineNumber++;
			} // if
		}

	}

}
