class Array2Test2{
		public static void main(String[]args){
		        //�������ö�ά��������ʾ
				int[][] arr={{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
				//����һ����ͱ���sum,0.
				int sum =0;
				//ͨ�������Ϳ��Եõ�ÿһ����λ�����Ԫ�ء�
				for(int x=0;x<arr.length;x++){
						for(int y=0;y<arr[x].length;y++){
								//��Ԫ���ۼӼ��ɡ�
								sum +=arr[x][y];
						}
						}
						//������sum,���ǽ����
						System.out.println("һ������۶�Ϊ��"+sum+"��Ԫ");
		
		
		
		
		
		}




}