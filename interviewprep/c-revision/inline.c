#include <stdio.h>
inline int square(int x){return x*x;}
//#define square(x) x*x
int main(void){
int x = 36/square(6);
printf("%d\n",x);
return 0;
}
