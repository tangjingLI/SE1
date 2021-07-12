import java.util.*;
import java.io.*;
public class GradesHistogram {
	/**
	 * 编写该方法对文件进行处理，并打印直方图，可添加新的方法
	 * @param fileName 处理的文件名
	 */
	public static void histogram(String fileName) throws FileNotFoundException {
		Scanner fr = new Scanner(new FileReader(new File(fileName)));
		int num = fr.nextInt();

		int[] in = new int[num];
		for (int i = 0; i < in.length; i++) {
			in[i] = fr.nextInt();
		}
		int count=0;
		for (int j = 0; j < 10; j++) {
			count=0;
			if (j == 0) {
				System.out.print(" 0 -  9:");
			}
			else if(j==9){
				System.out.print("90 -100:");
			}
			else {
				System.out.printf("%d - %d:",10*j,10*(j+1)-1);
			}
			if(j!=9){
				for(int k=0;k<in.length;k++){
					if(in[k]<=10*(j+1)-1 && in[k]>=10*j){
						count+=1;
					}
				}
			}
			else{
				for(int k=0;k<in.length;k++){
					if(in[k]<=10*(j+1) && in[k]>=10*j){
						count+=1;
					}
				}
			}
			for(int n=0;n<count;n++){
				System.out.print("*");
			}
			if(j!=9)
				System.out.println("");
		}
	}
}
