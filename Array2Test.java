class Array2Test {
        public static void main(String[]args){
		int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
		for(int x=0;x<arr[0].length;x++){
					System.out.println(arr[0][x]);
		}
		System.out.println("--------------------");
		for(int x=0;x<arr[1].length;x++){
					System.out.println(arr[1][x]);
		}
		System.out.println("-----------------");
		for(int x=0;x<arr[2].length;x++){
				System.out.println(arr[2][x]);
		}
		System.out.println("-----------------");
		
		//用循环改进
		for (int x=0;x<3;x++){
				for(int y=0;y<arr[x].length;y++){
						System.out.print(arr[x][y]+"");
				}
				System.out.println();
		
		}
		System.out.println("----------------------");
		
		for(int x=0;x<arr.length;x++){
				for(int y=0;y<arr[x].length;y++){
						System.out.print(arr[x][y]+"");
				}
				System.out.println();
		
		}
		System.out.println("-------------------");
		    //用方法改进
			//调用方法
			PrintArray2(arr);
			System.out.println("------------------");
			//我们再来一个数列是变化的
			
		
		
		
		
		
		
		
		
		
		
		
		
		}
































}