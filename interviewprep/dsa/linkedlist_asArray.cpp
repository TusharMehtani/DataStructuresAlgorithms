#include<iostream>
using namespace std;

struct llist_array{
		int data;
		int next;
	};


void llist_arr_trav(int arr[],int size){
	int i=0;
	while(arr[i].next < size){
		if(arr[i].next >= 0){
			cout<<arr[i]<<"\n";
		}
		else{
			break;
		}
	}
}
void show(llist_array arr[],int size){
	for(int i=0;i<size;i++){
		cout<<arr[i]<<"\t";
	}
}
int main(){
	
	llist_array arr[5];
	int size = sizeof(arr)/sizeof(arr[0]);
	arr[0].data = 0;
	arr[0].next = 1;
	arr[1].data = 1;
	arr[1].next = 2;
	arr[2].data = 2;
	arr[2].next = 3;
	arr[3].data = 3;
	arr[3].next = 4;
	arr[4].data = 4;
	arr[4].next = -1;
	cout<<"\n";
	show(arr,size);
	cout<<"\n";
	llist_arr_trav(arr,size);

	cin.get();
	return 0;
}
