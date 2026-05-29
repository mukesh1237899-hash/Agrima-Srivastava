#include<stdio.h>
int main()
{
    int s=0,n,num;
    printf("enter number");
    scanf("%d",&n);
    while(n!=0)
    {
        num=n%10;
        s=s+num;
        n=n/10;
    }
    printf("SUM OF DIGITS OF INPUT NUMBER=%d",s);
    return 0;
}
