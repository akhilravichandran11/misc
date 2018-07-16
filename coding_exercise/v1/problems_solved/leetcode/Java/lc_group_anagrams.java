import java.util.*;
import java.util.Arrays;
class GroupAnagrams {
	public static void main(String[] args) {
		List<String> d = new ArrayList<String>();
		HashMap<String,List<String>> hmap = new HashMap<String,List<String>>();
		d.add("cat");
		d.add("tac");
		d.add("atc");
		d.add("zzz");		
		d.add("azz");	
		d.add("zaz");		
		d.add("aaaa");
		
		for(String cur_string : d)
		{
			char[] cur_string_chars = cur_string.toCharArray();
			
			Arrays.sort(cur_string_chars);
			
			String cur_sorted_string = new String(cur_string_chars);
			
			if(hmap.containsKey(cur_sorted_string))
			{
				List<String> cur_list = hmap.get(cur_sorted_string);
				
				cur_list.add(cur_string);
				
				hmap.put(cur_sorted_string, cur_list);
			}
			else 
			{
				List<String> cur_list = new ArrayList<String>();
				
				cur_list.add(cur_string);
				
				hmap.put(cur_sorted_string, cur_list);
				
			}
			
			
		}
		

		for(List<String> hmap_value : hmap.values())
		{
			System.out.println(hmap_value);
		}

	}
}