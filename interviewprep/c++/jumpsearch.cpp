#include<iostream>
#include<math.h>
using namespace std;
int jump_sort(int arr[],int m, int size,int x){
int k = 1;
while(k*m<=size){
	if(arr[(k)*m]<x && x<arr[(k+1)*m]){
		for(int i=0;i<m;i++){
			return k*m + i; 
		}
	}
	if(arr[k*m]==x){
		return k*m;
	}
	k++;
}
}
int main(){
int arr[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
int size = sizeof(arr)/sizeof(arr[0]);
int m = sqrt(size);
int x = 610;
cout<<jump_sort(arr,m,size,x);
cin.get();
return 0;
}
