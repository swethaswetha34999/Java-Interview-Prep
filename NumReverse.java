package basicMode;

import java.util.Scanner;

public class NumReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num : ");
		int n=sc.nextInt();
		String r="";
		int res=0;
		
		while(n!=0)
		{
			int d=n%10;
			r=r+d;
			n=n/10;
		}
		res=Integer.parseInt(r);
		
		System.out.println(res);

	}

}
