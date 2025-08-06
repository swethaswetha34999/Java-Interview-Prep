package basicMode;

import java.util.Scanner;

public class AddTwoIndex {
//You are given an array of integers. Return the two indices of the numbers that add up to a given target.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size : ");
		int s=sc.nextInt();
		int[] a=new int[s];
		System.out.println("Enter the elements");
		for(int i=0;i<s;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the target value : ");
		int t=sc.nextInt();
		
		for(int i=0;i<s-1;i++)
		{
			for(int j=i+1;j<s;j++)
			{
				if(a[i]+a[j] == t)
				{
					System.out.println(i+" , "+j);
				}
			}
		}
	}

}
