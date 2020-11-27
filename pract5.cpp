#include <iostream>
using namespace std;

//Compiler version g++ 6.3.0

int main()
{
   int a, b,c;
   cout<<"Enter three number: ";
   cin>>a>>b>>c;
   if((a>=b)&&(a>=c))
     cout<<"largest number: "<<a;
   else if((b>=a)&&(b>=c))
     cout<<"largest number: "<<b;
   else
     cout<<"largest number: "<<c;
   return 0;
}