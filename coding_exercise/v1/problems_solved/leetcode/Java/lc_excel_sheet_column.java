class excelSheetTitle {
	public static int excelSheetTitle(String column)
	{
		int sum = 0;
		int index = 1;
		int length = column.length();
		for(char cur_char : column.toCharArray())
		{
			int cur_val = cur_char - 'A' + 1;
			System.out.println(cur_val);
			sum += Math.pow(26,(length - index)) * cur_val;
			index++;
			
		}
		
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(excelSheetTitle("A"));
	}
}