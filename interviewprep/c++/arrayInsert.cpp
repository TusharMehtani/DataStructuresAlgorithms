#include<iostream>
using namespace std;

void insert(int a[],int n,int pos,int size){
	for(int i=size-1;i>=pos;i--){
		a[i+1] = a[i];
	}
	a[pos] = n;
}
void show(int a[],int n){
	for(int i=0;i<n;i++){
		cout<<a[i]<<"\t";
	}
}
int main(){
int a[] = {12,13,15,16,17};
int size = sizeof(a)/sizeof(a[0]);
cout<<"The input array is: \n";
show(a,size);
int n = 14;
int pos = 2;
cout<<"\nElement to be inserted is: "<<n<<" at position: "<<pos;
cout<<"\nArray after the insertion operation:\n";
insert(a,n,pos,size);
size++;
show(a,size);
cin.get();
return 0;
}

