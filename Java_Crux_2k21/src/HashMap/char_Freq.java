package HashMap;

import java.util.HashMap;
import java.util.TreeMap;

public class char_Freq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabcbdefghjeifjkgjtjgb";
		
		TreeMap<Character, Integer> hs = new TreeMap<>();
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if(hs.containsKey(ch))
			{
				hs.put(ch, hs.get(ch)+1);
			}
			else
			{
				hs.put(ch, 1);
			}
		}
		System.out.println(hs);
		for(char key : hs.keySet())
		{
			System.out.println(key+" : "+hs.get(key));		}
		
	   }

}
