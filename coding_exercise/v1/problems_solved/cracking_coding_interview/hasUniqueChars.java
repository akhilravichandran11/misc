class hasUniqueChars {
	public static boolean isUniqueChars(String str)
	{
		int checker = 0;
		for(int i=0; i<str.length() ;i++)
		{
			int val = str.charAt(i) - 'a';
			int temp = val;
			int temp2 = (1 << temp);
//			int temp2_1 = (temp >> 1);
//			int temp2_2 = (temp << 1);
			int temp3 = (checker & temp2);
			System.out.println("i = "+i+" | val = "+val+" | real val = "+str.charAt(i));
			System.out.println("\tchecker before = "+checker);
			System.out.println("\tchecker before binary= "+Integer.toBinaryString(checker));
			System.out.println("\ttemp = "+temp);
			System.out.println("\ttemp binary= "+Integer.toBinaryString(temp));
			System.out.println("\ttemp2 = "+temp2);
			System.out.println("\ttemp2 binary = "+Integer.toBinaryString(temp2));
//			System.out.println("\ttemp2_1 = "+temp2_1);
//			System.out.println("\ttemp2_2 = "+temp2_2);
			System.out.println("\ttemp3 = "+temp3);
			System.out.println("\ttemp3 binary = "+Integer.toBinaryString(temp3));
			if((checker & (1 << val)) > 0 )
			{
				return false;
			}
			
			checker |= (1 << val );
			System.out.println("\tchecker after = "+checker);
			System.out.println("\tchecker after binary= "+Integer.toBinaryString(checker));
			
		}
		return true;
	}
	public static void main(String[] args) {
		String test = "zxtear";
		
		boolean c = isUniqueChars(test);
		System.out.println(c);
	}
}