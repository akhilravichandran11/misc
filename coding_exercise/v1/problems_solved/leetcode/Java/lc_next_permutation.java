class Solution {
	public static void nextPermutation(int[] nums) {
		
		int i = nums.length - 2;
		
		while(i>=0 && ( nums[i] >= nums[i+1] ))
		{
			i--;
		}
		
		if(i>=0)
		{
			int j = nums.length - 1;
			while(j>0 && (nums[i] >= nums[j]) )
			{
				j--;
			}
			
			swap(nums,i,j);
			
		}
		reverse(nums,i+1);
	}
	
	public static void swap(int[] nums,int i, int j)
	{
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp; 
	}
	
	public static void reverse(int[] nums, int start)
	{
		int end = nums.length - 1;
		for(;start<end;start++,end--)
		{
			swap(nums,start,end);
		}
	}
	
	private static void printArray(int[] anArray) {
		for (int i = 0; i < anArray.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(anArray[i]);
		}
	}
	
	public static void main(String[] args)
	{
		int[] nums = {3,2,1};
		nextPermutation(nums);
		printArray(nums);
		
	}
}