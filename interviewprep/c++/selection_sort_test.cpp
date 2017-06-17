#include<iostream>
using namespace std;

void selection_sort(int a[],int n){
int temp;
	
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			if(a[i]>a[j]){
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;			
			}
		}
	}
}
void show(int a[],int n){

	for(int i=0;i<n;i++){
		cout<<a[i]<<"\t";
	}
}
int main(){
int a[] = {2,7,4,1,5,3};
int size = sizeof(a)/sizeof(a[0]);
cout<<"Input unsorted array: \n";
show(a,size);
cout<<"\nSorted array: \n";
selection_sort(a,size);
show(a,size);
cin.get();
return 0;
}
