package javacoreprograms;

/* /"Hello"/
 /'Hello'/
 "Hello"
 I love "java" and "programming" and "movies"
 'I love "java" and "programming" and "movies"'*/

public class StringQuotes {

	public static void main(String[] args) {
		System.out.println("/\"Hello\"/");
		System.out.println("/'Hello'/");
		System.out.println("\"/'Hello'/\"");

		System.out.println("\"Hello\"");
		System.out.println("I love \"Java\" and \"programming\" and \"movies\"");
		System.out.println("'I love \"Java\" and \"programming\" and \"movies\"'");
		System.out.println(getXpath("Keshav"));
		System.out.println(getXpath("Java"));
		System.out.println(getXpath("123"));

	}
	
		public static String getXpath(String name) {
			String xpath= "//input[@id='"+name+"']";
					//input[@id='naveen']
			return xpath;
		}
		
	}


