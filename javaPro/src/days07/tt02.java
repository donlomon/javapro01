package days07;

import java.util.Arrays;

public class tt02 {

	public static void main(String[] args) {
		String name = "hello world";
		char [] msgArr = name.toCharArray();
		System.out.println( Arrays.toString(msgArr) );
		
		String name2 = null;
		name2 = String.valueOf(msgArr);
		System.out.println( name2 );

	}

}
