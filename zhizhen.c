#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main (void)
{
		int *p=0x111111;
		char ***********q=0x11;
		print("sizeof(p)=%d,sizeof(q)%d\n",sizeof(p),sizeof(q));
		
				int a=100;
				int *p1=NULL;
				//ָ��ָ��˭���Ͱ�˭�ĵ�ַ��ֵ��ָ��
				p1=&a;
				//*Կ�ף�ͨ��*�����ҵ�ָ��ָ����ڴ����򣬲���������ѵ
				*p1=22;
				//*����=��ߣ����ڴ渳ֵ��д�ڴ�
				//*����=�ұߣ�ȡ�ڴ��ֵ��������
				int b=*p1;
				printf("b=%d\n",b);
				
				printf("\n");
				system("pause");
				return 0;
}
