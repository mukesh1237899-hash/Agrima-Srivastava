#include<stdio.h>
int main()
{//opening main
    int n,c=0;//intialising variable
    printf("enter number");
    scanf("%d",&n);
    for(int i=1;i<=n;i++)//checking whether prime number or not
    {//opening for loop
        if(n%i==0)
        c++;//counting number of digits
    }//closing for loop
    //result
if(c==2)
printf("prime number");
else
printf("not prime number");
return 0;
}//closing main