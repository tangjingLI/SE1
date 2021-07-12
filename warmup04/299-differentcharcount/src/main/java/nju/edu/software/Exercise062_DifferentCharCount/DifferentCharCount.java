package nju.edu.software.Exercise062_DifferentCharCount;

import java.util.ArrayList;

public class DifferentCharCount {
	public static int count(String str){
		ArrayList<String> my=new ArrayList<String>();
		my.add(null);
		char[] arr=str.toCharArray();
		int k=1,count=0;
		for(int i=0;i<arr.length;i++){
			k=1;
			for(int j=0;j<my.size();j++){
				if(String.valueOf(arr[i]).equals(my.get(j))) {
					k = 0;
					break;
				}
			}
			if(k==1){
				count+=1;
				my.add(String.valueOf(arr[i]));
			}
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(count(new String("abcdd123")));
	}
}
