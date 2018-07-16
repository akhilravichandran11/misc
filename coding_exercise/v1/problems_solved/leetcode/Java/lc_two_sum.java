import java.util.HashMap;
import javax.swing.tree.*;

class Untitled {
	
	public static int calcTarget(int target,int cur)
	{
		int newTarget = target - cur;
		return newTarget;
	}
	
	public static int[] twoSum(int[] nums, int target) {
		
		HashMap<Integer,Integer> hMap = new HashMap<Integer,Integer>();
		for(int s =0;s<nums.length;s++)
		{
			int cur = nums[s];
			int nval = calcTarget(target, cur);
			if (hMap.containsKey(cur) && hMap.get(cur)!=s)
			{
				return new int[] {hMap.get(cur),s};
					
			}
			hMap.put(nval,s);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
	public static void main(String[] args) {
		
		
//		int[] nums = {-3,4,3,90};
//		int[] nums = {3,2,4};
		int[] nums = {0,4,3,0};
		int target = 0;
		
		int[] val = twoSum(nums,target);
		System.out.println(val[0]);
		System.out.println(val[1]);
	}
}