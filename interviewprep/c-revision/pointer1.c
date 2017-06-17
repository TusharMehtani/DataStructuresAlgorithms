#include<stdio.h>
int main(void){
int v[3] = {1,2,3};
int *ptr;
ptr = &v[0];
int i;
for(i=0;i<3;i++){
printf("%d\n",*ptr);
printf("%p\n",ptr);
*ptr++;
} 
}
