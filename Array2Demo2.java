/*
    ��ʽ2��
	      ��������[][]������=new ��������[m][];
		  m:��ʾ�����λ�����ж��ٸ���Ϊ���顣
		  ����û�и��������Զ�̬�ĸ�����һ����һ���仯��������
*/
class Array2Demo2{
		public static void main(String[]args){
		//��������
		int[][]arr=new int[3][];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		//��̬��Ϊÿһ��һά�������ռ�
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