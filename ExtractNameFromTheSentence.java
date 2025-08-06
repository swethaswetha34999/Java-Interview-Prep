package set3;

import java.util.ArrayList;
import java.util.List;

public class ExtractNameFromTheSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sen="We use Slack, Zoom, and Spendflo in our team.";
		List<String> list=extractToolsName(sen);
		System.out.print(list);
	}

	private static List<String> extractToolsName(String sen) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		sen=sen.replaceAll("[,.]", "");
		String[] words=sen.trim().split("\\s+");
		
		for(String word :words)
		{
			if(Character.isUpperCase(word.charAt(0)) && !word.equals("We"))
			{
				list.add(word);
			}
		}
		
		return list;
	}

}
