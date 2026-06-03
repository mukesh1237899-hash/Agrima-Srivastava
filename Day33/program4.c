#include <stdio.h>
int main() 
{//opening main
    int a, b, x, y, gcd, lcm;//initialising variables
    printf("Enter two numbers");
    scanf("%d %d", &a, &b);//store input in variables
    x = a;
    y = b;
    while (y != 0) {//opening while loop
        int temp = y;
        y = x % y;
        x = temp;
    }//closing while loop
    gcd = x;
    lcm = (a * b) / gcd;
    printf("LCM = %d\n", lcm);//printing lcm of numbers
    return 0;
}//closing main