package edu.nju;
import java.util.*;
/**
 * 实现矩阵的加法、乘法以及控制台输出
 * 其中加法和乘法需要有两种实现方式
 * 1.传入一个矩阵进行2个矩阵的操作
 * 2.从控制台（console）读入一个矩阵，再进行操作
 * 所有的数据均为int型
 * 输入数据均默认为正确数据，不需要对输入数据进行校验
 * @author Ray Liu & Qin Liu
 */
public class MatrixCalculation {

	/**
	 * 实现矩阵加法，返回一个新的矩阵
	 * @return result matrix = A + B
	 */
	public int[][] plus(int[][] A, int[][] B){
		try{
			int[][] result=new int[A.length][A[0].length];
			for(int i=0;i<A.length;i++){
				for(int j=0;j<A[0].length;j++){
					result[i][j]=A[i][j]+B[i][j];

				}
			}
			return result;
		}
		catch(Exception e){
			return new int[0][0];
		}

		// TODO
	}

	/**
	 * 实现矩阵乘法，返回一个新的矩阵
	 * @return result matrix = A * B
	 */
	public int[][] times(int[][] A, int[][] B){
		try{
			int[][] result=new int[A.length][B[0].length];
			for(int i=0;i<A.length;i++){
				for(int j=0;j<B[0].length;j++){
					result[i][j]=0;
					for(int k=0;k<A[0].length;k++){
						result[i][j]+=A[i][k]*B[k][j];
					}
				}
			}
			return result;
		}
		catch(Exception e){
			return new int[0][0];
		}

		// TODO
	}

	/**
	 * 从控制台读入矩阵数据，进行矩阵加法，读入数据格式如下：
	 * m n
	 * m * n 的数据方阵，以空格隔开
	 * 连续读入2个矩阵数据
	 * example:
	 * 4 3
	 * 1 2 3
	 * 1 2 3
	 * 1 2 3
	 * 1 2 3
	 * 4 3
	 * 1 2 3
	 * 1 2 3
	 * 1 2 3
	 * 1 2 3
	 * 返回一个新的矩阵
	 */
	public int [][] plusFromConsole(){
		try{
			Scanner scan=new Scanner(System.in);
			int i=scan.nextInt();
			int j=scan.nextInt();
			int[][]A=new int[i][j];
			scan.nextLine();
			for(int m=0;m<i;m++) {
				for (int n = 0; n < j; n++) {
					A[m][n] = scan.nextInt();
				}
				scan.nextLine();
			}
			i=scan.nextInt();
			j=scan.nextInt();
			int[][]B=new int[i][j];
			scan.nextLine();
			for(int m=0;m<i;m++){
				for(int n=0;n<j;n++) {
					B[m][n] = scan.nextInt();
				}
				scan.nextLine();
			}
			int[][] result=new int[A.length][A[0].length];
			for( i=0;i<A.length;i++){
				for( j=0;j<A[0].length;j++){
					result[i][j]=A[i][j]+B[i][j];
					System.out.print(result[i][j]+" ");
				}
				System.out.println("");
			}

			return result;
		}
		catch(Exception e){
			return new int[0][0];
		}

		// TODO
	}

	/**
	 * 输入格式同上方法相同
	 * 实现矩阵的乘法
	 * 返回一个新的矩阵
	 */
	public int[][] timesFromConsole(){
		try{
			Scanner scan=new Scanner(System.in);
			int i=scan.nextInt();
			int j=scan.nextInt();
			int[][]A=new int[i][j];
			scan.nextLine();
			for(int m=0;m<i;m++) {
				for (int n = 0; n < j; n++) {
					A[m][n] = scan.nextInt();
				}
				scan.nextLine();
			}
			i=scan.nextInt();
			j=scan.nextInt();
			int[][]B=new int[i][j];
			scan.nextLine();
			for(int m=0;m<i;m++){
				for(int n=0;n<j;n++){
					B[m][n]=scan.nextInt();
				}
				scan.nextLine();
			}

			int[][] result = new int[A.length][B[0].length];
			for ( i = 0; i < A.length; i++) {
				for ( j = 0; j < B[0].length; j++) {
					result[i][j] = 0;
					for (int k = 0; k < A[0].length; k++) {
						result[i][j] += A[i][k] * B[k][j];

					}
				}
			}
			return  result;
		}
		catch(Exception e){
			return new int[0][0];
		}

		// TODO
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
	public void print(int[][] A){
		int w=A.length;
		int e=A[0].length;
		System.out.println("");
		for(int t=0;t<w;t++){
			for(int b=0;b<e;b++){
				if(b!=e-1)
					System.out.print(A[t][b]+" ");
				else{
					if(t!=w-1)
						System.out.println(A[t][b]);
					else
						System.out.print(A[t][b]);
				}
			}
		}
		System.out.println("");
		// TODO
	}
}
