#include<stdio.h>
void leftRotOne(int arr[],int n);
void leftRot(int arr[],int d,int n)
{
    int i;
        for(i=0;i<d;i++)
            leftRotOne(arr,n);
}
void leftRotOne(int arr[],int n)
{
    int temp=arr[0],i;
        for(i=0;i<n-1;i++)
            arr[i]=arr[i+1];
        arr[i]=temp;
}
void printArray(int arr[],int n)
{
    int i;
        for(i=0;i<n;i++)
            printf(" %d",arr[i]);
}
int main()
{
    int arr[]={10 , 2, 3, 4, 5, 6, 7};
    leftRot(arr,2,7);
    printArray(arr,7);
    return 0;
}
