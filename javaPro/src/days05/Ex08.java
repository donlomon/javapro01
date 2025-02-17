package days05;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int user, com;
		
		System.out.printf("가위(1) 바위(2) 보(3) 입력: ");
		user = sc.nextInt();
		
		com = (int) (Math.random() * 3 + 1);
		System.out.printf("컴퓨터: %d\n", com);
		
		switch (user) {
		case 1:
			switch (com) {
			case 1:
				System.out.println("비김");
				break;
			case 2:
				System.out.println("패배");
				break;
			case 3:
				System.out.println("승리");
				break;
			} //switch
			break;
			
		case 2:
			switch (com) {
			case 1:
				System.out.println("승리");
				break;
			case 2:
				System.out.println("비김");
				break;
			case 3:
				System.out.println("패배");
				break;
			} //switch
			break;
			
		case 3:
			switch (com) {
			case 1:
				System.out.println("패배");
				break;
			case 2:
				System.out.println("승리");
				break;
			case 3:
				System.out.println("비김");
				break;
			} //switch
			break;

		default:
			System.out.println("[오류] 1~3 입력");
			break;
		} //switch
	}
}
