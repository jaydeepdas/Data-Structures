import java.io.*;

class NagativeEle {

	static void rearrange(int arr[], int n)
	{
		int j = 0, temp;
		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {
				if (i != j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}
	}

	static void printArray(int arr[], int n)
	{
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String args[])
	{
		int arr[] = { -4,3,-6,22,4,-3,-9,10,-8 };
		int n = arr.length;

		rearrange(arr, n);
		printArray(arr, n);
	}
}

