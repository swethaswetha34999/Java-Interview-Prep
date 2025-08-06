package basicMode;

import java.util.Arrays;
import java.util.Scanner;

public class StringPalindrom {
//Write a function to check if a string is a palindrome (reads the same forwards and backwards, ignoring case and spaces).
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String a=s.replaceAll(" ", "").toLowerCase();
		String b="";
		

		for(int i=a.length()-1;i>=0;i--)
		{
			
				b=b+a.charAt(i);
			
		}
		
		
		
		if(b.equals(a))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not a Palindrome");

		}
		
		
		
		
		
		
		

	}

}
