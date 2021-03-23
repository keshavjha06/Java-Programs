package javacoreprograms;

public class Prob3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k*3);
				System.out.print("\t");//\t is for space
				k++;
			}
			System.out.println();
		}

	}

}
