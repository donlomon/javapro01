package days06_my;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		String name = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력: ");
		//name = sc.nextLine();
		name = sc.next();
		
		System.out.printf(name);
	}

}
