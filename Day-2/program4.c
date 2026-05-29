#include<stdio.h>
int main()
{
    int s=0,n,num,no,rev=0;
    printf("enter number");
    scanf("%d",&n);
    no=n;
    while(n!=0)
    {
        num=n%10;
        rev=num+(rev*10);
        n=n/10;
    }
    if(no==rev)
     printf("INPUT NUMBER IS PALINDROME NUMBER");
     else
      printf("NOT A PALINDROME NUMBER");
      return 0;
}
