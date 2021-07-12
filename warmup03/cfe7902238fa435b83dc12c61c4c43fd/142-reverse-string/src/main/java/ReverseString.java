/*
Exercise ReverseString: Write a program called ReverseString, which prompts user for 
a String, and prints the reverse of the String. 

For a String called inStr, you can use inStr.length() to get the length of the 
String; and inStr.charAt(index) to retrieve the char at the index position, 
where index begins with 0.

Enter a String: abcdef
Ouput:"fedcba".

*/

import java.io.*;
public class ReverseString{
	
	 static String reverseString(String s){
		
		char[] mylist1;
        char[] mylist2=new char[s.length()];
		mylist1=s.toCharArray();
		int i,j=0;
		for(i=s.length()-1;i>=0;i--) {
            mylist2[j]=mylist1[i];
            j+=1;
        }
		String m=new String(mylist2);
        return m;
		
	}
	
}
