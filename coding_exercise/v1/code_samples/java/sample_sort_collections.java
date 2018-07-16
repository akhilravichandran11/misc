import java.util.*;
import java.util.Arrays;
class SampleSortCollections {
	
	public static class Interval {
		 	int start;
		   	int end;
		  	Interval() { start = 0; end = 0; }
		    Interval(int s, int e) { start = s; end = e; }
		
			public String toString()
			{
				return String.format("{" + start + "," + end + "}");
			}
		  }
	
	public static void sort_objects()
	{
		int[][] array_intervals = {{1,3},{15,18},{8,10},{2,6},};
		List<Interval> list_intervals = new ArrayList<Interval>();
		
		for(int[] array_interval : array_intervals)
		{
//			Interval new_interval = new SampleSortCollections().new Interval(array_interval[0],array_interval[1]);
			Interval new_interval = new Interval(array_interval[0],array_interval[1]);

			list_intervals.add(new_interval);
		}
		
		System.out.println("Given Intervals = " + list_intervals);
		
		Collections.sort(list_intervals, new Comparator<Interval>(){
			@Override
			public int compare(Interval i1,Interval i2)
			{
				return Integer.compare(i1.start,i2.start);
			}
		});
		
		System.out.println("Sorted Intervals = " + list_intervals);
		
	}
	public static void sort_collections()
	{
		int[] array_int = {5,1,1,3,2,6};
		List<Integer> list_int= new ArrayList<Integer>();
		
		for(int i : array_int)
		{
			list_int.add(i);
		}
		
		System.out.println("Unsorted Int Collection = " + list_int);
		
		Collections.sort(list_int , new Comparator<Integer>(){
			
			@Override
			public int compare(Integer i1,Integer i2)
			{
				// 0 if x is equals to y
				// less than 0 if x is less than y
				// greater than 0 if x is greater than y
				return Integer.compare(i2,i1);
			}
		});
		
		System.out.println("Sorted Int Collection = " + list_int);
	}

	public static void sort_arrays()
	{
		int[] ai = {5,1,3,2,6};
		Integer[] ai_2 = ArrayUtils.toObject(ai);
		System.out.println("Unsorted Array = " + Arrays.toString(ai));
		Arrays.sort(ai);// In Asc Order
		System.out.println("Sorted Array = " + Arrays.toString(ai));
		System.out.println("Sorted Array 2 = " + Arrays.toString(ai));
		
	}
	public static void main(String[] args) {
//		sort_arrays();
//		sort_collections();
		sort_objects();
		
	}
}