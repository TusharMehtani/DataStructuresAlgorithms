#include<stdio.h>
int main(void){
int i;
char string[10];
fgets(string,sizeof(string),stdin);
for(i=0;i<sizeof(string);i++){
if(string[i]=='\0'){	string[i]='\0';break;}
}
printf("%s\n",string);
}
