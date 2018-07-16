class findPivotSortedArray {
	public static int findRotateIndex(int[] arr, int l,int r)
	{
		if(r>=l)
		{
			int mid = (l+r)/2;
			if((mid+1)<=r && arr[mid]>arr[mid+1])return mid+1;
			if((mid-1)>=l && arr[mid-1]>arr[mid])return mid;
			if(arr[l]>arr[mid])return findRotateIndex(arr, l,mid-1);
			else if (arr[mid]>arr[r])return findRotateIndex(arr,mid+1,r);
			else if(arr[mid]==arr[l])
			{
					int result = findRotateIndex(arr,mid+1,r);
					if (result == -1 ) result = findRotateIndex(arr, l,mid-1);
					return result;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
//		int[] arr = {15,15,15,15,15,15,15,15,15,1,3,4,5,7,10,14};
		int[] arr = {2, 2, 2, 2, 2, 2, 2, 2, 0,1,1,1,2};
//		int[] arr = {2, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
		int rotate = findRotateIndex(arr,0,arr.length-1);
		System.out.println(rotate);
	}
}