#include<stdio.h>
#include<string.h>
char *strip_newline(char *str,int size){
	int i;
	for(i=0;i<size;i++)
		{
			if(str[i]=='\n')
			{
				str[i]='\0';
				return str;	
			}
		}
}
int main(void){
	char firstname[50];
	char lastname[50];
	char fullname[100];
	printf("Enter your firstname: \n");
	fgets(firstname,sizeof(firstname),stdin);
	strip_newline(firstname,sizeof(firstname));
	printf("enter your lastname: \n");
	fgets(lastname,sizeof(lastname),stdin);
	strip_newline(lastname,sizeof(lastname));
	fullname[0]='\0';
	//printf("your fullname is %s\n",strip_newline(strcat((strcat(fullname,firstname)),lastname),sizeof(fullname)));
	printf("your fullname is %s\n",strcat((strcat(fullname,firstname)),lastname));
return 0;
}
