import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
	public int search(int[] nums, int target) {
		int indx = find_rotate(nums,0,nums.length);
		int loc = -1;
		if (indx > 0)
		{
			if (arr[0]<= target && target <= arr[indx - 1])
			{
				loc = binary_search(nums,0,indx-1 ,target);
			}else{
				loc = binary_search(nums,indx,nums.length - 1,target);
			}
			
		}
		
		return loc;

	}
	
	public static int binary_search(int arr[],int st, int en , int find)
	{
	if(en>=st)
	{
		int mid = (st + en)/2;
		if(arr[mid] == find)
		{
			return mid;	
		}
		else if (arr[mid]>find)
		{
			return binary_search(arr,st,mid -1,find);
		}
		else{
			return binary_search(arr,mid+1,en,find);
		}

	}else {
		return -1;
	}
      
	}
	
	public static int find_rotate(int arr[],int st,int en)
	{
		if(en>st)
			{
				int mid = (st + en)/2;
				if( arr[mid] > arr[mid+1] )
				{
					return mid + 1;
				}else  if (arr[mid] > arr[en])
				{
					return find_rotate(arr,mid+1,en);
				}
				else{
					return find_rotate(arr,st,mid-1);
				}
			

			}else {
				return -1;
			}
		      
	}
	
	public static void main(String[] args) throws Exception{
		
		int arr[] = new int[] {4,5,6,7,8,9,0,1,2,3};
		
		int target = 2;
		int nums[] = arr;
		int indx = find_rotate(nums,0,nums.length);
		int loc = -1;
		if (indx > 0)
		{
			if (arr[0]<= target && target <= arr[indx - 1])
			{
				loc = binary_search(nums,0,indx-1 ,target);
			}else{
				loc = binary_search(nums,indx,nums.length - 1,target);
			}
			
		}
		System.out.println(loc);
		
	}
}