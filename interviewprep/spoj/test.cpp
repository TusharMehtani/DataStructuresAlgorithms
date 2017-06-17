#include<iostream>
using namespace std;
void show(int a){
	cout<<a<<"\n";
}
int main(){
int a;
	while(1){
		cin>>a;
		if(a!=42){
			show(a);
		}
		else{
			break;
		}
	}
	
cin.get();
return 0;
}
