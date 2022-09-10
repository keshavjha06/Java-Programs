package javaprograms.Strings;

public class ReverseFirstAndLastCharinString {

	public static void main(String[] args) {
		
		String s = "Hello";
		/*String s1="";
		char first,last;
		first = s.charAt(0);
	    last = s.charAt(s.length()-1);
	    for(int i=1;i<s.length()-1;i++)
	    {
	    	s1 = s1+s.charAt(i);
	    	System.out.println(last+s1+first);
	    }*/
		
		
		int len = s.length();
		
		String newStr= s.charAt(len-1)+s.substring(1,len-1)+s.charAt(0);
		
		System.out.println(newStr);
	}
	
	

}
