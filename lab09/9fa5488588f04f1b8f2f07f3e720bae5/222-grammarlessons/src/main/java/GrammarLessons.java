import java.util.*;
public class GrammarLessons {
    /**
     *
     * @param  sentence
     *
     * @return answer "YES"or"NO"
     */
    public static String solve(String sentence ) {
        /*判断类型*/
        String[] list = sentence.split(" ");
        int[] type = new int[list.length];
        String[] str = {"lios", "liala", "etr", "etra", "initis", "inites"};
        int x = -1,y=0;
        for (String s : list) {
            y=0;
            x += 1;
            for (int i = 0; i < 6; i++) {
                if (s.endsWith(str[i])) {
                    y=1;
                    type[x] = i + 1;
                    break;
                }
            }
            if(y==0)
                return "NO";
        }
        /*判断顺序*/
        for (int j = 0; j < type.length - 1; j++) {
            if (type[j] > type[j + 1]){

                return "NO";}
        }
        /*一个名词或一个单词*/
        int search = 0,count=0,re=1;
        for (int k = 0; k < type.length; k++) {
            if (type[k] == 3 || type[k] == 4) {
                search = 1;
                count += 1;
            }
        }
        if(!(search==1&&count==1)) {

            re=0;
        }
        if(type.length==1)
            re=1;
        if(re==0)
            return "NO";
        /*相同阴阳性*/
        if(type[0]%2!=0){
            for(int t=0;t<type.length;t++){
                if(type[t]%2==0){

                    return "NO";
                }
            }
        }
        else {
            for(int t=0;t<type.length;t++){
                if(type[t]%2!=0){

                    return "NO";
                }
            }
        }

        return "YES";
    }

}
