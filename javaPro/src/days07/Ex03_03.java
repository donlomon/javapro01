package days07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex03_03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		byte kor, eng, mat;
		short tot;
		double avg;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String data = "";
		String regex = "\\s*,\\s*";
		String [] names = data.split(regex);
		
		
		System.out.print("국어 점수 입력: ");
		kor = Byte.parseByte(br.readLine());
		
		System.out.print("영어 점수 입력: ");
		eng = Byte.parseByte(br.readLine());
		
		System.out.print("수학 점수 입력: ");
		mat = Byte.parseByte(br.readLine());
		
		tot = (short) (kor + eng + mat);
		
		avg = (double) tot / 3;
		
		System.out.printf("국어=%d 영어=%d 수학=%d 총점=%d 평균=%f", kor, eng, mat, tot, avg);
		
	}

}
