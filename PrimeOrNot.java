package basicMode;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int n=sc.nextInt();
		boolean isPrime=true;
		if(n<=1)
		{
			isPrime=false;
		}
		
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				isPrime=false;
				break;
			}
		}
		
		if(isPrime == true)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not a prime");
		}
		
		

	}

}
