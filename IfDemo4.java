/*
由于if语句的第二种格式刚才也完成了三元运算可以完成的效果。
所以，我们就认为他们可以完成一样的槽zuo但是他们就一袋区别没有了m取
*/
class IfDemo4{
		public static void main(String[]args){
				int a=10;
				int b=20;
				int max;
				if (a>b){
						max=a;
				}else{
						max=b;
				}
				System.out.println("max:"+max);
				
				int max2=(a>b)?a:b;
				System.out.println("max2:"+max2);
				System.out.println("---------");
				int x=100;
				if(x%2 ==0){
						System.out.println("100是一个偶数");
				}else{
						System.out.println("100是一个奇数");
				}
		}
}