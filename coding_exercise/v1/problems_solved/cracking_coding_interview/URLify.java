class URLify {
	public static void replaceSpaces(char[] str,int truelength)
	{
		System.out.println(str.length);
		int true_index = truelength - 1;
		int index = str.length - 1;
		
		while(true_index>=0)
		{
			if(str[true_index] == ' ')
			{
				str[index--]='0';
				str[index--]='2';
				str[index--]='%';
				
			}
			else 
			{
				str[index--] = str[true_index];
			}
			
			true_index--;
		}
		
		System.out.println("Final String = "+new String(str));
		
	}
	public static void main(String[] args) {
		String s = "Mr John Smith    ";
		replaceSpaces(s.toCharArray(),13);
	}
}