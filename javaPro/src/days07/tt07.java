package days07;

import java.util.Scanner;

public class tt07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char one = ' ';
		System.out.print("> 한 문자 입력 ? ");

		one = scanner.next().charAt(0);

		System.out.printf("[%c]\n", one);

	}

}
