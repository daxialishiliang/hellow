import java.util.Scanner;
class FunctionTest2{
		public static void main(String[] args){
				Scanner sc =new Scanner(System.in);
				System.out.println("input first date:");
				int a=sc.nextInt();
				System.out.println("input second dates:");
				int b=sc.nextInt();
				boolean flag=compare(a,b);
				System.out.println(flag);		
		
		}
		public static boolean compare(int a,int b){
				return a==b;
		}




}