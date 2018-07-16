import java.util.*;
class productOfArrayExceptSelf {
	public static int[] productOfArrayExceptSelf_twoArrays(int[] array)
	{
		if(array.length <=1) return new int[1];
		int[] prod = new int[array.length];
		int[] prod_right = new int[array.length];
		for(int i=0;i<prod.length;i++)
		{
			prod[i] = 1;
			prod_right[i] = 1;
		}
		for(int i=1;i<=array.length-1;i++)
		{
			prod[i] = prod[i-1]*array[i-1];
		}
		System.out.println(Arrays.toString(prod));
		for(int i = array.length-2;i>=0;i--)
		{
			prod_right[i] = prod_right[i+1]*array[i+1];
		}
		for(int i = 0 ;i<array.length;i++)
		{
			prod[i] = prod[i] * prod_right[i];
		}
//		System.out.println(Arrays.toString(prod_right));
		return prod;
	}
	public static int[] productOfArrayExceptSelf_oneArray(int[] array)
	{
		if(array.length<=1) return new int[1];
		int[] prod = new int[array.length];
		int prod_left = 1;
		for(int i = 0;i<array.length;i++)
		{
			prod[i] = prod_left;
			prod_left *= array[i];
		}
		System.out.println(Arrays.toString(prod));
		int prod_right = 1;
		for(int i = array.length-1;i>=0;i--)
		{
			prod[i] *= prod_right;
			prod_right *= array[i];
			
		}
//		System.out.println(Arrays.toString(prod));
		return prod;
	}
	public static void main(String[] args) {
		int[] array = {2, 7, 3, 4};
		int[] product = productOfArrayExceptSelf_oneArray(array);
		System.out.println(Arrays.toString(product));
	}
}