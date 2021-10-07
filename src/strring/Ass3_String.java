package strring;

import java.util.LinkedList;

public class Ass3_String {

	public static void main(String[] args) {
		String s="Welcome to TYSS company";
	     String[] sen = s.split(" ");
	     LinkedList<String> l =new LinkedList<String>();
	    for(int i=sen.length-1;i>=0;i--) {
	    	l.add(sen[i]);
		}
	   
		for(String str:l) {
			System.out.print(str+" ");
		}
	}
}
