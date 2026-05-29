#include<stdio.h>
int main()
{
    int p=1,n,num;
    printf("enter number=");
    scanf("%d",&n);
    while(n!=0)
    {
        num=n%10;
        p=p*num;
        n=n/10;
    }
    printf("PRODUCT OF GIVEN NUMBER=%d",p);
    return 0;
}