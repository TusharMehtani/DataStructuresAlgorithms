#include <iostream>
using namespace std;
int f=0;
int factorial(int n){
	if(n>1){
		f=n*factorial(n-1);	
	}
	else if(n==1){
		f=n*1;	
	}
	else{
	}
return f;
}
int main(){
int x;
cout<<"enter the number whose factorial you wish to calculate: ";
cin>>x;
cin.ignore();
cout<<"\n";
factorial(x);
cout<<"factorial of "<<x<<" is "<<factorial(x)<<"\n";
cin.get();
return 0;
}
