/*
		�������ͣ�Java��һ��ǿ���͵����ԣ����ÿһ�����ݶ���������ȷ���������͡�
		�������ͷ��ࣺ
				A:������������
				B�������������ͣ��࣬�ӿڣ���ֵ��
		
		�����������ͣ�4��8��
		   A:����                         ռ���ֽ���
		              byte         			1
					  short					2
					  int						4
					  long				 8
		   B:������
					 float 					4
					 double					8
		   C:�ַ�
					char					2
		  D:����
					boolean					1
		ע�⣺
					����Ĭ����int����
					������Ĭ����double���͡�
					
					�����ͺ�׺��L����l��ǡ�����ʹ��L��
					�����ȸ�������F����f��ǡ�����ʹ��F��
*/
class DataTypeDemo{
				public static void main(String[] args){
						//��������ĸ�ʽ��
						//�������� ������ =��ʼ��ֵ��
						
						//����һ���ֽڱ���
						byte b =10;
						System.out.println(10);
						System.out.println(b);
						//����һ�������α���
						short s =100;
						System.out.println(s);
						
						//����һ�����α���
						int i=1000;
						System.out.println(i);
						//������int�ķ�Χ
						//int j=1000000000000;
						long j=10000000000L;
						//LONG J =100L;
						System.out.println(j);
						//���帡�����ݱ���
						float f =12.3475F;
						System.out.println(f);
						double d =12.345F;
						System.out.println(d);
						//�����ַ�����
						char ch ='a';
						System.out.println(ch);
						//���岼������
						boolean flag=true;
						System.out.println(flag);				}
}					