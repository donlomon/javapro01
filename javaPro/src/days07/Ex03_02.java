package days07;

public class Ex03_02 {

	public static void main(String[] args) {
		String data = "김도훈  ,  이창익  ,   홍길동";
		String regex = ",";
		String [] names = data.split(regex);
		
		for (String name : names) {
			System.out.printf("%s\n", name.trim());
			
		}
	}

}
