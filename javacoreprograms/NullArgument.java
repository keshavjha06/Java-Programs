package javacoreprograms;

public class NullArgument {

	// Pass null argument with method overloading with String and Object types

	public static void main(String[] args) {

		test(null);
	}

	public static void test(Object o) {
		System.out.println("Object Argument");
	}

	
	//String is child class of object,so preference will be given to mostly used one
	public static void test(String s) {
		System.out.println("String Argument");
	}

}
