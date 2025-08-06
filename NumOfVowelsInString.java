package set2;

import java.util.Scanner;

public class NumOfVowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String a=sc.nextLine();
		int result=countOfVowels(a);
		System.out.println(result);

	}

	private static int countOfVowels(String a) {
		// TODO Auto-generated method stub
		int c=0;
		String b=a.trim().toLowerCase();
		for(char ch:b.toCharArray())
		{
			if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				c++;
			}
		}
		return c;
	}

}
