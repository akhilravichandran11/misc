import java.util.*;
import java.util.Arrays;
class MeetingRoom {
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
		
		public static String printIntervalsArray(List<Interval> intervals)
		{
			StringBuilder sb = new StringBuilder();
			for(Interval interval : intervals)
			{
				sb.append(interval.toString());
			}
			
			return sb.toString();
		}
		
		public static int minMeetingRooms(Interval[] intervals) {
			
			if(intervals == null || intervals.length == 0 ) return 0;
			
			List<Interval> list_intervals = new ArrayList<Interval>();
					
					for(Interval interval : intervals)
					{
						list_intervals.add(interval);
					}

			System.out.println("Before Sorting =  " + printIntervalsArray(list_intervals));
			
			Collections.sort(list_intervals,new Comparator<Interval>(){
				@Override
				public int compare(Interval i1,Interval i2)
				{
					return Integer.compare(i1.start,i2.start);
				}
			});
			
			System.out.println("After Sorting =  " + printIntervalsArray(list_intervals));
			
			
			int i=0;
			
			
			while(i<list_intervals.size() && i+1<list_intervals.size())
			{
				Interval inter_1 = list_intervals.get(i);
				Interval inter_2= list_intervals.get(i+1);
			
				if(inter_2.start>= inter_1.end)
				{
					inter_2.start = inter_1.start;
					list_intervals.remove(i);
				}
				else{
					i++;
				}
			}
			return list_intervals.size();
			
		}
	public static void main(String[] args) {
		
//		int[][] array_intervals = {{5,10},{15,20},{0,30}};
		int[][] array_intervals = {{9,10},{4,9},{4,17}};
		Interval[] intervals = new Interval[array_intervals.length];
		int i = 0;
		for(int[] array_interval : array_intervals)
				{
					Interval new_interval = new Interval(array_interval[0],array_interval[1]);

					intervals[i] = new_interval;
					i++;
				}
				
		System.out.println(minMeetingRooms(intervals));
				

		
	}
}