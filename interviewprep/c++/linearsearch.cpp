#include<iostream>
using namespace std;
int search(int a[],int size,int x){
	for(int i=0;i<size;i++){
		if(a[i]==x){
		return i;		
		}
	}
return -1;
}
int main(){
int arr[] ={12,56,23,45,20,24,77,1,9,89}; //given integer array
int size=sizeof(arr)/sizeof(arr[0]); //size of the array
int x; //element to be searched
x=77;
cout<<search(arr,size,x);
cin.get();
return 0;
}
