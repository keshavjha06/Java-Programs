package javacoreprograms;

public class ReverseEachWordInString {

	public static void main(String[] args) {

		String str = "Welcome to Java";
		String[] words =str.split(" ");
		String reverseWord = "";
		for(String w:words)
		{
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseWord = reverseWord+sb.toString()+" ";
		}
		System.out.println(reverseWord);
        

}
}

