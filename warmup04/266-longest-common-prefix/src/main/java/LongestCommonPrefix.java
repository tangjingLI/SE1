
public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) {
		String sub="",re="";
		int k=1;
		for(int i=strs[0].length();i>0;i--){
			k=1;
			sub=strs[0].substring(0,i);
			for(int j=1;j<strs.length;j++){
				if(!(strs[j]).startsWith(sub)){
					k=0;
					break ;
				}
			}
			if(k==1){
				re=sub;
				break ;
			}
		}
		return re;
	}
	public static void main(String[] args){
		System.out.println(longestCommonPrefix(new String[]{"aaaaerf","aaaaoim","aaaaljkhk"}));
	}
}
