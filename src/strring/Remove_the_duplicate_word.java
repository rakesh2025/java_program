//wap to remove the duplicate word

package strring;


import java.util.LinkedHashSet;


public class Remove_the_duplicate_word {

	public static void main(String[] args) {
		String s="welcome to testyantra to work";
		String[] str = s.split(" ");
		LinkedHashSet<String> ss=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++) {
			ss.add(str[i]);
	}
for(String word:ss) {
	System.out.print(word+" ");
}
}
}
