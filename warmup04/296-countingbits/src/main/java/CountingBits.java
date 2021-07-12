
public class CountingBits {
    static int er (int n){
        int a,b;
        int qwq=0,sum=1;
        do{
            a=n%2;
            sum=sum*10+a;
            n/=2;
        }while (n!=0);
        do{
            b=sum%10;
            qwq=qwq*10+b;
            sum/=10;
        }while (sum!=0);
        return (qwq-1)/10;
    }
	public static int[] countBits(int num) {
        int m,count;
        int[] my=new int[num+1];
        for(int i=0;i<=num;i++){
            count=0;
         m=er(i);
        char[] name=(String.valueOf(m)).toCharArray();
        for(int j=0;j<name.length;j++){
            if(name[j]=='1')
                count+=1;
        }
        my[i]=count;
        }
	    return my;
    }
	   public static void main(String[] args){
        int[] test=countBits(5);
        for(int i=0;i<test.length;i++){
            System.out.println(test[i]);
        }
       }
}