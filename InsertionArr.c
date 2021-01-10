#include<stdio.h>
main()
{
    int A[]={1,3,5,7,9};
    int item=10,k=3,n=5;
    int i=0,j=n;
    printf("the original arr:\n");
    for(i=0;i<n;i++)
    {
        printf("A[%d]=%d\n",i,A[i]);
    }
    n=n+1;
    while(j>=k)
    {
        A[j+1]=A[j];
        j=j-1;
        A[k]=item;
        printf("the array elements after insertion:\n");
        for(i=0;i<n;i++)
        {
            printf("A[%d]=%d\n",i,A[i]);
        }
    }
}
