/*
    格式2：
	      数据类型[][]数组名=new 数据类型[m][];
		  m:表示这个二位数组有多少个以为数组。
		  列数没有给出，可以动态的给。这一次是一个变化的列数。
*/
class Array2Demo2{
		public static void main(String[]args){
		//定义数组
		int[][]arr=new int[3][];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		//动态的为每一个一维数组分配空间
		arr[0]=new int[2];
		arr[1]=new int[3];
		arr[2]=new int[1];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		}

}		  