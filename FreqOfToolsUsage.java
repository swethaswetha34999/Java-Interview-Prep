package set3;

import java.util.LinkedHashMap;
import java.util.Map;

public class FreqOfToolsUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words= {"Slack", "Zoom", "Slack", "Jira", "Zoom", "Zoom"};
		
		Map<String, Integer> freq=new LinkedHashMap<>();
		
		for(String word : words)
		{
			freq.put(word, freq.getOrDefault(word, 0)+1);
		}
		
		for(Map.Entry<String, Integer> entry : freq.entrySet())
		{
			System.out.println(entry.getKey() +" - "+entry.getValue());
		}

	}

}
