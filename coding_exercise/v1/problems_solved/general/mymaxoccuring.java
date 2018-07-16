/* package whatever; // don't place package name! */

import java.io.*;
import java.util.*;

class myCode
{
	public static char checkMaxOccur(String str)
	{
		int max_occur = Integer.MIN_VALUE;
		char char_max_occur='`';
		
		HashMap<Character,Integer> char_count = new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			char cur_char = str.charAt(i);
			
			if(char_count.containsKey(cur_char))
			{
				char_count.put(cur_char,char_count.get(cur_char)+1);
			}
			else
			{
			   char_count.put(cur_char,1); 
			}
			
			max_occur= Math.max(max_occur,char_count.get(cur_char));
		}
		
		Iterator it = char_count.entrySet().iterator();
		
		while(it.hasNext())
		{
			Map.Entry<Character,Integer> pair = (Map.Entry)it.next();
			if (pair.getValue() == max_occur)
			{
				char_max_occur = pair.getKey();
			}
		}
		
		return char_max_occur;
		
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("Hello Java");
		char max_occur = checkMaxOccur("Dude eeeeeDddd");
		System.out.println(max_occur);

	}
}