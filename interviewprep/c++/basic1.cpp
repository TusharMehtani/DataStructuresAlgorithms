#include <iostream>
using namespace std;
int main(){
int a;
cout<<"enter a number";
cin>>a;
cin.ignore();
cout<<"you have entered: "<<a<<"\n";
cin.get();
return 0;
}
