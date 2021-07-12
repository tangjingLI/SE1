/**
 * 矩阵类，实现矩阵的加法，矩阵乘法，点乘以及转置方法
 * 其中加法和点乘方法需要有两种实现方式
 * 1.传入一个MyMatrix对象进行2个矩阵的操作
 * 2.从控制台（console）读入一个矩阵数据，再进行操作
 * 所有的数据均为int型
 * 输入数据均默认为正确数据，不需要对输入数据进行校验
 * @author Ray Liu & Qin Liu
 *
 */
import java.util.Scanner;
public class MyMatrix {
	private int[][] data;
	
	/**
	 * 构造函数，参数为2维int数组
	 * a[i][j]是矩阵中的第i+1行，第j+1列数据
	 * @param a
	 */
	public MyMatrix(int[][] a){
		this.data = a;
	}

	public int[][] getData() {
		return data;
	}

	/**
	 * 实现矩阵加法，返回一个新的矩阵
	 * @param B
	 * @return
	 */
	public MyMatrix plus(MyMatrix B){
		MyMatrix my=new MyMatrix(new int[0][0]);
		if(data.length==0) {
			my.data=new int[0][0];
			return my;
		}
		int[][] b=B.getData();
		int[][] plus1=new int[data.length][data[0].length];
		for(int i=0;i<data.length;i++){
			for(int j=0;j<data[0].length;j++){
				plus1[i][j]=data[i][j]+b[i][j];
			}
		}
		my.data=plus1;
		return  my;
	}

	
	/**
	 * 实现矩阵乘法，返回一个新的矩阵
	 * @param B
	 * @return
	 */

	public MyMatrix times(MyMatrix B){
		MyMatrix my=new MyMatrix(new int[0][0]);
		if(data.length==0) {
			my.data=new int[0][0];
			return my;
		}
		int[][] b=B.getData();
		int[][] time1=new int[data.length][b[0].length];
		for(int i=0;i<data.length;i++){
			for(int j=0;j<b[0].length;j++){
				time1[i][j]=0;
				for(int k=0;k<data[0].length;k++){
					time1[i][j]+=data[i][k]*b[k][j];
				}
			}
		}
		my.data=time1;
		return my;
	}
	
	/**
	 * 实现矩阵的点乘，返回一个新的矩阵
	 * @param b
	 * @return
	 */

	public MyMatrix times(int b){
		MyMatrix my=new MyMatrix(new int[0][0]);
		if(data.length==0) {
			my.data=new int[0][0];
			return my;
		}
		int[][] time2=new int[data.length][data[0].length];
		for(int i=0;i<data.length;i++){
			for(int j=0;j<data[0].length;j++){
				time2[i][j]=b*data[i][j];
			}
		}
		my.data=time2;
	return  my;
	}

	/**
	 * 实现矩阵的转置，返回一个新的矩阵
	 * @return
	 */

	public MyMatrix transpose(){
		MyMatrix my=new MyMatrix(new int[0][0]);
		if(data.length==0) {
			my.data=new int[0][0];
			return my;
		}
		int[][]tran=new int[data[0].length][data.length];
		for(int i=0;i<data.length;i++){
			for(int j=0;j<data[0].length;j++){
				tran[i][j]=data[j][i];
			}
		}
		my.data=tran;
		return my;
	}

	/**
	 * 从控制台读入矩阵数据，进行矩阵加法，读入数据格式如下：
	 * m n
	 * m * n 的数据方阵，以空格隔开
	 * example:
	 * 4 3
	 * 1 2 3 
	 * 1 2 3
	 * 1 2 3
	 * 1 2 3
	 * 返回一个新的矩阵
	 * @return
	 */

	public MyMatrix plusFromConsole(){
		MyMatrix my=new MyMatrix(new int[0][0]);
		if(data.length==0) {
			my.data=new int[0][0];
			return my;
		}
		Scanner scan=new Scanner(System.in);
		int c,d;
		c=scan.nextInt();
		d=scan.nextInt();
		int[][]b=new int[c][d];
		for(int m=0;m<c;m++){
			for(int n=0;n<d;n++){
				b[m][n]=scan.nextInt();
			}
		}
		int[][] plus2=new int[data.length][data[0].length];
		for(int i=0;i<data.length;i++){
			for(int j=0;j<data[0].length;j++){
				plus2[i][j]=data[i][j]+b[i][j];
			}
		}
		my.data=plus2;
		return  my;
	}

	/**
	 * 输入格式同上方法相同
	 * 实现矩阵的乘法
	 * 返回一个新的矩阵
	 * @return
	 */

	public MyMatrix timesFromConsole(){
		MyMatrix my=new MyMatrix(new int[0][0]);
		if(data.length==0) {
			my.data=new int[0][0];
			return my;
		}
		Scanner scan=new Scanner(System.in);
		int c,d;
		c=scan.nextInt();
		d=scan.nextInt();
		int[][]b=new int[c][d];
		for(int m=0;m<c;m++){
			for(int n=0;n<d;n++){
				b[m][n]=scan.nextInt();
			}
		}
		int[][] time3=new int[data.length][b[0].length];
		for(int i=0;i<data.length;i++){
			for(int j=0;j<b[0].length;j++){
				time3[i][j]=0;
				for(int k=0;k<data[0].length;k++){
					time3[i][j]+=data[i][k]*b[k][j];
				}
			}
		}
		my.data=time3;
		return my;
	}

	/**
	 * 打印出该矩阵的数据
	 * 起始一个空行，结束一个空行
	 * 矩阵中每一行数据呈一行，数据间以空格隔开
	 * example：
	 * 
	 * 1 2 3
	 * 1 2 3
	 * 1 2 3
	 * 1 2 3
	 * 
	 */

	public void print(){
		System.out.println("");
		for(int i=0;i<data.length;i++){
			for(int j=0;j<data[0].length;j++){
				if(j!=data[0].length-1)
					System.out.print(data[i][j]+" ");
				else
					System.out.print(data[i][j]);
			}

				System.out.println("");
		}
		System.out.println("");
	}
	public static void main(String[] args){
		MyMatrix B=new MyMatrix(new int[][]{{1,2,3},{4,5,6}});
		B.print();
	}
}

