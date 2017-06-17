#include<iostream>
using namespace std;
int* insertion_sort(int a[],int size){
int key = a[0];
	for(int i=1;i<size;i++){
		if(a[i]<key){
			for(int j=0;j<i;j++){
				if(a[i]<a[j]){
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		else{
			key = a[i];
		}
	}
return a;
}
void show(int a[],int size){
for(int i=0;i<size;i++){
		cout<<a[i]<<"\t";
	}
}
int main(){
int a[] = {4,1,3,9,7};
int size = sizeof(a)/sizeof(a[0]);
cout<<"Input array: \n";
show(a,size);
cout<<"\n";
cout<<"Sorted array: \n";
show(insertion_sort(a,size),size);
cin.get();
return 0;
}
