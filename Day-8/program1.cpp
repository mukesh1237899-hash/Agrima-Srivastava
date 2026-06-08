#include <iostream>
using namespace std;
int main() 
{//opening main
    int r;//initialising variables
    cout<<"enter number of rows";
    cin>>r;//Taking input from user
    for (int i = 1; i <= r; i++)
    {//OPENING FOR LOOP
        for (int j = 1; j <= i; j++)
         {//opening for loop
            cout << "* ";
        }//closing for loop
        cout<<endl;
    }//CLOSING FOR LOOP
    return 0;
}//closing main