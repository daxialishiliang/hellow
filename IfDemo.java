/*
			选择结构
					if语句
					switch语句
			
			if语句：
					格式1
					格式2
					格式3
			if语句的格式：
					if（比较表达式）{
							预聚体；
					}
					执行流程：
							先计算比较表达式的值，看其返回值是truehaishi false.
							如果是true，就执行预聚体。
							如果是false，就不执行预聚体。
*/
class IfDemo{
		public static void main(String[]args){
				int x=10;
				if(x==10){
						System.out.println("x等10");
				}
				if(x==20){
						System.out.println("x等于20");
				}
				System.out.println("over");
		}
}							