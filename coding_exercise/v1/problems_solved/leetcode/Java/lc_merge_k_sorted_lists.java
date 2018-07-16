import java.util.*;
class Node{
		int val;
		Node next;
		public Node()
		{
			this.val = Integer.MIN_VALUE;
			next = null;
			
		}
		public Node(int val)
		{
			this.val = val;
			next = null;
			
		}
		
		public Node createList(int[] arr)
		{
			Node header = new Node();
			Node prev = header;
			for(int i : arr)
			{
				Node cur = new Node(i);
				prev.next = cur;
				prev = cur;
			}
			
			return header.next;
		}
		
		public List<Node> createLists(int[][] arr)
		{
			List<Node> list = new ArrayList<Node>();
			
			for( int[] cur_arr : arr)
			{
				Node cur_header = createList(cur_arr);
				if(cur_header!=null)list.add(cur_header);
			}
			
			return list;
		}
	
	public String printList(Node list)
	{
		StringBuilder sb = new StringBuilder();
		while(list!=null)
		{
			sb.append(list.val+ " ");
			list = list.next;
		}
		
		return sb.toString();
	}
	
	public Node mergeTwoLists(Node list1,Node list2)
	{
		if(list1 == null) return list2;
		if(list2 == null) return list1;
		Node result = new Node();
		Node prev  = result;
		
		while(list1!=null && list2!=null)
		{
			if(list1.val<=list2.val)
			{
				prev.next = list1;
				prev = list1;
				list1 = list1.next;	
			}
			else {
				prev.next = list2;
				prev = list2;
				list2 = list2.next;	
			}
		}
		
		while(list1!=null)
		{
				prev.next = list1;
				prev = list1;
				list1 = list1.next;	

		}
		
		while(list2!=null)
		{
				prev.next = list2;
				prev = list2;
				list2 = list2.next;	

		}
		
		return result.next;
	}
	
	public Node mergeKLists_twoatatime(List<Node> lists)
	{
		if(lists.size() == 0) return null;
		if(lists.size() == 1) return lists.get(0);
		
		while(lists.size() >= 2)
		{
			Node list1 = lists.get(0); 
			Node list2 = lists.get(1);
			System.out.println("List 1 = " + printList(list1));
			System.out.println("List 2 = " + printList(list2));
			Node mergedList = mergeTwoLists(list1,list2);
			System.out.println("Merged List = " + printList(mergedList));
			lists.remove(0);
			lists.remove(0);
			lists.add(0,mergedList);
		}
		return lists.get(0);
	}
	
	

	public static void main(String[] args) {
		int[][] arr = { 
		{1, 3, 5, 7},
		{2, 4, 6, 8},
		{0, 9, 10, 11}
		} ;
		Node obj = new Node();
		Node list1 = obj.createList(arr[0]);
		Node list2 = obj.createList(arr[0]);
		List<Node> lists = obj.createLists(arr);
		for(Node cur_header : lists)
		{
			System.out.println(obj.printList(cur_header));
		}
//		Node mergedLists = obj.mergeTwoLists(list1,list2);
		Node mergedAllLists = obj.mergeKLists_twoatatime(lists);
//		System.out.println("List 1 = " + obj.printList(list1));
//		System.out.println("List 2 = " + obj.printList(list2));
//		System.out.println("Sorted List 1 and 2 = " + obj.printList(mergedLists));
		System.out.println("Sorted All Lists = " + obj.printList(mergedAllLists));
		


		
		
	}
}