public class MergeSort
{
	//to Display the array
	public static void display(int arr[],int size)
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	//main function
	public static void main(String ar[])
	{
		int[] a={11,9,4,16,12,8,2,6};
		int i;
		int size=(int)a.length;
		display(a,size);
		mergeSort(a,0,size-1);
		display(a,size);
	}
	//this function apply Merging & Sorting in the array
	static void mergeSort(int[] a,int strt,int end)
	{
		int mid;
		if(strt < end)
		{
			mid=(strt + end)/2;
			mergeSort(a,strt,mid);
			mergeSort(a,mid+1,end);
			merge(a,strt,mid,end);
		}
	}
	//after sorting this function merge the array
	static void merge(int[] a,int strt,int mid,int end)
	{
		int i=strt,j=mid+1,p,index=strt;
		int[] temp= new int [10];
		while(i<=mid && j<=end)
		{
			if(a[i]<a[j])
			{
				temp[index] =a[i];
				i=i+1;
			}
			else
			{
				temp[index]=a[j];
				j=j+1;
			}
			index++;
		}
		if(i>mid)
		{
			while(j<=end)
			{
				temp[index]=a[j];
				index++;
				j++;
			}
		}
		else
		{
			while(i<=mid)
			{
				temp[index]=a[i];
				index++;
				i++;
			}
		}
		p=strt;
		while(p<index)
		{
			a[p]=temp[p];
			p++;
		}
	}
}