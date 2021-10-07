//wap to  find the no of occurrence of each word
package strring;


import java.util.LinkedHashSet;

public class Noof_Accurance_String {

	public static void main(String[] args) {
		String s="welcome to testyantra to work";
		String[] str = s.split(" ");
		//1.Create a object of set and add all the char & give string into set . 
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++) {
			hs.add(str[i]);
		}
		System.out.println(hs);
		for(String word:hs) {
			int count=0;
		for(int j=0;j<str.length;j++) {
			//2.compare each char of set with all char of given string
			if(word.equals(str[j])){
			//3. if matching increase the count
			count++;
			}
		}
		//4.print both char and count
		System.out.println(word+":"+count);
	}


	}

}
