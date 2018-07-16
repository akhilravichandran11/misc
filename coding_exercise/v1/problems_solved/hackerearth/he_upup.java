
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

class TestClass {
	public static void main(String args[] ) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char prev = ' ';
		while( br.ready() )
		{
			char cur = (char)br.read();
			char to_print = cur;
			if (prev == ' '){
				to_print = Character.toUpperCase(to_print);
			}
			prev = cur;
			System.out.print(to_print);
		}
System.out.println("");


	}
}
