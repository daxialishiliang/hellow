//��һ��api�ӿ�
int socketclient_init(void **handle);
int socketclient_send(void *handle,unsigned char *buf,int len);
int socketclient_recv(void *handle,unsigned char *buf,int *len);
int socketclient_destory(void *handle);

//�ڶ���api�ӿ�
int socketclient_init2(void **handle):
int socketclient_send2(void *handle,unsigned char *buf, int len);
int socketclient_recv2(void *handle,unsigned char **buf,int *len);
int socketclient_free(unsigned char **buf);
int socketclient_destory2(void **handle);

b)�β��е����飬��������������ָ�봦��CC

void fun(int a[]);//4�ֽ�
main()
{
	int a[]={1,2,3};//12���ֽ�
	fun(a);
}
1)���͵ı��ʣ��̶��ڴ��С�ı���
2���������͵����ã�������Ԥ����󣨱�����������ڴ�ռ��С
int a;//����c����������4���ֽڵ��ڴ�
3���������Ϳ���ͨ��typedef�����
4������ͨ��sizeof()�����ʹ�С
5��void�������ͣ������ͣ��������ͣ�
	a)�������û�з���ֵ��������void����
	#ifdef __cplusplus
	extern"C"{
	
	#endif// __cplusplus
	
	//����������
	
	#ifdef  __cplusplu
	}
	#endif // __cplusplus
	
�������ʣ��ڴ�ռ�ı���
����ͨ���������Ͷ������
�����൱�����ƺţ��ڴ��൱�ڷ��䣬ͨ�����ƺ��ҵ����䣬ͨ�������ҵ�����Ӧ���ڴ�
�����ĸ�ֵ ֱ��  ���
	
	int a;
	a=100;//ֱ�Ӹ�ֵ
	
	int *p=0;
	p ==a;//ָ�����˭���Ͱ�˭�ĵ�ַ��ֵ��ָ��
	*p222;//��Ӹ�ֵ
	û�б������������ڴ棬û���ڴ棬�����ڴ��׵�ַ
	5��������Ҫ�أ����ƣ���С�������򣬱�������������
	
	�ڴ����� ջ����������ȫ������������
	ջ����ϵͳ����ռ䣬ϵͳ�Զ����գ������ڲ�����ı����������������������������ڲ������������ڽ���
	����������Ա��̬����ռ䣬�ɳ���Ա�ֶ��ͷţ�û���ֶ��ͷţ�����Ŀռ�һֱ����
	ȫ������ȫ�ֱ����;�̬������������ֳ�ʼ������δ��ʼ���������ֳ��������ַ�������������
	
ջ����ַ�������򣺵�ַ�������µݼ�
������ַ�������򣺵�ַ�������ϵ���
����buf,buf+1��ַ��Զ����

��������ģ��
������������������̵�ջ����ջ��ս���ֽ��ܴ�
ָ��Ҳ��һ����������
ָ�����Ҳ��һ�ֱ�����Ҳ�пռ䣬32λ�����Сλ4���ֽ�
int*p=0x1122*
*caozuo fu 8xiangadngyu yaoshi ,tongguo 8keyi zhaodao zhizheng suo zhixiang de neicun quyu 
int a =10;
int *p=NULL;
P=&A;//ָ��ָ��˭���Ͱ�˭�ĵ�ַ��ֵ��ָ��
*p=22;//*fang zuoian, gei neicun fuzhi ,xie neicun 
int b=*pl.//*fangzai zuobian ,qu neicun de zhi ,du neicun 

	
	