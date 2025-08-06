package set3;

import java.util.Scanner;

public class ContainsDomainMailIdOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String sub="@spendflo.com";
		
		if(a.endsWith(sub))
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}

	}

}
