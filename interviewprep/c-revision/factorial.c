#include<stdio.h>

int factorial(int n){
	if(n>1){
		n=n*factorial(n-1);
	}
	else if(n=1){
		n=n*1;	
	}
return n;
}
int main(void){
	int x;
	printf("enter number : ");
	scanf("%d",&x);
	printf("%d\n",factorial(x));
}
