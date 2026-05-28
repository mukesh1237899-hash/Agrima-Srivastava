#include<stdio.h>
int main(){
    int c=0,n;
    printf("enter number");
    scanf("%d",&n);
    while (n!=0)
    {
     n=n/10;
     c++;   /* code */
    }
  printf("%d",c);
  return 0;  
}