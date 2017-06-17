#include<iostream>
using namespace std;

void bubble_sort(int a[],int n){
	for(int i=0;i<n-1;i++){
		int flag = 0;
		for(int k=0;k<n-1;k++){
			if(a[k]>a[k+1]){
				int temp = a[k];
				a[k] = a[k+1];
				a[k+1] = temp;
				flag = 1;
			}
		}
	if(flag==0){
		break;
	}
	}
}
void show(int a[],int n){
	for(int i=0;i<n;i++){
		cout<<a[i]<<"\t";
	}
}
int main(){
int a[] = {2,7,1,4,5,3};
int size = sizeof(a)/sizeof(a[0]);
cout<<"Input unsorted array: \n";
show(a,size);
cout<<"\nSorted array: \n";
bubble_sort(a,size);
show(a,size);
cin.get();
return 0;
}
