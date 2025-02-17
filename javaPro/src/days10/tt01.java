package days10;

import java.util.Random;

public class tt01 {
	public static void main(String[] args) {
		String card = "7655-8988-9234-5677";

		String[] cardArr = card.split("-");

		Random rnd = new Random();

		int index = rnd.nextInt(4);
		int index2;

		do {
			index2 = rnd.nextInt(4);
		} while (index == index2);

		cardArr[index] = "****";
		cardArr[index2] = "****";

		String result = String.join("-", cardArr);
		System.out.println(result);
	} // main
}
