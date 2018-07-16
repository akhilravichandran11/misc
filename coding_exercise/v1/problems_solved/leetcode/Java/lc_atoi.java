class atoi {
	public static void main(String[] args) {
		
		String s_num = "456";
		int result = 0;
		for(char cur_char : s_num.toCharArray())
		{
			int cur_num = cur_char - '0';
			System.out.println(cur_num);
			result = ((result*10) + cur_num);
		}
		System.out.println(result);
	}
}