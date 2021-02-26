import java.util.Scanner;
class FunctionTest3{
		public static void main(String[] args){
				Scanner sc =new Scanner(System.in);
				System.out.println("input firt");
				int a=sc.nextInt();
				System.out.println("input second:");
				int b=sc.nextInt();
				System.out.println("input third:");
				int c = sc.nextInt();
				int max =getMax(a,b,c);
				System.out.println("three biggest of it:"+max);		
		}
		public static int getMax(int a,int b,int c){
					int temp=((a>b)?a:b);
					int max =((temp>c)?temp:c);
					return max;
		}




}