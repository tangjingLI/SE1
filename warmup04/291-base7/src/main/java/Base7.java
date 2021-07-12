public class Base7 {

	public static String convertToBase7(int num) {
		int sum=1;
		int a,b,c,e=1;

		if(num<0){
			e=0;
			num=-num;
		}
		int mi=num;
		do {
			a=num/7;
			b = num % 7;
			sum = sum * 10 + b;
			num/=7;
		}while(a!=0);

		int qwq=0;
		do{
			c=sum%10;
			qwq=qwq*10+c;
			sum/=10;
		}while(sum!=0);
		String re;
		if(e==1)
			re=String.valueOf((qwq-1)/10);
		else
			re=String.valueOf(((qwq-1)/10)*(-1));
		return re ;
	}

}
