import java.util.*;

class Numberofislands {
	private int[][] data;
	private boolean[][] visited;
	private int row_max;
	private int col_max;
	private int count;
	class IslandNode{
		int row;
		int col;
		public IslandNode(int i,int j)
		{
			this.row = i;
			this.col = j;
		}
	}
	
	public Numberofislands(int[][] data)
	{
		this.data = data;
		this.row_max = data.length;
		this.col_max = data[0].length;
		this.visited = new boolean[this.row_max][this.col_max];
		count = calcNumberOfIslands();
	}
	private boolean visitPossible(int row,int col)
	{
		return ((row>=0 && row<row_max) && (col>=0 && col<col_max) && !this.visited[row][col] && this.data[row][col] == 1);
	}
	private void visitConnectedIslands(int cur_row,int cur_col)
	{
		this.visited[cur_row][cur_col] = true;
		int[] row_vist = {-1,-1,-1,0,0,1,1,1};
		int[] col_vist = {-1,0,1,-1,1,-1,0,1}; 
		
		for(int i =0 ;i<row_vist.length;i++)
		{
			int new_row = cur_row + row_vist[i];
			int new_col = cur_col + col_vist[i];
			if(visitPossible(new_row,new_col))
			{
				visitConnectedIslands(new_row,new_col);
			}
		}
		
	}
	
	private void visitStackConnectedIslands(int row,int col)
	{
		int[] row_vist = {-1,-1,-1,0,0,1,1,1};
		int[] col_vist = {-1,0,1,-1,1,-1,0,1}; 
		
		Stack<IslandNode> node_stack = new Stack<IslandNode>();
	
		node_stack.push(new IslandNode(row,col));	
			
		while(!node_stack.isEmpty())
		{
			IslandNode cur_node = node_stack.pop();
			int cur_row = cur_node.row;
			int cur_col = cur_node.col;
			this.visited[cur_row][cur_col] = true;
			
			
			for(int i =0 ;i<row_vist.length;i++)
			{
				int new_row = cur_row + row_vist[i];
				int new_col = cur_col + col_vist[i];
				if(visitPossible(new_row,new_col))
				{
					node_stack.push(new IslandNode(new_row,new_col));
				}
			}
			
		}
		
				
	}
	private int calcNumberOfIslands()
	{
		int island_count = 0;
		for(int i = 0;i<row_max;i++)
		{
			for(int j = 0;j<col_max;j++)
			{
				if(!visited[i][j] && data[i][j] == 1)
				{
					visitStackConnectedIslands(i,j);
					island_count++;	
				}
				
			}
			
		}
		
		return island_count;
	}
	public static void main(String[] args) {
		int data[][]=  new int[][] {
			{1, 1, 0, 0, 0},
			{0, 1, 0, 0, 1},
			{1, 0, 0, 1, 1},
			{0, 0, 0, 0, 0}
		  };
		Numberofislands object = new Numberofislands(data); 
		System.out.println(object.count);
	}
}