#include<iostream>
#include<algorithm>
using namespace std;
void show(int x[],int size){
	for(int i=0;i<size;i++){
		cout<<"\t"<<x[i];
	}
}
int main(){
int a[10]={5,1,7,9,10,3,2,6,4,8};
int size = sizeof(a)/sizeof(int);
cout<<"\ninput array: ";
show(a,size);
cout<<"\nsorted array: ";
sort(a,a+size);
show(a,size);
cout<<"\nLet us see if the array contains 40";
if(binary_search(a,a+size,40))
cout<<"\nYes, array contains 40";
else
cout<<"\nNo, array does not contain 40";
cout<<"\nLets us see if the array contains 3";
if(binary_search(a,a+size,3))
cout<<"\nYes, array contains 3";
else
cout<<"\nNo, array does not contain 3";
cin.get();
}
