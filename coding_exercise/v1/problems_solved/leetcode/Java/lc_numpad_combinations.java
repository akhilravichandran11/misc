import java.util.*;
class Untitled {
	
	public static List<String> letterCombinations(String digits) {
		LinkedList<String> ans = new LinkedList<String>();
		String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		ans.add("");
		for(int i =0; i<digits.length();i++){
			int x = Character.getNumericValue(digits.charAt(i));
			while(ans.peek().length()==i){
				int j =0 ;
				String t = ans.remove();
				System.out.println("j = "+ j +" t = "+t);
				for(char s : mapping[x].toCharArray())
					ans.add(t+s);
				System.out.println("j = "+ j +" ans = "+ans);
				j++;
			}
			
			
		}
		return ans;
	}
	public static void main(String[] args) {
		
		List d = letterCombinations("23");
		
		System.out.println(d);
		
	}
}