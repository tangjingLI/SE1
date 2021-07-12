
public class Arithmetic {

	public static String arithmetic(String s) {
		try {
			String[] mylist = s.split(" ");
			long a = Long.parseLong(mylist[0]);
			long b = Long.parseLong(mylist[1]);
			if (mylist[2].equals(String.valueOf("+"))) {

				long c = a + b;
				String d = String.valueOf(a);
				String f = String.valueOf(b);
				String g = String.valueOf(c);
				String re = d + "+" + f + "=" + g;
				return re;
			}
			if (mylist[2].equals(String.valueOf("-"))) {

				long c = a - b;
				String d = String.valueOf(a);
				String f = String.valueOf(b);
				String g = String.valueOf(c);
				String re = d + "-" + f + "=" + g;
				return re;
			}


			if (mylist[2].equals(String.valueOf("*"))) {

				long c = a * b;
				String d = String.valueOf(a);
				String f = String.valueOf(b);
				String g = String.valueOf(c);
				String re = d + "*" + f + "=" + g;
				return re;
			}

			if (mylist[2].equals(String.valueOf("/"))) {

				long c = a / b;
				String d = String.valueOf(a);
				String f = String.valueOf(b);
				String g = String.valueOf(c);
				String re = d + "/" + f + "=" + g;
				return re;
			}

		} catch (Exception e) {
			return "wrong";
		}
		return "wrong";
	}
	public  static  void main(String[] args){
		arithmetic("3 5 +");
	}
}