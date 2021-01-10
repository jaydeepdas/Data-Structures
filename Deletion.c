#include<stdio.h>>
void main()
{
    int A[]={1,3,5,7,8};
    int k=3,n=5;
    int i,j;
    printf("The original array elements are:\n");
    for(i=0;i<n;i++)
    {
        printf("A[%d]=%d \n",i,A[i]);
    }
    j=k;
    while(j<n)
    {
        A[j-1]=A[j];
        j=j+1;
    }
    n=n-1;
    printf("The array elements deletion:");
    for(i=0;i<n;i++)
    {
        printf("A[%d]=%d \n",i,A[i]);
    }
}
