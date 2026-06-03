<<<<<<< HEAD
#include <iostream>
using namespace std;
int main()
{//opening main
int n,num,sum=0,d;//initialising variables
    cout << "Enter a number: ";
    cin >> n;//taking input from keyboard
    num= n;
    while (num> 0)
    {//opening while loop
        d = num % 10;
        sum = sum + (d*d*d);
        num = num / 10;
    }//closing while loop
    if (sum == n)//applying conditions for armstrong number
        cout << n << " is an Armstrong number.";
    else
        cout << n << " is not an Armstrong number.";
    return 0;
=======
#include<iostream>
using namespace std;
int main()
{//opening main
    int n,c=0,num,d,sum=0,p=1,no;//initialising variables
        cout<<"ENTER NUMBER:";
    cin>>n;//taking input from keyboard
    num=n;
    no=n;
    while(n!=0)
    {//opening while loop
        n=n/10;
        c++;//calculating number of digits
    }//closing while loop
    while(num!=0)
    {//opening while loop
        d=num%10;
        for(int i=1;i<=c;i++)
        {//opening for loop
            p=p*d;
        }//closing for loop
        sum=sum+p;
        num=num/10;
        p=1;
    }//closing while loop
if(no==sum)//CHECKING WHETHER INPUT NUMBER IS ARMSTRONG OR NOT
cout<<no<<" IS ARMSTRONG NUMBER";
else
cout<<no<<" IS NOT ARMSTRONG NUMBER";
return 0;
>>>>>>> 19237b1 (update files)
}//closing main