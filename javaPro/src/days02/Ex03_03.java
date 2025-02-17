package days02;

public class Ex03_03 {

	public static void main(String[] args) {
		String name = "김도훈";
		int age = 26;
		double tall = 190.9;
		
//		System.out.println("이름은 \""+name+"\"이고, "+"나이는 "+age+"살이고, "+"키는 "+tall+"이다.");
		System.out.printf("이름은 %s이고 나이는 %d살이고 키는 %f이다.", name, age, tall);
		System.out.printf("안녕하세요. %1$s입니다! %1$s입니다!", name);
	}

}
