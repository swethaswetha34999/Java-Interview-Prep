package basicMode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharacInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String a=s.replaceAll(" ", ""); // if u dont want to count the sapace
		
		Map<Character,Integer> freq=new HashMap<>();
		
		for(char c:a.toCharArray())
		{
			freq.put(c, freq.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry:freq.entrySet())
		{
			System.out.println(entry.getKey() +" - "+entry.getValue());
		}

	}

}
