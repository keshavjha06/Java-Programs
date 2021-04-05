package javacoreprograms;

public class StaticBlockFinalVariable {

	public static void main(String[] args) {
		System.out.println(Main.x);

	}
}

class Main {
	public static  final int x = 100;

	static {
		System.out.println("Main -- class static block...");
	}
}
