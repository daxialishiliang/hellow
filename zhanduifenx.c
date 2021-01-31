#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<string.h>

char *get_str()
{
	char str[]="abcdedsgads";//Õ»Çø
	printf("str=%s\n",str);
	
	return str; 
}
char *get_str2()
{
	char *tmp=(char*)malloc(100);
	if(tmp==NULL)
	{
		return NULL;
	}
	
	strcpy(tmp,"adsagladskl");
	return tmp;
}

int main(void)
{
	char buf[128]={0};
	//strcpy(buf,get_star());
	//printf("buf=%s\n",buf);
	
	char *p=NULL;
	p=get_str2();
	if(p!=NULL)
	{
		printf("p=%s\n",p);
		
		free(p);
		p=NULL;
		if(p!=NULL)
		{
			free(p);
		}
	
	}
    printf("\n");
    system("pause");
    return 0;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
