package nju.edu.software.Exercise054_FindNumInArray;

public class FindNumInArray {
	public boolean Find(int[][] array, int num){
		for(int i=0;i<array.length;i++){
			if(num>=array[i][0]&&num<=array[i][array[i].length-1]){
				for(int j=0;j<array[i].length;j++){
					if(num==array[i][j])
						return true;
				}
			}
		}
		return false;
	}
}
