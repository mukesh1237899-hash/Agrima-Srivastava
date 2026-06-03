#include<iostream>
using namespace std;
int main()
{//opening main
    int n,c=0;//intialising variable
    cout<<"enter number";
    cin>>n;//taking input from keyboard
    for(int i=1;i<=n;i++)//checking whether prime number or not
    {//opening for loop
        if(n%i==0)
        c++;//counting number of digits
    }//closing for loop
    //result
if(c==2)
cout<<n<<" is prime number";
else
cout<<n<<" is not prime number";
return 0;
}//closing main