/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;


class TestClass {
	public static void main(String args[] ) throws Exception {
		
		// Scanner s = new Scanner(System.in);
		// int N = s.nextInt();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		
		String [] calling_line = br.readLine().split(" ");
		String [] ideal_line = br.readLine().split(" ");

   
	   int ideal_inx = 0;
	   Queue call_q = new LinkedList<String>();
	   int i = 0;
	   while(i<N)
	   {
	   	call_q.add(calling_line[i]);
	   	i++;
	   }
	   
	   i =0;
	   int total = 0;
	   while(i<N)
	   {

	   	if(ideal_line[i].equals(call_q.peek()))
	   	{
	   		call_q.remove();
	   		i++;
	   		total++;
	   	}
	   	else
	   	{
	   		call_q.add(call_q.remove());
	   		total++;
	   		
	   	}
	   }
	   
	System.out.println(total);
	}
}
