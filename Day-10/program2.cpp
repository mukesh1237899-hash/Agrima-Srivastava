#include <iostream>
using namespace std;
int main() 
{//opening main
    int r= 5;
cout<<"PRINTING REVERSE STAR PATTERN"<<endl;
    for (int i = r; i >= 1; i--)
     {
        for (int j = 1; j <= r-i; j++) 
        {
            cout << " ";//printing spaces
        }
        for (int k = 1; k <= (2 * i - 1); k++)
         {
            cout << "*";//printing stars
        }
        cout << endl;
    }
    return 0;
}//closing main