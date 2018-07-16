import java.util.*;
class TreeVerticalOrder {
	
	public static class TreeNode {
		 		int val;
		     TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	public static List<List<Integer>> verticalOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<>();
		if (root == null) {
			return res;
		}
		
		Map<Integer, ArrayList<Integer>> map = new HashMap<>();
		Queue<TreeNode> q = new LinkedList<>();
		Queue<Integer> cols = new LinkedList<>();

		q.add(root); 
		cols.add(0);

		int min = 0;
		int max = 0;
		
		while (!q.isEmpty()) {
			TreeNode node = q.poll();
			int col = cols.poll();
			
			if (!map.containsKey(col)) {
				map.put(col, new ArrayList<Integer>());
			}
			map.get(col).add(node.val);

			if (node.left != null) {
				q.add(node.left); 
				cols.add(col - 1);
				min = Math.min(min, col - 1);
			}
			
			if (node.right != null) {
				q.add(node.right);
				cols.add(col + 1);
				max = Math.max(max, col + 1);
			}
		}

		for (int i = min; i <= max; i++) {
			res.add(map.get(i));
		}

		return res;
	}
	public static String inorder(TreeNode root)
	{
		if(root == null) return "";
		
		String s_left = inorder(root.left);
		
		String center = root.val +",";
		
		String s_right = inorder(root.right);
		
		return s_left + center + s_right;
	}
	public static void main(String[] args) {
		
	String[] s_arr = {null,"3","9","20",null,null,"15","7"};
	
	TreeNode[] tree_nodes = new TreeNode[s_arr.length];
	
	for(int i =1;i<s_arr.length;i++)
	{
		String val = s_arr[i];
		TreeNode cur = null ;
		if(val!=null)
		{
			if(tree_nodes[i]!=null)
			{
				cur = tree_nodes[i];
			}
			else 
			{
				cur = new TreeNode(Integer.parseInt(val));
				tree_nodes[i] = cur;
			}
			int left = 2*i;
			int right = 2*i +1;
			if(left<s_arr.length && s_arr[left]!=null)
			{
				TreeNode node_left = new TreeNode(Integer.parseInt(s_arr[left]));
				cur.left = node_left;
				tree_nodes[left] = node_left;
			}
			if(right<s_arr.length && s_arr[right]!=null)
			{
				TreeNode node_right = new TreeNode(Integer.parseInt(s_arr[right]));
				cur.right = node_right;
				tree_nodes[right] = node_right;
			}
			
		}
	}
	
	System.out.println(inorder(tree_nodes[1]));
	System.out.println(verticalOrder(tree_nodes[1]));
		
	}
}