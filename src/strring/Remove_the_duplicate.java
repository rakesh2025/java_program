//not complited 
//error
package strring;

import java.util.LinkedHashSet;

public class Remove_the_duplicate {

	public static void main(String[] args) {
		String s="MANDYA";
		LinkedHashSet<Character> ch=new LinkedHashSet<Character>();
	 
		for(int i=0;i<s.length();i++) {
			ch.add(s.charAt(i));
		
		}
		for(Character c:ch) {
			System.out.print(c);
		}
	}

}

