class MergeSort {
	public static void mergeArrays(int[] arr,int start,int mid,int end)
	{
		int s1 = start;
		int s2 = mid+1;
		int e1 = mid;
		int e2 = end;
		int[] temp = new int[end-start + 1];
		int i=0;
		while(s1<=e1 && s2<=e2)
		{
			if(arr[s1]<arr[s2])
			{
			temp[i] = arr[s1];
			s1++;	
			}
			else {
				temp[i] = arr[s2];
				s2++;
			}
			i++;
		}
		
		while(s1<=e1)
		{
			temp[i] = arr[s1];
			s1++;	
			i++;
		}
		
		while(s2<=e2)
		{
			temp[i] = arr[s2];
			s2++;	
			i++;
		}
		
		for(int j=0;j<i;)
		{
			arr[start++] = temp[j++];
		}
	}
	public static void mergeSort(int[] arr,int start,int end)
	{
		if(start>=end) return;
		int mid = (start+end)/2;
		mergeSort(arr, start,mid);
		mergeSort(arr, mid+1,end);
		mergeArrays(arr,start,mid,end);
	}
	public static void main(String[] args) {
		int[] arr = {4,2,1,3,5};
		mergeSort(arr, 0,arr.length - 1);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}