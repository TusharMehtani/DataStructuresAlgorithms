//this is regarding pointer to const. Compare this code with pointer2.c
#include<stdio.h>
int main(void){
const int i=10;
int j=20;
int const *ptr;
ptr = &i;
printf("value of i: %d",*ptr);
printf("address of i: %p",ptr);
ptr = &j;
printf("value of j: %d",*ptr);
printf("address of j: %p",ptr);
//*ptr=100; //this line gives error as *ptr is const and hence is declared in read only location.
printf("value of j: %d",*ptr);
printf("address of j: %p",ptr);
}
