import java.util.*;
class SampleCollections {
	//do set
	
	public static void testArrayList()
	{
		List<String> al = new ArrayList<String>();
		List<String> ll = new LinkedList<String>();
		 StringBuilder sb;
		
		al.add("Dude 1");
		al.add("Dude 3");
		al.add("Dude 4");
		
		al.add(1,"Dude 2");
		al.add(4,"Dude 5");
		al.add(3,"Dude Remove");
		al.add(0,"Dude Remove");
		al.add(al.size(),"Dude Remove");
		
		
		System.out.println("At Index Of 4 = " + al.get(4));
		al.set(4,"Dude Remove 1");
		System.out.println("Now At Index Of 4 After Set = " + al.get(4));
		al.remove(4);
		System.out.println("Now At Index Of 4 After Delete = " + al.get(4));
		System.out.println("First Index Of = " + al.indexOf("Dude Remove"));
		System.out.println("Last Index Of = " + al.lastIndexOf("Dude Remove"));
		
		System.out.println(" All ArrayList Elements");
		System.out.println("\t" + al);
		
		System.out.println(" Sub List Of ArrayList Elements");
		System.out.println("\t" + al.subList(0,2));
		
		System.out.println("Iterated Elements");
		Iterator it = al.listIterator();
//		Iterator it = al.listIterator(2);
		sb = new StringBuilder();
		while(it.hasNext())
		{
			String cur_string = (String) it.next();
			sb.append(cur_string + ",");
			
		}
		System.out.println(sb);
		sb = new StringBuilder();
		
		for( String cur_string : al)
		{
			sb.append(cur_string + ",");
		}
				System.out.println(sb);
		
	}
	
	public static void testHashMap()
	{
		
		HashMap<Character,Integer>  hash_map = new HashMap<Character,Integer>();
		
		String str  = "Dude Check";
		
		if(hash_map.isEmpty())
		{
			hash_map.put('x',1);
		}
		
		for(int i=0; i<str.length();i++ )
		{
			int cur_char_count = 0;
			char cur_char = Character.toLowerCase(str.charAt(i));
			if(hash_map.containsKey(cur_char))
			{
				cur_char_count = hash_map.get(cur_char);
			}
			
			hash_map.put(cur_char,cur_char_count + 1);
			
			if(hash_map.containsValue(cur_char_count + 1))
			{
				hash_map.put('x',hash_map.get('x') + 1);
			}
			
		}
		
		Iterator it = hash_map.entrySet().iterator();
		
		while(it.hasNext())
		{
			Map.Entry<Character,Integer> pair = (Map.Entry)it.next();
			System.out.println("Key = "+pair.getKey()+" | Value = " + pair.getValue());
		}
		
		for(Map.Entry<Character,Integer> pair : hash_map.entrySet())
		{
			System.out.println("Key = "+pair.getKey()+" | Value = " + pair.getValue());
		}
		
		for(char cur_char : hash_map.keySet())
		{
			System.out.println(" | Key = " + cur_char);
		}
		
		for(int cur_int : hash_map.values())
		{
			System.out.println(" | Value = " + cur_int);
		}
		
		
	}
	
	public static void testMinHeap()
	{
		int[] array_int = {5,1,1,3,2,6};
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for( int i : array_int)
		{
			pq.add(i);
		}
		
		System.out.println("Min Heap Printed Order = "+ pq);
		StringBuilder sb = new StringBuilder();
		
		while(!pq.isEmpty()){
			int cur = pq.poll();
			sb.append(cur+",");
		}
		System.out.println("Min Heap Removed Order = "+ sb.toString());
	}
	
	public static void testMaxHeap()
	{
		int[] array_int = {5,1,1,3,2,6};
		PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
		
		for( int i : array_int)
		{
			pq.add(i);
		}
		
		System.out.println("Max Heap Printed Order = "+ pq);
		StringBuilder sb = new StringBuilder();
		
		while(!pq.isEmpty()){
			int cur = pq.poll();
			sb.append(cur+",");
		}
		System.out.println("Max Heap Removed Order = "+ sb.toString());
	}
	
	public static void testQueue()
	{
		int[] array_int = {5,1,1,3,2,6};
//		Queue<Integer> q1 = new PriorityQueue<Integer>();
		Queue<Integer> q1 = new LinkedList<Integer>();
		
		for( int i : array_int)
		{
			q1.add(i);
		}
		System.out.println("Queue 1 = " + q1);
		int firstElement = q1.element();
		System.out.println("firstElement = "+firstElement);
		System.out.println("Queue 1 = " + q1);
		int removed_firstElement = q1.remove();
		System.out.println("Queue 1 = " + q1);

		
	}
	
	public static void testDeQueue()
		{
			int[] array_int = {5,1,1,3,2,6};
	//		Deque<Integer> dq1 = new LinkedList<Integer>();
			Deque<Integer> dq1 = new ArrayDeque<Integer>();
			
			for( int i : array_int)
			{
				dq1.add(i);
			}
			dq1.addFirst(100);
			dq1.addLast(1000);
			System.out.println("DeQueue 1 = " + dq1);
			int firstElement = dq1.element();
			firstElement = dq1.getFirst();
			int lastElement = dq1.getLast();
			System.out.println("firstElement = "+firstElement);
			System.out.println("LastElement = "+firstElement);
			System.out.println("DeQueue 1 = " + dq1);
			int removed_firstElement = dq1.remove();
			removed_firstElement = dq1.removeFirst();
			int removed_lastElement = dq1.removeLast();
			System.out.println("DeQueue 1 = " + dq1);

			
		}
		
		public static void testSet()
		{
			int[] array_int = {5,1,1,3,2,6};
//			Set<Integer> set = new HashSet<Integer>(); //Maintains no Order
//			Set<Integer> set = new LinkedHashSet<Integer>(); // Maintains Order
//			Set<Integer> set = new TreeSet<Integer>(); //Maintains tree sorted order

			
		}
		
		public static void testStack()
				{
					int[] array_int = {5,1,1,3,2,6};
		//			Stack<Integer> stack = new Stack<Integer>();
					
				}
	
	public static void main(String[] args) {
//		testHashMap();
//		testArrayList();
//		testMinHeap();
//		testMaxHeap();
//		testQueue();
		testDeQueue();
	}
}