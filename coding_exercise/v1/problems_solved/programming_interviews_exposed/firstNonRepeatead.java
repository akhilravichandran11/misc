import java.util.*;
class firstNonRepeatead{
	
	public static Character hashCheck_object(String str)
	{
		HashMap<Character,Object> charHash = new HashMap<Character,Object>();
		Object seenMultiple = new Object(),seenOnce = new Object();
		Object seen;
		
		for(int i = 0; i<str.length(); i++)
		{
			char cur_char = str.charAt(i);
			if(charHash.containsKey(cur_char))
			{
				charHash.put(cur_char, seenMultiple);
			}
			else
			{
				charHash.put(cur_char, seenOnce);
			}
		}
		
		for(int i=0; i<str.length(); i++)
		{
			char cur_char = str.charAt(i);
			seen = charHash.get(cur_char);
			if(seen ==  seenOnce)
			{
				return cur_char;
			}
		}
		
		return '~';
	}
	
	public static Character hashCheck(String str)
	{
		HashMap<Character,Integer> charHash = new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			char cur_char = str.charAt(i);
			if(charHash.containsKey(cur_char))
			{
				charHash.put(cur_char,charHash.get(cur_char)+1);
			}
			else
			{
				charHash.put(cur_char,1);
			}
		}
		
		for(int i=0;i<str.length();i++)
		{
			char cur_char = str.charAt(i);
			int val = charHash.get(cur_char);
			if(val==1)return cur_char;

		}
		
		return '~';
	}
	public static void main(String[] args) {
		String test = "teeater";
		char c = hashCheck_object(test);
		System.out.println(c);
	}
}