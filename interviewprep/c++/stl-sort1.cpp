#include<iostream>
#include<algorithm>
using namespace std;
void show(int x[]){
	for(int i=0;i<10;i++){
		cout<<"\t"<<x[i];	
	}
}
int main(){
	int a[10] = {1,5,2,8,3,4,9,6,10,7};
	cout<<"\nunsorted array of integers: ";	
	show(a);
	cout<<"\nsorted array of integers: ";
	sort(a,a+10);
	show(a);
	cin.get();
	return 0;
}
