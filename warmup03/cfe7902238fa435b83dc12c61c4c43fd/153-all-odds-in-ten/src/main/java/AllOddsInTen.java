
public class AllOddsInTen {
	public int[] allOdds(){
		int[] mylist=new int[5];
		int m=0;
		for(int i=1;i<10;i++){
			if(i%2!=0){
				mylist[m]=i;
				m+=1;
			}
		}
		return mylist;
	}
}
