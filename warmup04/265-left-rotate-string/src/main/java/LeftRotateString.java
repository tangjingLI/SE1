/*package nju.edu.software.Exercise060_LeftRotateString;*/

public class LeftRotateString {
	public static String leftrotate(String str, int k){
		if(str.equals(""))
			return "";
		int k1=k%str.length();
		String a=str.substring(0,k1);
		String b=str.substring(k1);
		String re=b+a;
		return re;
	}
	public static void main(String[] args){
		System.out.println(leftrotate(new String("ABCDEFG"),3));
	}
}
