package interview;

import java.util.Scanner;

public class Vowel_Is_PresentOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.next();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == 'A' || s.charAt(i) == 'a' || s.charAt(i) == 'E' || s.charAt(i) == 'e' || s.charAt(i) == 'I' || s.charAt(i) == 'i' || s.charAt(i) == 'O' || s.charAt(i) == 'o' || s.charAt(i) == 'U' || s.charAt(i) == 'u' )
			{
				System.out.println("Vowel is Present "+s.charAt(i));
				break;
			}
			
			
		}
		

	}

}
