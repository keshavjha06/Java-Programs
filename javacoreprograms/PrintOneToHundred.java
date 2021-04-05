package javacoreprograms;

public class PrintOneToHundred {

	public static void main(String[] args) {
//		for(int i=1;i<=100;i++) {
//			System.out.println(i);
//		}
		
		int one = 'A'/'A'; //1
		String s1 = "..........";
		
		for (int i= one ; i<=(s1.length() * s1.length()); i++) {
			System.out.println(i);
			
		}
		//2nd approach
		//a-97 b-98 c-99 d-100
		for(int i=one;i<='d';i++)
		{
			System.out.println(i);
		}

	}

}
