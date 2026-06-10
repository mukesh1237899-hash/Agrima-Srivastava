#include <iostream>
using namespace std;
int main()
 {
    int rows = 5;
    for (int i = 1; i <= rows; i++) 
    {
        for (int j = 1; j <= rows - i; j++) 
        {
            cout << " ";// Printing spaces
        }
        for (int j = 1; j <= i; j++) 
        {
            cout << j; // Printing ascending numbers
        }
        for (int j = i - 1; j >= 1; j--) 
        {
            cout << j;// Printing descending numbers
        }
        cout << endl;
    }
    return 0;
}