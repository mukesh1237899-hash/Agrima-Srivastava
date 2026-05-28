#include<stdio.h>
int main()
{
    int n,m=1;
    printf("enter number");
    scanf("%d",&n);
    for(int i=1;i<=10;i++)
    {
        m=n*i;
         printf("%d\n",m);
    }
    return 0;
}