/*
		��ϰ��
				����¼���������ݣ���ȡ�����������е�Uzi����
				����¼���������ݣ��Ƚ������������Ƿ��൱
*/
import java.util.Scanner;
class ScannerTest3{
			public static void main(String[]args){
					//����¼���������ݣ���ȡ�����������е����ֵ
					//��������¼�����
					Scanner sc =new Scanner(System.in);
					
					System.out.println("�������һ�����ݣ�");
					int a=sc.nextInt();
					System.out.println("������ڶ������ݣ�");
					int b=sc.nextInt();
					System.out.println("��������������ݣ�");
					int c=sc.nextInt();
					//��ȡ�����������е����ֵ
					int temp=((a>b)?a:b);
					int max=(temp>c?temp:c);
					System.out.println("max:"+max);
					System.out.println("----------");
					
					//����¼����������
					System.out.println("�������һ�����ݣ�");
					int x=sc.nextInt();
					
					System.out.println("������ڶ������ݣ�");
					int y=sc.nextInt();
					//�Ƚ������������Ƿ����
					boolean flag=(x==y);
					System.out.println("flag:"+flag);
					
					
				
			
			
			
			
			
			
			
			
			
			
			
			}







}				