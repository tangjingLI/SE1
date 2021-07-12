import java.util.ArrayList;
import java.util.List;
public class DisappearedNumbers {
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		int len=nums.length;
		ArrayList<Integer> mylist=new ArrayList<Integer>();
		for(int m=1;m<=len;m++){
			boolean b=true;
			for(int t:nums){
				if(t==m){
					b=false;
					break;
				}
			}
			if(b){
				mylist.add(m);
			}
		}
		for(int u:mylist){
			System.out.println(u);
		}
		return mylist;
	}
	public static void main(String[] args){
		findDisappearedNumbers(new int[]{1,3,4,5,5,5,7});
	}
}
