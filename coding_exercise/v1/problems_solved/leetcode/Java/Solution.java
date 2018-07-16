class Solution {
	public String addBinary(String a, String b) {
		
		String[] array_s = new String[2];
		char[] array_a = a.toCharArray();
		char[] array_b = b.toCharArray();
		
		int max_len = Math.max(a.length(), b.length());
		
		int sum = 0;
		int carry = 0;
		for(int i=0;i<max_len;i++){
			sum = 0;
			if(i<array_a.length){
				sum += array_a[i] - '0';
			}
			
			if(i<array_b.length){
				sum += array_b[i] - '0';
			}
			
			sum = carry + sum;
			carry = sum/2;
			int num = sum%2;
			
			
	
		
		}
		
		System.out.println(max_len);
		
		return "Akhil";
	}
	
	public static void main(String[] args){
		Solution test = new Solution();
		test.addBinary("11", "1");
	}
}