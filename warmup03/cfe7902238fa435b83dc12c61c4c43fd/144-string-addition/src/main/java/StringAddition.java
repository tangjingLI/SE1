public class StringAddition {

    public static String add(String s1, String s2) {
        long a=Long.parseLong(s1);
        long b=Long.parseLong(s2);
        long c=a+b;
        String d=String.valueOf(c);
        System.out.print(d);
        return d;
    }
    public static void main (String[] args){
        add("1","2");
    }
}