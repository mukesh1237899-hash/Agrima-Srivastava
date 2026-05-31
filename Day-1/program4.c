#include<stdio.h>
int main()
{//opening main
    int c=0,n;//initializing variables
    printf("enter number");
    scanf("%d",&n);//store input in variable
    while (n!=0)
    {//opening while loop
     n=n/10;
     c++;
    }//closing while loop
  printf("%d",c);
  return 0;  
}//closing main
