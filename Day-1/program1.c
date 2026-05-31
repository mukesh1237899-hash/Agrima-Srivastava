#include<stdio.h>
int main()
{//opening main
    int n,s=0;//initialising variables
    printf("enter number");
    scanf("%d",&n);//store input in variable
    for(int i=1;i<=n;i++)
    {//opening for loop
        s=s+i;
    }//closing for loop
    printf("sum=%d",s);//calculated sum
    return 0;
}//closing main
