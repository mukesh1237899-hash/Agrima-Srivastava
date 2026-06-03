#include <stdio.h>
int main() {//opening main
    int a, b,z;//initializing variables
    printf("Enter two numbers ");
    scanf("%d %d", &a, &b);

    while (b != 0) {//opening while loop
        z= b;
        b = a % b;
        a = z;
    }//closing while loop
    printf("GCD = %d\n", a);//calculated result
    return 0;
}//closing main