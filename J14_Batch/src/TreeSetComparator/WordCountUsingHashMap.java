package sample;

import java.util.HashMap;

public class WordCountUsingHashMap {

	public static void main(String[] args) {
		String str="India is my country India is beautiful country";
		String words[]=str.split(" ");
		//String words[]=input.split(" ");
		
		HashMap<String,Integer> wordmap=new HashMap<>();
		
		for(String word:words)
		{
			if(!wordmap.containsKey(word))
			{
				wordmap.put(word, 1);
			}
			else
			{
				int oldvalue=wordmap.get(word);
				wordmap.put(word, oldvalue+1);
			}
		}
		System.out.println(wordmap);
	}
}
