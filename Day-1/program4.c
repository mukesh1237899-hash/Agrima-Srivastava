#include<stdio.h>
int main()
{//opening main
    int c=0,n;//initialising variable
    printf("enter number");
    scanf("%d",&n);//storee input in variable
    if(n==0)
{
    c=1;
}
    while (n!=0)
    {//opening while loop
     n=n/10;
     c++;
    }//closing while loop
  printf("%d",c);
  return 0;  
}//closing main