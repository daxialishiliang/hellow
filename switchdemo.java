import java.util.Scanner;
class SwitchDemo{
		public static void main(String[]args){
			Scanner sc=new Scanner(System.in);
			System.out.println("������һ�����ݣ�1-7����");
			int week =sc.nextInt();//3
			//switch�ж����
			switch(week){
					case 1:
							System.out.println("����һ");
							break;
					case 2:
							System.out.println("���ڶ�");
							break;
					case 3:
							System.out.println("������");
							break;
					case 4:
							System.out.println("������");
							break;
					
					default:
							System.out.println("���������������");
							break;
						
							
			}
		
		
		
		}
}