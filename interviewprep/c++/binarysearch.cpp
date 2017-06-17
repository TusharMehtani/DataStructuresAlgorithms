#include<iostream>
#include<algorithm>
using namespace std;

int bin_search(int A[], int left, int right, int k)
{
    if(left<=right){
        int mid = left + (right-left)/2;
        if(k>A[mid]){
            return bin_search(A,mid+1,right,k);
        }
        if(k==A[mid]){
            return mid;
        }
        if(k<A[mid]){
            return bin_search(A,left,mid-1,k);
        }
    }
    return -1;
}

int main(){
int arr[] ={12,56,23,45,20,24,77,1,9,89}; //given integer array
int size=sizeof(arr)/sizeof(arr[0]); //size of the array
int x; //element to be searched
x=77;
sort(arr,arr+size);//sorted array
cout<<"\n";
int low = 0;
int high = size-1;
cout<<"\n";
cout<<bin_search(arr,low,high,x);
cin.get();
return 0;
}
