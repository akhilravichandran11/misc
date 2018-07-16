class Untitled {
	
	public static void detectDecimal(String sNum){
		String[] sNums = sNum.split(".");
		System.out.print(sNums[0]);
		
		
	}
	public static void main(String[] args) {
		String s = "123.123";
		detectDecimal(s);
//		System.out.println(d);
	}
}