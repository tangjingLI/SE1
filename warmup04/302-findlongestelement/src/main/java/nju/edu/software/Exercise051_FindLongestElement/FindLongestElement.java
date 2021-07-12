package nju.edu.software.Exercise051_FindLongestElement;

public class FindLongestElement {
	public String find(String[] strArray){
		int max=0,index=0;
		for(int i=0;i<strArray.length;i++){
			if(max<strArray[i].length()){
				max=strArray[i].length();
				index=i;
			}
		}
		return strArray[index];
	}
}
