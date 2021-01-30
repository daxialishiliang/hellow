/*
	键盘录入联系：
				键盘录入两个数据，病对着两个数据求个，输出其结果
*/
import java.util.Scanner;		

class ScannerTest{
		public static void main (String[]args){
					//键盘录入两个数据，并对这两个数据求和，输出其结果
					//创建键盘录入对象
					Scanner sc =new Scanner(System.in);
					System.out.println("first num.：");
					int x =sc.nextInt();
					
					System.out.println("请输入第二个数据：");
					int y=sc.nextInt();
					
					//把键盘录入的数据进行相加即可
					int sum=(x+y);
					System.out.println("sum:"+sum);
					
					}
}
		
	 