/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.io.BufferedReader;
import java.io.InputStreamReader;


import java.util.*;


class TestClass {
	
	public static class Rotate{
		int arr[];
		int rotate;
		public Rotate(int arr[],int k)
		{
			this.arr = arr;
			rotate = k;
		}
		
		private StringBuilder print_right_rotate(StringBuilder sb)
		{
			int n = arr.length;
			if (rotate > n)
			{
				rotate = (rotate % n );
			}
			
			int k =	Math.abs(n - rotate);
			
			for (int i= k ; i< n ;i++)
			{
				sb.append(arr[i] + " ");
			}
			
			for (int i=0  ; i< k ;i++)
			{
				sb.append(arr[i] + " ");
				
			}
			
			sb.append("\n");
			return sb;
		}
	}
    public static void main(String args[] ) throws Exception {


        //BufferedReader
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String line = br.readLine();
        // int N = Integer.parseInt(line);

        //Scanner
        Scanner s = new Scanner(System.in);
         int test_cases = s.nextInt();
         StringBuilder sb= new StringBuilder();
        for (int i = 0; i < test_cases; i++) {
            int n = s.nextInt();
            int k = s.nextInt();
            int arr[] = new int[n];
            for (int j=0;j<n;j++)
            {
            	arr[j] = s.nextInt();
            }
            Rotate obj = new Rotate(arr,k);
            sb = obj.print_right_rotate(sb);
        }
  	System.out.print(sb.toString());

        
    }
}
