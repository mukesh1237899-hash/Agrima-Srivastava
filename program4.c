#include<stdio.h>
int main()
{//opening main
    int n,p=1;//initialising
    printf("enter number");
    scanf("%d",&n);//store input in variables
    for(int i=1;i<=n;i++)
    {//opening for loop
        p=p*i;
    }//closing for loop
    printf("FACTORIAL OF NUMBER IS:%d",p);
    return 0;
}//closing main
