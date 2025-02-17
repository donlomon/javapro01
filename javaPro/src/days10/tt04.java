package days10;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class tt04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String rrn = getRrn(scanner);
		System.out.println(rrn);

		int age = getAmericanAge(rrn);
		System.out.println(age);
	} // main

	private static int getAmericanAge(String rrn) {
		int americanAge = getCountingAge(rrn) - 1;

		int birthMD = Integer.parseInt(rrn.substring(2, 6));
		Date d = new Date();
		int currMD = (d.getMonth() + 1) * 100 + d.getDate();
		if (birthMD > currMD)
			americanAge--;
		return americanAge;
	}

	private static int getCountingAge(String rrn) {
		LocalDate d = LocalDate.now();
		int currentYear = d.getYear();

		int birthYear = getYear(rrn);

		return currentYear - birthYear + 1;
	}

	private static int getYear(String rrn) {
		int year = getCentury(rrn) + Integer.parseInt(rrn.substring(0, 2));
		return year;
	}

	private static int getCentury(String rrn) {
		char gender = rrn.charAt(7);
		switch (gender) {
		case '9':
		case '0':
			return 1800;
		case '1':
		case '2':
		case '5':
		case '6':
			return 1900;
		default:
			return 2000;
		} // switch
	}

	private static String getRrn(Scanner scanner) {
		String regex = "\\d{6}-\\d{7}";
		String rrn;

		do {
			System.out.print("> 주민등록번호 14자리 입력( 예: 000000-000000) ? ");
			rrn = scanner.next();
		} while (!rrn.matches(regex));

		return rrn;
	}
}
