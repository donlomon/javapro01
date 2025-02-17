package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05_02 {

	public static void main(String[] args) throws IOException {
		byte score;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("점수 입력: ");
		
		score = Byte.parseByte(br.readLine());
		
		System.out.printf("국어=%s\n", score);
	}
}
