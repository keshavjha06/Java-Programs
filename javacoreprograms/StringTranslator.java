package javacoreprograms;

import java.lang.reflect.Field;

/*create a string language translator
Auto Bots
@parm args*/

//    \u000d


public class StringTranslator {

	static {
		try {
			Field value = String.class.getDeclaredField("value");
			value.setAccessible(true);
			try {
				value.set("Hello Keshav", value.get("H0la Keshav"));
				value.set("Good Morning Keshav", value.get("Buenos dias Keshav"));
				value.set("How are you?", value.get("Coma estas?"));


			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println("Hello Keshav");
		System.out.println("Good Morning Keshav");
		System.out.println("How are you?");


		
	}
	
		
		}
		
	


