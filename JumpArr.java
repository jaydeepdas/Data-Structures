import java.util.*;
import java.io.*;
class JumpArr
{
	static int minJumps(int arr[],int l, int h)
	{
		if(h==1)
		return 0;
		if(arr[1] ==0)
			return Integer.MAX_VALUE;
		int min=Integer.MAX_VALUE;
		for( int i=l+1;i<=h&&i<=1+arr[1];i++)
		{
			int jumps= minJumps(arr,i,h);
			if(jumps != Integer.MAX_VALUE && jumps+1<min)
			min = jumps+1;
		}
		return min;
	}
	public static void main(String ar[])
	{
		int arr[]={1,3,6,3,2,3,6,8,9,5};
		int n= arr.length;
		System.out.print("minimum number of jumps to reach end is" + minJumps(arr,0,n-1));
	}
}
