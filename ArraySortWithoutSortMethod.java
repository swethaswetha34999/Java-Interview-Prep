package basicMode;

import java.util.Scanner;

public class ArraySortWithoutSortMethod {

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
		
		for(int i=0;i<s-1;i++)
		{
			for(int j=i+1;j<s;j++)
			{
				if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		
		for(int i=0;i<s;i++)
		{
			System.out.print(a[i] + " ");
		}

	}

}
