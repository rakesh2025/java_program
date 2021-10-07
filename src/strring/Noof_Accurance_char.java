package strring;

import java.util.HashSet;


public class Noof_Accurance_char {

	public static void main(String[] args) {
		String s="MAHABHARAT";
		//1.Create a object of set and add all the char & give string into set . 
		HashSet<Character> hs=new HashSet<Character>();
		for(int i=0;i<s.length();i++) {
			hs.add(s.charAt(i));
		}
		System.out.println(hs);
		for(char ch:hs) {
			int count=0;
		for(int j=0;j<s.length();j++) {
			//2.compare each char of set with all char of given string
			if(ch==s.charAt(j)){
			//3. if matching increase the count
			count++;
			}
		}
		//4.print both char and count
		System.out.println(ch+":"+count);
	}

}
}
