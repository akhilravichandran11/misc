import java.util.*;
class Denominations2 {
	
	public static void denominationsPossible(int[] array,int n)
	{
		
		int[] count = new int[n+1];
		Arrays.fill(count,0);
		count[0] = 1;
		for(int i = 0;i<array.length;i++)
		{
			int current_value = array[i];
			System.out.println(current_value);
			for(int j=1;j<=current_value;j++)
			{
				int find_diff = current_value - j;
				System.out.println("\t"+"Find_Diff = "+find_diff);
				count[current_value] += count[find_diff];
			}
		}
		
		System.out.println(Arrays.toString(count));
		
	}
	
	public static void main(String[] args) {
		int[] array = {1,2,3};
		int n = 3;
		denominationsPossible(array,n);
		
	}
}