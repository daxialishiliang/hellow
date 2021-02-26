import java.util.Scanner;

class FunctionTest{
		public static void main(String[] args){
				Scanner sc =new Scanner(System.in);
				System.out.println("input first date:");
				int a= sc.nextInt();
				System.out.println("input second date:");
				int b =sc.nextInt();
				int result=getMax(a,b);
				System.out.println("biggest:"+result);
		
		
		}
		public static int getMax(int a,int b){return((a>b)? a:b);}
				




}