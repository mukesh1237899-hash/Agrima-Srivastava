#include<stdio.h>
int main()
{//opening main
    int n,m=1;//initialising variables
    printf("enter number");
    scanf("%d",&n);
    for(int i=1;i<=10;i++)
    {//opening for loop
        m=n*i;
         printf("%d\n",m);//calculating multiples of number
    }//closing for loop
    return 0;
}//closing main
