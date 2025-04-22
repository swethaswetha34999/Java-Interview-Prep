package interview;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		int n1=0;
		int n2=1;
	
		
		System.out.println(n1);
		System.out.println(n2);
		
		for(int i=0 ;i<num-2; i++)
		{
			int n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
		}
		
	}

}
