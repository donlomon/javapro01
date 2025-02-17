package days09;

import java.util.Scanner;

public class tt01 {

	public static void main(String[] args) {

		int year;
		Scanner scanner = new Scanner(System.in);
		year = getYear(scanner);

		if (isLeapYear(year)) {
			System.out.println("윤년(leap year)");
		} else {
			System.out.println("평년(common year)");
		} // if

	} // main

	public static boolean isLeapYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

	private static int getYear(Scanner scanner) {

		String regex = "\\d+"; //
		String strYear;
		do {
			System.out.print("> 년도 입력 ? ");
			strYear = scanner.next();
		} while (!strYear.matches(regex));

		return Integer.parseInt(strYear);
	}
}
