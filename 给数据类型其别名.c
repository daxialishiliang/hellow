#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
typedef unsigned int u32;

//typedef�ͽṹ����ʹ��
struct MyStruct
{
	int a;
	int b;
	
 } ;
 
 typedef struct MyStruct2
 {
 		int a;
 		int b;
 	
 }TMP;
 
 /*VOID.������
 1����������λ�գ����庯��ʱ��������void���Σ� int fun(void)
 2.����û�з���ֵ��void fun(void;
 3,buneng queding void leixing de put0ng bianliang :void a;//err,wufa queding leixng ,butong leixing fenpei kongjian buyiyang 
 4,keyi dingyi void *bianliang :void *p;//ok,32yongyuan 4zijie ,64yongyuan 8zijie 
 5,hsuju leixing benzhi ,guding neicunkuai daxiao biejming 
 void *wanneng zhizhen ,hanshu fanhuizhi ,hanshu canshu 
 */
  int main (void)
  {
  	
  	         u32 t;//unsigned int 
  	         //dingyi jiegouti bianliang ,yiding yao jiashang struct gukeyworrdkls
  	         struct MyStruct m1;
  	         //MyStruct m2;//err
  	         
  	         TMP m3;
  	         struct MyStruct2 m4;
  	         
  	         char buf[1024];
  	         strcpy(buf,"11111111");
  	         
  	         printf("\n");
  }
