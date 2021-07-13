class BubbleSort1
{
	public static void main(String args[])
	{
		BubbleSort1 ob=new BubbleSort1();
		int a[]={4,6,14,2,11,9};
		ob.bubbleSort(a);
		System.out.println("Sorted array");
		ob.printArray(a);
	}
	void bubbleSort(int a[])
	{
		int len=a.length;
		for(int i=0;i<len-1;i++)
		for(int j=0;j<len-i-1;j++)if(a[j]>a[j+1])
		{
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		}
	}
	void printArray(int a[])
	{
		int len=a.length;
		for(int i=0;i<len;i++)
		System.out.print(a[i]+" ");
		System.out.println();
	}
}