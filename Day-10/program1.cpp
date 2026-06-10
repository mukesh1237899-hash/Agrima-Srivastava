#include <iostream>
using namespace std;
int main()
 {//opening main
    int r= 5;
    for (int i=1; i<= r; i++) 
    {
        for (int j=1; j<= r - i; j++)
         {
            cout << " ";//printing space of pyramid
        }
        for (int k=1; k <= (2 * i - 1); k++) 
        {
            cout << "*";//printing star of pyramid
        }
        cout << endl;
    }
    return 0;
}//closing main