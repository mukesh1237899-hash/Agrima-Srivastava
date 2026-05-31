#include<stdio.h>
int main()
{//opening main
    int n;//initialising
    printf("enter number");
    scanf("%d",&n);//store input in variables
    for(int i=1;i<=n;i++)
    {//opening for loop
        if(n%i==0)
        printf("%d\n",i);
        else
        continue;
    }//closing for loop
    return 0;
}//closing main
