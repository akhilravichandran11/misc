import java.util.*;
class Untitled {
	public static void test_for_loops()
	{
		List<Integer> list_int = new ArrayList<Integer>();
		list_int.add(1);
		list_int.add(2);
		list_int.add(3);
		for(int i : list_int )
			System.out.print(i);
		int[] array_int = {4,5,6};
		
		System.out.println("");
		
		for(int i : array_int )
			System.out.print(i);
			
		System.out.println("");
		for(int i : new Integer[] {7,8,9} )
			System.out.print(i);
		
	}
	public static void main(String[] args) {
		test_for_loops();
	}
}