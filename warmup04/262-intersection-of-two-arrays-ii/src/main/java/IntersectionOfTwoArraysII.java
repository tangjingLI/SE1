import java.util.*;

public class IntersectionOfTwoArraysII {

	public static int[] intersect(int[] nums1, int[] nums2) {
		int[] result={};
		int op=1;
		int[] a,b,c,d;
		if(nums1.length>=nums2.length){
			a=nums1;
			b=nums2;
		}
		else {
			a=nums2;
			b=nums1;
		}
		for(int i=b.length;i>=0;i--){
			for(int j=0;j<=b.length-i;j++){
				c=Arrays.copyOfRange(b,j,i+j);
				for(int k=0;k<=a.length-i;k++){
					d=Arrays.copyOfRange(a,k,k+i);
					if(Arrays.equals(c,d)){
						op=0;
						result=c;
						return result;
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int m[]={1,2,2,1};
		int n[]={2,2};
		int[] s=intersect(m,n);
		System.out.println(s.length);

		}
	}

