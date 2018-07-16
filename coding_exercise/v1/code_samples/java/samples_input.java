import java.util.*;
import java.io.*;
import java.math.*;

class Untitled {
	public static void main(String[] args) {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String line = br.readLine();
//		int N = Integer.parseInt(line);
//		for (int i = 0; i < N; i++) {
//		    System.out.println("hello world");
//		}
//		input of 1-d array
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		int arr[] = new int[n];
//		for(int arr_i=0; arr_i < n; arr_i++){
//			arr[arr_i] = in.nextInt();
//		}
//		finding size of arrays
		int arr1[] = new int[3];
		int arr2[][] = new int[4][6];
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		System.out.println(arr2[0].length);
		
		System.out.println(Math.max(1,2));
		
		System.out.println(Integer.MAX_VALUE);   

		System.out.println(Integer.MIN_VALUE); 
		System.out.println(87%84);
		
		String [] ideal_line = br.readLine().split(" ");
		String [] calling_line = br.readLine().split(" ");
		boolean d = calling_line[0].equals(ideal_line[0])
		Queue call_q = new LinkedList<String>();
		Iterator iterator = call_q.iterator();
				while(iterator.hasNext()){
		  			String element = (String) iterator.next();
		  			System.out.print(element + " ");
				}
	}
}