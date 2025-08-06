package set2;

import java.util.LinkedHashMap;
import java.util.Map;

/*“Let’s say a company uses 5 SaaS tools with monthly costs: [30, 20, 50, 40, 60].
Write a function to calculate the total annual cost, and then apply a 10% discount if the total exceeds ₹5000.” */

public class SubscrptionCostProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cus=5;
		int[] cost= {30, 20, 50, 40, 60};
		int amount=0;
		int total=0;
		int discount=0;
		
		for(int i=0;i<5;i++)
		{
			amount = cost[i] *12;
			total=total+amount;
		}
		
		if(total>=5000)
		{
			discount=total*10 /100;
			System.out.println(discount);

		}
		else
		{
			System.out.println(total);
		}
		
		
	}

}
