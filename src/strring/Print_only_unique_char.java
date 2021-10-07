//wap to print only unique character in the given character
//input-MANDYA output-MNDY
package strring;


import java.util.LinkedHashSet;


public class Print_only_unique_char {

	public static void main(String[] args) {
		String s="MANDYA";
		//1.Create a object of set and add all the char & give string into set . 
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
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
		//4.check the condition for unique
		if(count==1)
		System.out.print(ch);
	}

}
}
