/*
	����¼���·ݵ�ֵ�������Ӧ�ļ��ڡ�
	��  3,4��5
	��  6,7,8
	��  9,10,11
	��  12,1,2
	������
			A������¼���·ݵ�ֵ����������Ҫʹ��Scanner.
			B:����Ӧ���ж�����·����Ǹ����ڣ�������ж����Ƚ϶࣬���ԣ���if yuju geshi 3.
			if����ʹ�ó�����
						A����Ա���ʽ��һ��boolean leixing de �ж�Ŷ��
						BA;zhendui yige fanwei de panduan 
*/
import java.util.Scanner;
class IfTest3{
	public static void main(String[]args){
			//��������¼�����
			Scanner sc =new Scanner(System.in);
			//¼������
			System.out.println("��������һ���·ݣ�");
			int month=sc.nextInt();
			//�����ָ�ʽʵ�ּ���
			if(month<1||month>12){
					System.out.println("��������·�����");
			}else if(month ==1){
					System.out.println("����");
			}else if(month ==2){
					System.out.println("����");
			}else if(month==3){
					System.out.println("����");
			}else if(month==4){
					System.out.println("����");
			}else if (month==5){
					System.out.println("����");
			}else if (month==6){
					System.out.println("�ļ�");
			}else if (month==7){
					System.out.println("�ļ�");
			}else if (month==8){
					System.out.println("�ļ�");
			}else if (month==9){
					System.out.println("�＾");
			}else if (month ==10){
					System.out.println("�＾");
			}else if (month ==11){
					System.out.println("����");
			}
			System.out.println("--------------");
			//�������ȷʵ�Ƿ��������ǵ����󣬵��Ǿ��ǿ������Ƚ��鷳
			//��ô�������ܲ����ع��Ľ�һ���أ�
			
			if(month<1||month>12){
					System.out.println("��������·�����");
			}else if(month==3||month==4||month==5){
					System.out.println("����");
			}else if (month==6||month==7||month==8){
					System.out.println("�ļ�");
			}else if(month==9||month==10||month==11){
					System.out.println("�＾");
			}else{
					System.out.println("����");
			}
	        System.out.println("--------------");
	        if(month<1||month>12){
					System.out.println("��������·�����");
			}else if(month>=3&&month<=5){
					System.out.println("����");
			}else if(month>=6&&month<=8){
					System.out.println("�ļ�");
			}else if(month>=9&&month<=11){
					System.out.println("�＾");					
			}else{
					System.out.println("����");
			}
	        System.out.println("----------------");
	
	
	}
}						