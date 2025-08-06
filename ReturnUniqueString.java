package set3;

import java.util.LinkedHashSet;
import java.util.Set;

public class ReturnUniqueString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words= {"Slack", "Zoom", "Slack", "Jira", "Zoom"};
		
		
		Set<String> set=new LinkedHashSet<>();
		
		for(String word : words)
		{
			set.add(word);
		}
		
		System.out.println(set);

	}

}
