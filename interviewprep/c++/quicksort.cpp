#include<iostream>
using namespace std;
int partition(int a[],int l,int r){
	int pivot = a[r];
	int pIndex = -1;
	int n = sizeof(a)/sizeof(a[0]);
	for(int i=0;i<n;i++){
		if(a[i]<pivot){
			pIndex++;
		}
	}
}
void quick_sort(int a[],int l,int r){
	if(l<r){
		int pIndex = partition(a,l,r); 
		quicksort(a,l,pivot-1);
		quicksort(a,pivot+1,r);	
	}
}
void show(int a[],int n){
	for(int i=0;i<n;i++){
		cout<<a[i]<<"\t";
	}
}
int main(){
int arr[] = {5,1,6,3,7,2};
int size = sizeof(arr)/sizeof(arr[0]);
cout<<"input array: \n";
show(arr,size);
cout<<"\n";
cout<<"sorted array: \n";
int l = 0;
int r = size-1;
quick_sort(arr,l,r)
show(arr,size);
cin.get();
return 0;
}
