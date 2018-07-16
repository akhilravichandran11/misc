public class Solution {
		 public  String countAndSay(int n) {
		 int i = 1;
		 String val = "1";
		 
		 
		 while(i<n)
		 {
			  String sval = val;
			  StringBuffer sb = new StringBuffer();
			  
			  int k=0;
			  char cur_char =sval.charAt(0);
			  char prev_char = sval.charAt(0);
			  for(int j=0;j<sval.length();j++)
			  {
					cur_char = sval.charAt(j);
					
					if (cur_char == prev_char) 
					{
						 k++;
					}
					else
					{
		 
						 sb.append(k + "" + prev_char);
						  prev_char = cur_char;
						 k= 1;
						 
					}
					
			  }
	
				  sb.append(k + "" + cur_char); 
			  
			  
			  val = sb.toString();
			  
			  i++;
		 }
		 
		 return val;
		 
		  
	 }
}