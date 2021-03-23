package javacoreprograms;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5}; //n-5  n-1=4
		int sum=0;
		
		for(int i=0;i<=a.length-1;i++)  //a.length=5
		{
			sum=sum+a[i];
		}
		
		//Enhanced for loop
//		for(int value:a)
//		{
//			sum= sum+value;
//		}
		
		
		System.out.println("sum of Array elements is "+sum);

	}

}
