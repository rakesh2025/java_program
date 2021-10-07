//wap to print only unique character in the given character
//input-MANDYA output-MNDY
package strring;


import java.util.LinkedHashSet;


public class Print_only_unique_Word {

	public static void main(String[] args) {
		String s="welcome to testyantra to work";
		String[] str = s.split(" ");
		//1.Create a object of set and add all the char & give string into set . 
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++) {
			hs.add(str[i]);
		}
		
		for(String ch:hs) {
			int count=0;
		for(int j=0;j<str.length;j++) {
			//2.compare each char of set with all char of given string
			if(ch.equals(str[j])){
			//3. if matching increase the count
			count++;
			}
		}
		//4.check the condition for unique
		if(count==1)
		System.out.print(ch+" ");
	}

}
}
