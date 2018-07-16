import java.util.*;
class checkPermutation {
	
	public static String stringSort(String source)
	{
		char[] ca_source = source.toCharArray();
		Arrays.sort(ca_source);
		return new String(ca_source);
	}
	
	public static boolean sortCheck(String source,String target)
	{
		if(source.length() != target.length() )return false;
		return stringSort(source).equals(stringSort(target));
		
	}
	public static boolean hashCheck(String source,String target)
	{
		if(source.length() != target.length() )return false;
		int[] count = new int[128];
		
		for(char cur : source.toCharArray() )
		{
			count[cur]++;
		}
		for(char cur : target.toCharArray() )
		{
			count[cur]--;
			if(count[cur]<0)return false;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("Dude");
		boolean check_1 = hashCheck("dude2", "dude1");
		System.out.println(check_1);
		boolean check_2 = sortCheck("Dude1", "dude1");
		System.out.println(check_2);
	}
}