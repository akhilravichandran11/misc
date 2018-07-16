class multiply {
	public static void multiplyTwoNum(int x,int y)
	{
		if(x == 0 || y == 0) System.out.println(0);
		int val =0,n=0,next_sign=1,prev_y=y;
		while(y>0)
		{
			int cur_y = (1<<n);
			System.out.println("y = "+y+" | cur_y = "+cur_y);
			
			if(cur_y == y)
			{
				System.out.println("dude same");
				int cur_val = (x<<n);
				val += cur_val*next_sign;
				System.out.println("\tcur_val = "+cur_val+" | val = "+val);
				y -= cur_y;
				n = 0;
				next_sign = 1;
				
			}else if(cur_y > y)
			{
				System.out.println("dude enter   | "+cur_y + " || " +prev_y);
				int diff_cur = cur_y - y,diff_prev = y - prev_y;
				if(diff_cur > diff_prev)
				{
					System.out.println("dude enter 1");
					int cur_val = (x<<n-1);
					val += cur_val*next_sign;
					System.out.println("\tcur_val = "+cur_val+" | val = "+val);
					y = y - prev_y;
					next_sign *= 1;
					
				}
				else {
					System.out.println("dude enter 2");
					int cur_val = (x<<n);
					val += cur_val*next_sign;
					System.out.println("\tcur_val = "+cur_val+" | val = "+val);
					y = cur_y - y;
					next_sign *= -1;
				}
				
				prev_y = y;
				n = 0;
			}
			
			prev_y = cur_y;
			n++;
		}
		
		System.out.println("Val = "+val);
	}
	public static void main(String[] args) {
		int x = 1;
		int y = 100;
		multiplyTwoNum(x, y);
	}
}