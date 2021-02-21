import java.io.*;
class Sort012
{
	static void sort012(int a[],int arr_size)
	{
		int Io =0;
		int hi = arr_size -1;
		int mid =0,temp=0;
		while(mid<=hi)
		{
			switch( a[mid])
			{
				case 0:
				{
					temp=a[Io];
					a[Io]=a[mid];
					a[mid]=temp;
					Io++;
					mid++;
					break;
				}
				case 1:
					mid++;
					break;
				case 2:
				{
					temp=a[mid];
					a[mid]=a[hi];
					a[hi]=temp;
					hi--;
					break;
				}
			}
		}
	}
	static void printArray(int arr[], int arr_size)
	{
		int i;
		for(i=0;i<arr_size;i++)
			System.out.print(arr[i] + " ");
		System.out.println(" ");
	}
	public static void main(String ar[])
	{
		int arr[]={0,1,2,1,2,0,0,2,1,1,0,2};
		int arr_size=arr.length;
		sort012(arr,arr_size);
		System.out.println("Array after Sorting");
		printArray(arr,arr_size);
	}
}