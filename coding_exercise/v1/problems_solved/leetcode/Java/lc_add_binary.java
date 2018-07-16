import java.util.*;
class Untitled {
	
	public static ArrayList<Integer> addBinary(String[] s_nums)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		int s_nums_count = s_nums.length;
		Integer[] s_nums_size = new Integer[s_nums_count];
		int max_length = -1;
		for(int i = 0; i<s_nums.length ; i++ )
		{
			max_length = Math.max(max_length,s_nums[i].length());
			s_nums_size[i] = s_nums[i].length() - 1;
		}
		int carry = 0;
		int num = 0;
		
		for(int i=0 ; i<max_length;i++)
		{
			int cur_sum = 0;
			for(int j=0; j<s_nums.length ; j++)
			{
				int index = s_nums_size[j];
				if(index >= 0)
				{
					int cur_int = s_nums[j].charAt(index) - '0';
					cur_sum += cur_int;
					s_nums_size[j]--;
				}
			}
			cur_sum = carry + cur_sum;
			carry = cur_sum/2;
			num = cur_sum%2;
			al.add(0,num);
		}
		
		while(carry>0)
		{
			num = carry%2;
			carry = carry/2;
			al.add(0,num);
		}
		
		return al;
			
	}
	public static void main(String[] args) {
	String[] s_nums = {"1000","100","10","1","1","10","100","1000"};
	int sum = 0;
	for(String i : s_nums)
	{
		sum += Integer.parseInt(i,2);
	}
	System.out.println("Decimal is  = "+sum+" | Binary is = "+ Integer.toBinaryString(sum));
	ArrayList<Integer> al = addBinary(s_nums);
	System.out.println(al);
	}
}