package interview;

import java.util.Scanner;

public class SwapWithoutThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num1");
		int num1=sc.nextInt();
		System.out.println("Enter a num2");
		int num2=sc.nextInt();
		
		System.out.println("Before Swapping");
		
		System.out.println("Number 1 : " + num1);
		System.out.println("Number 2 : " + num2);
		
		System.out.println("After Swapping");
		
		num1=num1+num2;  //5+3=8
		num2=num1-num2;		//8-3
		num1=num1-num2;		//8-5
		
		System.out.println("Number 1 : " + num1);
		System.out.println("Number 2 : " + num2);
		
		

	}

}
