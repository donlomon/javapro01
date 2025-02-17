package days07;

public class Ex03 {

	public static void main(String[] args) {
		String data = "김도훈,이창익,홍길동";
		String regex = ",";
		String [] names = data.split(regex);
		
		System.out.println(names[1]);
	}

}
