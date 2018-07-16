class removeChars {
	public static String arrayRemove(String source,String remove)
	{
		if (remove == null || remove.length() == 0 )return source;
		
		char[] ca_source = source.toCharArray();
		char[] ca_remove = remove.toCharArray();
		boolean[] flags = new boolean[128];
		
		for(char cur_char : ca_remove)flags[cur_char] = true;
		
		int src = 0;
		int dest = 0;
		for(char cur_char : ca_source)
		{
			if(!flags[cur_char])ca_source[dest++] = ca_source[src];
			src++;
		}
		
		return new String(ca_source,0,dest);
		
	}
	public static void main(String[] args) {
		String source = "Battle of the Vowels: Hawaii vs. Grozny";
		String remove = "aeiou";
		String removed = arrayRemove(source, remove);
		System.out.println(removed);
	}
}