class  QuickSort
{
	public static void QuickSort(int[]a,int st,int end)
{
		if(st>=end)
		{
			return;
		}
		int i=st;
		int j=end;
		int pivot=a[((i+j)/2)];
		while(i<=j)
		{
			while(a[i]<pivot){
				i++;
			}
			while(a[j]>pivot){
				j--;
			}
			if(i<=j){
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		QuickSort(a,st,j);
		QuickSort(a,i,end);
	}
	public static void main(String[] args) 
	{
		int []a={7,9,8,4,6,2};
		QuickSort(a,0,a.length-1);
		for(int n:a)
			{
		System.out.println(n);
	     }
}
}