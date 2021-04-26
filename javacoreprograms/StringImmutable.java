package javacoreprograms;

public class StringImmutable {

	public static void main(String[] args) {
		
		 // String SCP Immutable 
		 String str1 = "Keshav"; 
		 str1.concat("Jha"); 
		 System.out.println(str1); 
		  
		 // String object Immutable 
		 String str4 = new String("Hello"); 
		 str4.concat("World"); 
		 System.out.println(str4); 
		  
		 // StringBuffer Mutable 
		 StringBuffer str2 = new StringBuffer("Keshav");  
		 str2.append("Jha"); 
		 System.out.println(str2); 
		 
		 // StringBuilder Mutable 
		 StringBuilder str3 = new StringBuilder("Keshav");  
		 str3.append("Jha"); 
		 System.out.println(str3); 

		
	}

}
