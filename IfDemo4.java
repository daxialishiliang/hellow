/*
����if���ĵڶ��ָ�ʽ�ղ�Ҳ�������Ԫ���������ɵ�Ч����
���ԣ����Ǿ���Ϊ���ǿ������һ���Ĳ�zuo�������Ǿ�һ������û����mȡ
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
						System.out.println("100��һ��ż��");
				}else{
						System.out.println("100��һ������");
				}
		}
}