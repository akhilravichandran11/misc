import java.util.*;

class TrieSample {
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
	
	
	public static void main(String[] args) {
		Trie test = new Trie();
		test.insertWord("dude");
		test.insertWord("dudet");
		test.insertWord("root");
		
		
	}
}