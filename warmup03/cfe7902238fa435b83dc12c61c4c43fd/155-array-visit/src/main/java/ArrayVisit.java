public class ArrayVisit {
	
	public static int[] reverseArray(int[] array){
		int len=array.length;
		int[] mylist=new int[len];
		for(int i=0;i<len;i++){
			mylist[i]=array[len-1-i];
		}
		return mylist;

	}

}
