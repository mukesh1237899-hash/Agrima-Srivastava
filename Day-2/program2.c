#include<stdio.h>
int main()
{
    int n,rev=0,num;
    printf("enter number=");
    scanf("%d",&n);
    while(n!=0)
    {
        num=n%10;
        rev=num+(rev*10);
        n=n/10;
    }
    printf("REVERSE OF INPUT NUMBER=%d",rev);
    return 0;
}