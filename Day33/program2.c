#include<stdio.h>
int main()
{//OPENING LOOP
    int n,c=0;//intialising variables
    printf("enter number");
    scanf("%d",&n);
    for(int i=1;i<=n;i++)//checking whether prime number or not
    {
        for(int j=1;j<=i;j++)
        {
        if(i%j==0)
        c++;
        }
if(c==2)
printf("%d\n",i);//PRINTING THOSE NUMBERS THAT ARE PRIME
c=0;
    }
    return 0;
}//CLOSING LOOP