import java.util.Arrays;
import java.util.HashMap;

public class ContainsDuplicate {

	public static boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		for(int i=0;i<nums.length-1;i++){
			if(nums[i]==nums[i+1]){

				return true;
			}
		}
		return false;
		
    }
    public static void main(String[] args){
		containsDuplicate(new int[]{2,3,4,5,5,6});
	}
}