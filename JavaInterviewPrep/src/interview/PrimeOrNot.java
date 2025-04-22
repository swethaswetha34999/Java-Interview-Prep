package interview;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		if((num % 2==0) || (num % 3==0) || (num % 5==0)  || (num % 7==0))
		{
			System.out.println("Not a Prime Number");
		}
		else
		{
			System.out.println("Prime Number");
		}

	}

}
