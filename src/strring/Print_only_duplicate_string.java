package strring;

import java.util.HashSet;


public class Print_only_duplicate_string {

	public static void main(String[] args) {
		String s="welcome to tyss to work";
		String[] str = s.split(" ");
		//1.Create a object of set and add all the char & give string into set . 
		HashSet<String> hs=new HashSet<String>();
		for(int i=0;i<str.length;i++) {
			hs.add(str[i]);
		}
		System.out.println(hs);
		for(String ch:hs) {
			int count=0;
			for(int j=0;j<str.length;j++) {
				//2.compare each char of set with all char of given string
				if(ch.equals(str[j])){
					//3. if matching increase the count
					count++;
				}
			}
			//4.check the condition for duplicate
			if(count>1)
				System.out.println(ch+":"+count);
		}

	}
}
