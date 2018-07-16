import java.util.*;

class WordSearchCaller {
	static class TrieNode{
		TrieNode[] children;
		boolean isLeaf;
		TrieNode()
		{
			children = new TrieNode[26];
			isLeaf = false;
		}
		
	}
	
	static class Trie{
		TrieNode root;
		Trie()
		{
			root = new TrieNode();
		}
		
		public void printTrie()
		{
			
			Queue<TrieNode> queueNode = new LinkedList<TrieNode>();
			queueNode.add(root);
			String cur_string = " ";
			while(!queueNode.isEmpty())
			{
				ArrayList<Character> temp = new ArrayList<Character>();
				TrieNode cur = queueNode.remove();
				String next_string = "";
				for(int i=0;i<26;i++)
				{
					if(cur.children[i]!=null)
					{
						char cur_char = (char)('a'+i);
						if(next_string.length()==0)next_string = cur_char + "";
						temp.add(cur_char);
						queueNode.add(cur.children[i]);
					}
				}
				System.out.println(cur_string + " ----> "+temp.toString());
				cur_string = next_string;
			}
		}
		
		public void insertWord(String word)
		{
			TrieNode current_root = root;
			int index = 0;
			for(int i=0;i<word.length();i++)
			{
				char cur_char = word.charAt(i);
				index = cur_char - 'a';
				if(current_root.children[index]==null)current_root.children[index] = new TrieNode();
				current_root = current_root.children[index];
				
			}
			
			current_root.isLeaf = true;
			
		}
		
		public TrieNode searchNode(String word)
		{
			TrieNode current_root = root;
			int i = 0;
			while(i<word.length())
			{
				char cur_char = word.charAt(i);
				int index = cur_char - 'a';
				if(current_root.children[index]==null)return null;
				else {
					current_root = current_root.children[index];
					i++;
				}
			}
			if(i==word.length())return current_root;
			return null;
		}
		
		public boolean searchWord(String word)
		{
			TrieNode temp = searchNode(word);
			if(temp!=null && temp.isLeaf)return true;
			
			return false;
		}
		
		public boolean startsWith(String word)
		{
			TrieNode temp = searchNode(word);
			if(temp!=null)return true;
			
			return false;
		}
	}
	
	public static void wordSearch(String[] words,char[][] grid)
	{
		Trie cur_trie = new Trie();
		ArrayList<String> listStrings = new ArrayList<String>();
		for(String word :  words)
		{
			cur_trie.insertWord(word);
		}
		for(int i=0;i<grid.length;i++)
		{
			for(int j=0;j<grid[i].length;j++)
			{
				boolean[][] visited = new boolean[grid.length][grid[i].length];
				dfsGrid(cur_trie.root,grid,i,j,visited,new ArrayList<Character>(),listStrings);
				
			}
		}
		
		System.out.println(listStrings.toString());

	}
	
	public static void dfsGrid(TrieNode cur_trie,char[][] grid,int row,int col,boolean[][] visited,ArrayList<Character> cur_str,ArrayList<String> listStrings)
	{
		
		if((row>=0 && row<grid.length)&&(col>=0 && col<grid[0].length))
		{
			if(visited[row][col]) return;
			char cur_char = grid[row][col];
			int index = cur_char - 'a';
			if(cur_trie.children[index]!=null)
			{

				cur_str.add(cur_char);
				System.out.println("Found - "+cur_char+ " | cur_str "+ cur_str.toString());
//				visited[row][col] = true;

				cur_trie = cur_trie.children[index];
				if(cur_trie.isLeaf)
				{
					System.out.println(cur_str.toString());
					listStrings.add(cur_str.toString());
				}
				for(int k = -1;k<=1;k++)
				{
					for(int p = -1;p<=1;p++)
					{
						if(!(p==0 && k==0))
						{
							dfsGrid(cur_trie,grid,row+k,col+p,visited,cur_str,listStrings);
						}
					}
				}
			}
		}

		
	}
	
	public static void main(String[] args) {
		char[][] char_grid= {
			{'o','a','a','n'},
			{'e','t','a','e'},
			{'i','h','k','r'},
			{'i','f','l','v'}
		};
		
		String[] words = {"oath","oate","oaa","pea","eat","rain"};
		wordSearch(words, char_grid);
		
		
	}
}