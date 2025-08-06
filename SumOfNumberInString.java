package set2;

import java.util.Scanner;

public class SumOfNumberInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string : ");
		String a=sc.nextLine();
		int result=sumOfInt(a);
		System.out.println(result);

	}

	private static int sumOfInt(String a) {
		// TODO Auto-generated method stub
		String num="";
		int sum=0;
		for(char ch:a.toCharArray())
		{
			if(Character.isDigit(ch))
			{
				num=num+ch;
			}
			
			
			
			else
			{
				if(!num.isEmpty())
				{
				sum=sum+Integer.parseInt(num);
				num="";
				}
			}	
		}
		if(!num.isEmpty())
		{
		sum=sum+Integer.parseInt(num);
		num="";
		}
		
		return sum;
	}

}
