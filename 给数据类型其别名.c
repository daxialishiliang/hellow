#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
typedef unsigned int u32;

//typedef和结构体结合使用
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
 
 /*VOID.无类型
 1，函数参数位空，定义函数时，可以用void修饰： int fun(void)
 2.函数没有返回值：void fun(void;
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
