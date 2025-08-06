package basicMode;


/* Print numbers from 1 to 20.

If the number is divisible by 3, print "Fizz".

If divisible by 5, print "Buzz".

If divisible by both, print "FizzBuzz". 1*/



public class FizzBuzzProblem {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		for(int i=1;i<=20;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println("FizzBuzz");
			}
			else if(i%3==0)
			{
				System.out.println("Fizz");
			}
			else if(i%5==0)
			{
				System.out.println("Buzz");
			}
			else
			{
				System.out.println(i);
			}
		}

	}

}
