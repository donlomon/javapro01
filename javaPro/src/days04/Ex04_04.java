package days04;

import java.util.Scanner;

public class Ex04_04 {

	public static void main(String[] args) {
		String name;
		byte age = 0;
		double height = 0;
		boolean gender = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 나이 키 성별 입력:");
		name = sc.next();
		
		
		System.out.printf("이름:%s, 나이:%d살 키:%.2f 성별:%s\n",
				name, age, height, gender ? "남자" : "여자");
	}

}
