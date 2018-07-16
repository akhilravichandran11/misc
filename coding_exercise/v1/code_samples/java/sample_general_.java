import java.util.*;
import java.util.Arrays;
class SampleGeneral{
	// TODO : Strings - substrings
	public static void main(String[] args) {
		String s = "123.123";
		Integer i = Integer.parseInt("123");
		Integer  i_2 = Integer.parseInt("11",2);
		System.out.println("i_2 = "+i_2);;
		Float f = Float.parseFloat("123.123");
		String[] mapping = new String[] {"0", "1", "abc"};
		System.out.println("f = "+f);
		System.out.println("i = "+i);
		
		int get_num_value = Character.getNumericValue('z');
		int get_num_value_2 = '9' - '0';
		System.out.println("get_num_value = "+get_num_value);
		System.out.println("get_num_value_2 = "+get_num_value_2);
		
		char[] sorted_chars = s.toCharArray();
		Arrays.sort(sorted_chars);
		String sorted_s = new String(sorted_chars);
		System.out.println("sorted_s = "+sorted_s);
		
		String[] array = new String[] {"John", "Mary", "Bob"};
		System.out.println("print array = "+Arrays.toString(array));
		String[][] deepArray = new String[][] {{"John", "Mary"}, {"Alice", "Bob"}};
		System.out.println("print deep array = "+Arrays.toString(deepArray));
		System.out.println("print deep array = "+Arrays.deepToString(deepArray));
		
		
		boolean[][] boolean_array = new boolean[4][4];
		System.out.println("Unintialized boolean array = "+boolean_array[0][3]);
		
		int[][] int_array = new int[4][4];
		System.out.println("Unintialized int array = "+int_array[0][3]);
		
		char[][] char_array = new char[4][4];
		System.out.println("Unintialized char array = "+char_array[0][3]);
		
		String[][] string_array = new String[4][4];
		System.out.println("Unintialized string array = "+string_array[0][3]);
		
		// Fill a char array like c*10 just libe ruby
		String original = "original ";
		char c = 'c';
		int number = 9;
		char[] repeat = new char[number];
		Arrays.fill(repeat, c);
		original += new String(repeat);
	}
}