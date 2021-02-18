class Array2Test2{
		public static void main(String[]args){
		        //把数据用二维数组来表示
				int[][] arr={{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
				//定义一个求和变量sum,0.
				int sum =0;
				//通过遍历就可以得到每一个二位数组的元素。
				for(int x=0;x<arr.length;x++){
						for(int y=0;y<arr[x].length;y++){
								//把元素累加即可。
								sum +=arr[x][y];
						}
						}
						//最后输出sum,就是结果。
						System.out.println("一年的销售额为："+sum+"万元");
		
		
		
		
		
		}




}