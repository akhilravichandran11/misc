import java.util.*;
class Untitled {
	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		backtrack(list, new ArrayList<>(), nums, 0);
		return list;
	}

	public static void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
		System.out.println("Start | start_val = "+ start +" | List = " + list + " | templist = " + tempList);
		list.add(new ArrayList<>(tempList));
		for(int i = start; i < nums.length; i++){
			System.out.println("\tBefore Add | start_val = "+ start +" | i = "+ i +" | List = " + list + " | templist = " + tempList);
			tempList.add(nums[i]);
			System.out.println("\tAfter Add | start_val = "+ start +"  | i = "+ i +" | List = " + list + " | templist = " + tempList);
			backtrack(list, tempList, nums, i + 1);
			System.out.println("\tBefore Remove | start_val = "+ start +" | i = "+ i +" | List = " + list + " | templist = " + tempList);
			tempList.remove(tempList.size() - 1);
			System.out.println("\tAfter Remove | start_val = "+ start +" | i = "+ i +" | List = " + list + " | templist = " + tempList);
		}
		System.out.println("End | start_val = "+ start+" | List = " + list + " | templist = " + tempList);
	}
	public static void main(String[] args) {
		
		int[] nums = {1,2,3};
		System.out.println(subsets(nums));
	}
}