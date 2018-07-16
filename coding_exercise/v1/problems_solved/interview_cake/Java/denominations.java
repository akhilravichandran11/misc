import java.util.*;

class denominations {
	public static ArrayList<List<Integer>> countDenomination(int cost,int org_cost,int[] array,int index,ArrayList<List<Integer>> lists,String uuid)
	{
		if(cost == 0)return lists;
		if(index >= array.length) return new ArrayList<List<Integer>>();
		System.out.println("Bef - uuid = "+uuid+" | cost = "+cost+" | index = "+index+" | lists = "+lists);
		ArrayList<List<Integer>> new_lists =  new ArrayList<List<Integer>>();
		String new_uuid = UUID.randomUUID().toString().replaceAll("-", "").substring(0,4);
		
		if(cost - array[index] >= 0)
		{
			if(lists == null || lists.size() == 0)
			{
				List<Integer> list = new ArrayList<Integer>();
				list.add(array[index]);
				lists.add(list);
				
			}
			else 
			{
				for(List<Integer> list : lists)
				{
					list.add(array[index]);
				}
			}

			ArrayList<List<Integer>> cur_incl_excl=  new ArrayList<List<Integer>>(),cur_included =  new ArrayList<List<Integer>>();
			System.out.println("Aft - uuid = "+uuid+" | cost = "+cost+" | index = "+index+" | lists = "+lists);

			if(cost - array[index] > 0)
			{
				cur_included = countDenomination(cost-array[index],org_cost,array,index,lists,new_uuid);
				cur_incl_excl = countDenomination(cost-array[index],org_cost,array,index+1,lists,new_uuid);
			}
			
			System.out.println("\tRet Bef - uuid = "+uuid+" | cost = "+cost+" | index = "+index+" | lists = "+lists);
			
			if(cur_included.size()>0){
				new_lists.addAll(cur_included);
				System.out.println("\tRet Bef - uuid = "+uuid+" | cost = "+cost+" | index = "+index+" | cur_included = "+cur_included);
				}
			if(cur_incl_excl.size()>0){
				new_lists.addAll(cur_incl_excl);
				System.out.println("\tRet Bef - uuid = "+uuid+" | cost = "+cost+" | index = "+index+" | cur_incl_excl = "+cur_incl_excl);
				}

		

			System.out.println("\tRet Bef - uuid = "+uuid+" | cost = "+cost+" | index = "+index+" | new_lists = "+new_lists);
		}
		ArrayList<List<Integer>> cur_out=  new ArrayList<List<Integer>>(),cur_excluded =  new ArrayList<List<Integer>>();
		
		if(lists.size()>0)cur_out = countDenomination(cost,org_cost,array,index+1,lists,new_uuid);
		if(cost == org_cost)cur_excluded = countDenomination(cost,org_cost,array,index+1,new ArrayList<List<Integer>>(),new_uuid);
		
		if(cur_out.size()>0){
			new_lists.addAll(cur_out);
			System.out.println("\tRet Bef - uuid = "+uuid+" | cost = "+cost+" | index = "+index+" | cur_out = "+cur_out);
			}
		if(cur_excluded.size()>0){
			new_lists.addAll(cur_excluded);
			System.out.println("\tRet Bef - uuid = "+uuid+" | cost = "+cost+" | index = "+index+" | cur_excluded = "+cur_excluded);
			}
		System.out.println("\tRet Bef - uuid = "+uuid+" | cost = "+cost+" | index = "+index+" | new_lists = "+new_lists);
		return new_lists;
	}
	public static void main(String[] args) {
		int cost = 3;
		int[] array = {1,2};
		ArrayList<List<Integer>> lists = new ArrayList<List<Integer>>();
		String uuid = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 4);
		lists = countDenomination(cost,cost, array,0,lists,uuid);
		for(List<Integer> list : lists)
		{
			System.out.println(list);
		}
	}
}