package javacoreprograms;

public class DivideByZero {

	public static void main(String[] args) {

		System.out.println(9.0 / 0);
		System.out.println(12.33f / 0);
		System.out.println(10 / 0.0);
		System.out.println(10.99999999d / 0);
		// System.out.println(0/0); arithmetic exception
		// System.out.println(2/0); arithmetic exception
		System.out.println(Math.sqrt(-1));

		System.out.println(0.0 / 0);
		System.out.println(0.0 / 0.0);
		System.out.println(12.33 / 0.0);
		System.out.println(Float.NaN == Float.NaN);
		System.out.println(Float.NaN != Float.NaN);


	}

}
