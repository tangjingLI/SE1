
public class GetOddIndexArray {
	public static int[] getNewArray(int[] array){

		int[] mylist=new int[array.length/2];

		int m=0;
		for(int i=1;i<array.length;i+=2){
			mylist[m]=array[i];
			m+=1;
		}

		return mylist;
	}
	public  static void main(String[] args){

		getNewArray(new int[]{1,2,3,4,5,6});
	}
}
