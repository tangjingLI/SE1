import java.lang.reflect.Array;
import java.util.ArrayList;

public class IsomorphicStrings {

	public static boolean isIsomorphic(String s, String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		char A[]=s.toCharArray();
		char B[]=t.toCharArray();
		ArrayList<ArrayList<Integer>> index1=new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> index2=new ArrayList<ArrayList<Integer>>();

		for(int i=0;i<A.length;i++){
			index1.add(new ArrayList<Integer>());
			for(int j=0;j<A.length;j++){
				if(A[i]==A[j]){
					(index1.get(i)).add(j);
				}
			}
		}
		for(int u=0;u<B.length;u++) {
			index2.add(new ArrayList<Integer>());
			for (int v = 0; v< B.length; v++) {
				if (B[u] == (B[v])) {
					(index2.get(u)).add(v);

				}
			}

		}
		try {
			for (int m = 0; m < index1.size(); m++) {
				for (int n = 0; n < (index1.get(m)).size();n++){
					if(!((index1.get(m)).get(n)==(index2.get(m)).get(n))){
						return false;
					}
				}
			}
		}
		catch (Exception e){
			return false;
		}
		return true;
	}
	public static void main(String[] args){
		String s="egg";
		String t="add";
		System.out.println(isIsomorphic(s,t));
	}
}
