//第一套api接口
int socketclient_init(void **handle);
int socketclient_send(void *handle,unsigned char *buf,int len);
int socketclient_recv(void *handle,unsigned char *buf,int *len);
int socketclient_destory(void *handle);

//第二套api接口
int socketclient_init2(void **handle):
int socketclient_send2(void *handle,unsigned char *buf, int len);
int socketclient_recv2(void *handle,unsigned char **buf,int *len);
int socketclient_free(unsigned char **buf);
int socketclient_destory2(void **handle);

b)形参中的数组，编译器把它当做指针处理，CC

void fun(int a[]);//4字节
main()
{
	int a[]={1,2,3};//12个字节
	fun(a);
}
1)类型的本质：固定内存大小的别名
2）数据类型的作用：编译器预算对象（变量）分配的内存空间大小
int a;//告诉c编译器分配4个字节的内存
3）数据类型可以通过typedef起别名
4）可以通过sizeof()测类型大小
5）void数据类型（无类型，万能类型）
	a)如果函数没有返回值，必须用void修饰
	#ifdef __cplusplus
	extern"C"{
	
	#endif// __cplusplus
	
	//函数的声明
	
	#ifdef  __cplusplu
	}
	#endif // __cplusplus
	
变量本质：内存空间的别名
必须通过数据类型定义变量
变量相当于门牌号，内存相当于房间，通过门牌号找到房间，通过变量找到所对应的内存
变量的赋值 直接  间接
	
	int a;
	a=100;//直接赋值
	
	int *p=0;
	p ==a;//指针针对谁，就把谁的地址赋值给指针
	*p222;//间接赋值
	没有变量，哪来的内存，没有内存，哪里内存首地址
	5，变量三要素，名称，大小，作用域，变量的生命周期
	
	内存四区 栈区，堆区，全局区，代码区
	栈区：系统分配空间，系统自动回收，函数内部定义的变量，函数参数，函数结束，其内部变量声明周期结束
	堆区：程序员动态分配空间，由程序员手动释放，没有手动释放，分配的空间一直可用
	全局区（全局变量和静态比那辆，里面分初始化区和未初始化区，文字常量区，字符常量区）：整
	
栈区地址生长方向：地址由上往下递减
堆区地址生长方向：地址由下网上递增
数组buf,buf+1地址永远递增

函数调用模型
程序各个函数运行流程弹栈，入栈出战，现金周处
指针也是一种数据类型
指针变量也是一种变量，也有空间，32位程序大小位4个字节
int*p=0x1122*
*caozuo fu 8xiangadngyu yaoshi ,tongguo 8keyi zhaodao zhizheng suo zhixiang de neicun quyu 
int a =10;
int *p=NULL;
P=&A;//指针指向谁，就把谁的地址赋值给指针
*p=22;//*fang zuoian, gei neicun fuzhi ,xie neicun 
int b=*pl.//*fangzai zuobian ,qu neicun de zhi ,du neicun 

	
	