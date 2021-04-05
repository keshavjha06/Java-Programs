package javacoreprograms;

public class PrintWithoutSemicolon {

	public static void main(String[] args) {
		// printf generate formatted string
		if (System.out.printf("Hello World" + "\n") == null) {

		}

		// 2

		if (System.out.append("Hello World" + "\n") == null) {

		}

		// 3
		if (System.out.append("Hello World" + "\n").equals(null)) {

		}
		//4
		for(int i=0; i<1; System.out.println("Hello World")) {
			i++;
		}

	}

}
