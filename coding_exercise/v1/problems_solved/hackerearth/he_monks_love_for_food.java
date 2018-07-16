
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        // Scanner s = new Scanner(System.in);
        // int N = s.nextInt();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        int N = Integer.parseInt(line);
		Stack food = new Stack<String>();
		int i=0;
		while(i<N)
		{
			String [] l = br.readLine().split(" ");
			if(l[0].equals("1"))
			{
				if(food.size()==0){
					sb.append("No Food\n");
				}
				else
				{
					sb.append(food.pop() + "\n");
				}
			}else
			{
				food.push(l[1]);
			}
			i++;
		}
      
        System.out.print(sb);
    }
}
