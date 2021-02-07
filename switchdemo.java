import java.util.Scanner;
class SwitchDemo{
		public static void main(String[]args){
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入一个数据（1-7）：");
			int week =sc.nextInt();//3
			//switch判断语句
			switch(week){
					case 1:
							System.out.println("星期一");
							break;
					case 2:
							System.out.println("星期二");
							break;
					case 3:
							System.out.println("星期三");
							break;
					case 4:
							System.out.println("星期四");
							break;
					
					default:
							System.out.println("你输入的数据有误");
							break;
						
							
			}
		
		
		
		}
}