#include <iostream>
using namespace std;
int main()
 {//opening main
    int r= 5;
    for (int i = 1; i <= r; i++) 
    {
        for (int j = 1; j <= r - i; j++) 
        {
            cout << " ";//printing spaces
        }
        for (int j = 0; j < i; j++) 
        {
            cout << char('A' + j);//printing ascending characters
        }
        for (int j = i - 2; j >= 0; j--) 
        {
            cout << char('A' + j);//printing decending characters
        }
        cout << endl;
    }
    return 0;
}//closing main