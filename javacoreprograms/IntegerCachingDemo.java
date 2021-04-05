package javacoreprograms;

public class IntegerCachingDemo {

	public static void main(String[] args) {

		//Compare two int numbers (Integer Caching)
		
		//-128 to 127 is the range for integer caching
		Integer num1 = 200;
	    Integer num2 = 200;
	    
	    if(num1==num2)
	    {
	    	System.out.println("Both are equal");
	    }
	    else
	    {
	    	System.out.println("Both are not equal");
	    }
	}

}
