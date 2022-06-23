package javacoreprograms;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicateElementsArray {

	public static void main(String[] args) {
		
		/*String a [] = {"java" , "python" , "C" , "Ruby" , "Java"};
		boolean flag= false;
		for (int i=0;i<a.length;i++)
		{
			for (int j= i+1;j<a.length;j++)
			{
				if(a[i]==a[j])

				{
					System.out.println("Duplicate element is " + a[i]);
					flag=true;
				}
			}
		}
		if(flag==false) {
			System.out.println("Duplicate element not found");
		}
		*/
		//2nd approach
		String arr [] = {"java" , "python" , "C" , "Ruby" , "java"};
		
		HashSet<String> langs = new HashSet<String>();
		/*System.out.println(a1.add("java"));
		System.out.println(a1.add("python"));
		System.out.println(a1.add("java"));*/
		
		boolean flag = false;
		for (String str:arr) 
		{
			if(langs.add(str)==false)
			{
			System.out.println("Duplicate element is " + str);
			flag= true;
		}
		}
		if(flag==false)
		{
			System.out.println("Duplicate element not found");
		}

		
	}
}
