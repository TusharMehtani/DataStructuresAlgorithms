#include<iostream>
using namespace std;
void merge(int a[],int l,int m,int r){
	int L[m-l+1];
	int R[r-m];
	int sizeL = sizeof(L)/sizeof(L[0]);
	int sizeR = sizeof(R)/sizeof(R[0]);
	int i,j,k; 
	for(int i=0;i<sizeL;i++){
		L[i] = a[l+i];
	}
	for(int j=0;j<sizeR;j++){
		R[j] = a[j+1+m];
	}
	i=0;
	j=0;
	k=1;
	while(i<sizeL && j<sizeR){
		if(L[i]<=R[j]){
			a[k] = L[i];
			i++;
		}
		else{
			a[k] = R[j];
			j++;
		}
		k++;
	}
	while(i<sizeL){
		a[k] = L[i];
		i++;
		k++;
	}
	while(j<sizeR){
		a[k] = R[j];
		j++;
		k++;
	}
}
void mergesort(int a[],int l,int r){
	if(l<r){
		int m = l + (r-l)/2;
		mergesort(a,l,m);
		mergesort(a,m+1,r);
		merge(a,l,m,r);
	}
}
void show(int a[], int n){
	for(int i=0;i<n;i++){
		cout<<a[i]<<"\t";
	}
}
int main(){
int a[] = {4,1,3,9,7};
int size = sizeof(a)/sizeof(a[0]);
cout<<"Input array: \n";
show(a,size);
cout<<"\n";
cout<<"sorted array: \n";
int l = 0;
int r = size-1;
mergesort(a,l,r);
show(a,size);
cin.get();
return 0;
}
