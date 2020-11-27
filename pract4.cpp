#include <iostream>
using namespace std;

//Compiler version g++ 6.3.0

int main()
{
   int n ;
   cout<<"Enter the number: ";
   cin>>n;
   if(n%2==0)
      cout<<n<<" is even";
   else 
      cout<<n<<" is odd";
   return 0;
}