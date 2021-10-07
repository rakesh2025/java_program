package strring;

import java.util.LinkedList;

public class Ass4_String_parten {

	public static void main(String[] args) {
		String c="ab12@c4%5";
	int count=0;
	LinkedList<Character> li=new LinkedList<Character>();
	for(int i=0;i<c.length();i++) {
		li.add(c.charAt(i));
	}
	 
for(int j=0;j<c.length();j++) {
	//if(li[j]>0) {
	//count=count+s.charAt(j);
	System.out.println(count);
}
	}

}
