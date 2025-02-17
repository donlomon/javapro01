package days07;

import java.io.IOException;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) throws IOException {
		int com, user;
		Scanner scanner = new Scanner(System.in);
		char con = 'y';
		int win=0, lose=0;
		
		do {
			com = (int) (Math.random() * 3) + 1;

			System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
			user = scanner.nextInt();
			
			switch (com) {
			case 1:
				
				break;

			default:
				break;
			} //switch

			System.out.printf("> com=%d, user=%d\n", com, user);

			// 승자 판단해서 출력...
			switch (user - com) {
			case 0:
				System.out.println("무승부");
				break;
			case 1:
			case -2:
				System.out.println("사용자 승리");
				win++;
				break;
			case -1:
			case 2:
				System.out.println("컴퓨터 승리");
				lose++;
				break;
			} // switch
			System.out.printf("승률 %d : %d\n", win, lose);
			if (win == 3) {
				System.out.printf("사용자 최종 승리");
			}
			System.out.printf("\n게임 계속합니까?");
			con = (char) System.in.read();
		} while (con=='y'||con=='Y');
	}
}
