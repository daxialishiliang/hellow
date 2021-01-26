/* 
		不同进程的数据表现：
				二进制：由0,1组成。以0b开头。
				八进制：由0,1，.....7组成。以0开始。
				十进制：由0.1.、、、9组成。默认整数是十进制。
				十六进制：由0，1，，，。。。。9，a,b,b,d,e,f,g(大小写均可)组成。以0开头。
*/
class JinZhiDemo{
		public static void main (String[]args){
				System.out.println(100);//十进制
				System.out.println(0b100);//二进制
				System.out.println(0100);//八进制
				System.out.println(0x100);//十六进制
		}

}				