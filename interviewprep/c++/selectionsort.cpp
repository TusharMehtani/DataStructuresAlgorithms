#include<iostream>
using namespace std;
int* selection_sort(int arr[],int size){
	int temp;
	for(int i=0;i<size;i++){
		for(int j=i+1;j<size;j++){
			if(arr[j]<arr[i]){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}	
	}
	return arr;
}
void show(int a[],int n){
cout<<"\n";
	for(int i=0;i<n;i++){
		cout<<"\t"<<a[i];
	}
}
int main(){
int arr[] ={14,33,27,10,35,19,42,44};
int size = sizeof(arr)/sizeof(arr[0]);
show(selection_sort(arr,size),size);
cin.get();
return 0;
}
