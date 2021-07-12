
public class PerfectNumber {
	 public static boolean checkPerfectNumber(int num) {
	        int sum=1;
	        for(int i=2;i<num;i++){
	        	if(num%i==0){
	        		sum+=i;
				}
			}
	        if(num==sum)
	        	return true;
		 return false;
	 }
	 public static void main(String[] args){
	 	System.out.println(checkPerfectNumber(6));
	 }
}
