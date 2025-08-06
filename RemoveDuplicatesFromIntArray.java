package set2;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicatesFromIntArray {
	public static void main(String args[])
	{	
	int[] a= {1,2,3,4,2,3,4,3,4,4};
	int s=a.length;
	
	Set<Integer> set=new LinkedHashSet<>();
	
	for(int i:a)
	{
		set.add(i);
	}
	
	System.out.println("After removing duplicate values :");
	
	for(int i:set)
	{
		System.out.print(i+" ");
	}
	
}}
